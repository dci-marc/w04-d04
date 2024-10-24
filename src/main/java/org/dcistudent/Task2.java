package org.dcistudent;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        long unixTimestamp = 1626430738L;
        LocalDateTime dateTime = LocalDateTime.ofInstant(
                Instant.ofEpochSecond(unixTimestamp), ZoneId.of("CET")
        );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);

        // Add hours
        dateTime = dateTime.plusHours(2);
        formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);

        // Subtract minutes
        dateTime = dateTime.minusMinutes(30);
        formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);
    }
}
