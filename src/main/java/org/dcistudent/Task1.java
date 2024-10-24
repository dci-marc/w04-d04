package org.dcistudent;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy h:mma");
        formatter = formatter.withZone(ZoneId.of("CET"));
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("Feb 14 2021 8:30AM", formatter);
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern(
                "EEE MMM dd HH:mm:ss z yyyy"
        );
        System.out.println(zonedDateTime.format(formatterOutput));
    }
}
