package com.schedule;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Astronaut Daily Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:mm): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time (HH:mm): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority (High, Medium, Low): ");
                    String priority = scanner.nextLine();

                    if (!Utils.isValidTime(startTime) || !Utils.isValidTime(endTime)) {
                        System.out.println("Error: Invalid time format.");
                    } else if (!Utils.isValidPriority(priority)) {
                        System.out.println("Error: Invalid priority. Must be High, Medium, or Low.");
                    } else {
                        Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                        String result = manager.addTask(task);
                        System.out.println(result);
                    }
                    break;

                case 2:
                    System.out.print("Enter task description to remove: ");
                    String removeDescription = scanner.nextLine();
                    if (manager.removeTask(removeDescription)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Error: Task not found.");
                    }
                    break;

                case 3:
                    List<Task> tasks = manager.getTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks scheduled for the day.");
                    } else {
                        for (Task task : tasks) {
                            System.out.println(task);
                        }
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
