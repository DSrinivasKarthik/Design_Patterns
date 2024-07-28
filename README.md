# Educational Initiatives (Ei) Coding Exercises 2024-25

## Repository Structure

- **EX1-DESIGN_PATTERNS**: Contains the implementations of six different software design patterns.
- **EX2-MINI_PROJECT**: Contains the implementation of the Astronaut Daily Schedule Organizer mini-project.

Each exercise is organized in its own folder with detailed instructions and code files.

## Exercise 1: Design Patterns Implementation

This folder demonstrates implementations of various design patterns. There are two use cases for each of the three design pattern categories: Creational, Structural, and Behavioral. Each use case is implemented in Java.

### Creational Design Patterns

1. **Document Maker (Factory Method)**
   - **Use Case**: Creating different types of documents (PDF, Text, Word) without specifying the exact class of the object.
   - **Classes**: `DocumentMaker`, `PDFDocument`, `TextDocument`, `WordDocument`

2. **Game Settings (Singleton)**
   - **Use Case**: Managing global game settings (e.g., volume, resolution) consistently across the game.
   - **Classes**: `GameSettings`, `Main`

### Structural Design Patterns

1. **Home Theater (Facade)**
   - **Use Case**: Simplifying control of a complex home theater system with a unified interface.
   - **Classes**: `HomeTheaterFacade`, `Amplifier`, `DVDPlayer`, `Projector`, `Lights`

2. **Media Player (Adapter)**
   - **Use Case**: Adapting different media players with incompatible interfaces to work with a unified media player system.
   - **Classes**: `MediaPlayer`, `AdvancedMediaPlayer`, `MediaPlayerAdapter`, `VLCPlayer`, `MP4Player`

### Behavioral Design Patterns

1. **Gaming Chat (Observer)**
   - **Use Case**: Implementing a chat system where players receive messages from a chat room.
   - **Classes**: `ChatRoom`, `Player`, `Main`

2. **Game Character State (State)**
   - **Use Case**: Managing a game character's behavior based on its current state (standing, running, jumping).
   - **Classes**: `Character`, `State`, `StandingState`, `RunningState`, `JumpingState`

### Running the Examples

To run any of the examples, compile and execute the `Main` class in the respective directory. Follow the prompts to interact with the system and see the design pattern in action.

## Exercise 2: Astronaut Daily Schedule Organizer

This folder contains the implementation of a console-based application designed to help astronauts manage their daily tasks. The application supports adding, removing, and viewing tasks, with a focus on validating task times and priorities.

### Functional Requirements

1. **Add a Task**: Enter a description, start time, end time, and priority level. The system checks for conflicts with existing tasks.
2. **Remove a Task**: Remove a task by its description.
3. **View Tasks**: Display all tasks sorted by start time.
4. **Validate Inputs**: Ensure proper format for times and valid priority levels.

### Non-Functional Requirements

1. **Exception Handling**: Graceful handling of all errors and edge cases.
2. **Performance**: Optimized for efficient task management.
3. **Logging**: Implement basic logging to track actions and errors.

### Design Patterns Used

1. **Singleton Pattern**: Ensures only one instance of `ScheduleManager`.
2. **Factory Pattern**: Uses `TaskFactory` to create `Task` objects.
3. **Observer Pattern**: Recommended for future enhancements.

### Project Structure

- `Task.java`: Defines the task entity with properties like description, start time, end time, and priority.
- `TaskFactory.java`: Creates `Task` instances.
- `ScheduleManager.java`: Manages tasks, including adding, removing, and viewing tasks.
- `Utils.java`: Provides utility functions for time and priority validation.
- `Main.java`: Contains the main program loop and user interface logic.

### Usage Instructions

1. **Compile the Project (inside Ex2 folder)**:
   ```bash
   javac -d bin src/com/schedule/*.java
   ```

2. **Run the Application**:
   ```bash
   java -cp bin com.schedule.Main
   ```

3. **Menu Options**:
   - **Add Task**: Enter task details when prompted.
   - **Remove Task**: Enter the task description to remove.
   - **View Tasks**: Lists all scheduled tasks.
   - **Exit**: Terminates the application.

### Error Handling

1. **Invalid Time Format**: Displays an error if the time format is incorrect.
2. **Invalid Priority**: Shows an error if the priority level is not "High", "Medium", or "Low".
3. **Task Conflicts**: Alerts if a new task overlaps with an existing task.
4. **Task Not Found**: Informs if trying to remove a non-existent task.
## Conclusion

This repository aims to demonstrate my understanding of design patterns and coding skill. 

---

