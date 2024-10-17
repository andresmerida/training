package org.andres.days.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateFormatter {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDataTime = now.format(DATE_TIME_FORMATTER);
        System.out.println(formattedDataTime);
        System.out.println(now.format(DATE_FORMATTER));
    }
}
