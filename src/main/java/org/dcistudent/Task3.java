package org.dcistudent;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        dateTime = dateTime.minusDays(15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dateTime.format(formatter));

        // Bonus
        getDateTime(dateTime, "Europe/Dublin");
        getDateTime(dateTime, "Europe/Berlin");
        getDateTime(dateTime, "Africa/Johannesburg");
        getDateTime(dateTime, "America/Los_Angeles");
    }

    public static void getDateTime(ZonedDateTime dateTime, String timezone) {
        HashMap<String, String> timezonesMapper = new HashMap<>();
        timezonesMapper.put("Europe/Dublin", "Irish");
        timezonesMapper.put("Europe/Berlin", "German");
        timezonesMapper.put("Africa/Johannesburg", "South African");
        timezonesMapper.put("America/Los_Angeles", "USA (west coast)");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        formatter = formatter.withZone(ZoneId.of(timezone));
        System.out.println(timezonesMapper.get(timezone) + " participants will meet at: " + dateTime.format(formatter));
    }
}
