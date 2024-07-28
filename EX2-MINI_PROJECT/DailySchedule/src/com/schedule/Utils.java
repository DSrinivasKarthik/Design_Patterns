package com.schedule;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Utils {
    public static boolean isValidTime(String time) {
        try {
            LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isValidPriority(String priority) {
        return priority.equalsIgnoreCase("High") || 
               priority.equalsIgnoreCase("Medium") || 
               priority.equalsIgnoreCase("Low");
    }

    public static boolean isOverlapping(Task t1, Task t2) {
        LocalTime start1 = LocalTime.parse(t1.getStartTime());
        LocalTime end1 = LocalTime.parse(t1.getEndTime());
        LocalTime start2 = LocalTime.parse(t2.getStartTime());
        LocalTime end2 = LocalTime.parse(t2.getEndTime());
        return (start1.isBefore(end2) && start2.isBefore(end1));
    }
}
