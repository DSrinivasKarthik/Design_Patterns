package com.schedule;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public String addTask(Task task) {
        for (Task t : tasks) {
            if (Utils.isOverlapping(t, task)) {
                return "Error: Task conflicts with existing task \"" + t.getDescription() + "\".";
            }
        }
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        return "Task added successfully. No conflicts.";
    }

    public boolean removeTask(String description) {
        return tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
