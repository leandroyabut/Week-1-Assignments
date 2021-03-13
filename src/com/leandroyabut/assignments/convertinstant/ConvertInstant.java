package com.leandroyabut.assignments.convertinstant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvertInstant {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        Instant fromZoneDateTime = zonedDateTime.toInstant();

        System.out.println(instant.toString());
        System.out.println(zonedDateTime.toString());
        System.out.println(fromZoneDateTime.toString());
    }

}
