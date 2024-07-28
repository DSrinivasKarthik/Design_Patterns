# Astronaut Daily Schedule Organizer

## Overview
The Astronaut Daily Schedule Organizer is a console-based Java application designed to help astronauts manage their daily tasks. The application supports adding, removing, and viewing tasks, with a focus on validating task times and priorities. It utilizes design patterns to ensure effective task management.

## Functional Requirements
1. **Add a Task**: Enter a description, start time, end time, and priority level. The system checks for conflicts with existing tasks.
2. **Remove a Task**: Remove a task by its description, ignoring case sensitivity.
3. **View Tasks**: Display all tasks sorted by start time.
4. **Validate Inputs**: Ensure proper format for times and valid priority levels.

## Non-Functional Requirements
1. **Exception Handling**: Graceful handling of all errors and edge cases.
2. **Performance**: Optimized for efficient task management.
3. **Logging**: Implement basic logging to track actions and errors.

## Design Patterns
1. **Singleton Pattern**: Ensures only one instance of `ScheduleManager`.
2. **Factory Pattern**: Uses `TaskFactory` to create `Task` objects.
3. **Observer Pattern**: Not explicitly used but recommended for future enhancements.

## Project Structure
- `Task.java`: Defines the task entity with properties like description, start time, end time, and priority.
- `TaskFactory.java`: Creates `Task` instances.
- `ScheduleManager.java`: Manages tasks, including adding, removing, and viewing tasks.
- `Utils.java`: Provides utility functions for time and priority validation.
- `Main.java`: Contains the main program loop and user interface logic.

## Usage Instructions
1. **Compile the Project**:
   ```bash
   javac -d bin src/com/schedule/*.java
2. **Run the Application**:

   ```bash
    java -cp bin com.schedule.Main

3. **Menu Options**:

- Add Task: Enter task details when prompted.
- Remove Task: Enter the task description to remove.
- View Tasks: Lists all scheduled tasks.
- Exit: Terminates the application.

## Error Handling
1. Invalid Time Format: Displays an error if the time format is incorrect.
2. Invalid Priority: Shows an error if the priority level is not "High", "Medium", or "Low".
3. Task Conflicts: Alerts if a new task overlaps with an existing task.
4. Task Not Found: Informs if trying to remove a non-existent task.