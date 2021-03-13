package com.leandroyabut.assignments.birthday;

import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Birthday {

    public static void main(String[] args) {

        Birthday birthday = new Birthday();
        LocalDateTimeStringConverter converter = new LocalDateTimeStringConverter();
        System.out.println(converter.toString(birthday.getBirthday()));

    }

    public LocalDateTime getBirthday() {
        LocalDate date = LocalDate.of(1999, 8, 7);
        LocalTime time = LocalTime.of(12,30,5, 425);

        return LocalDateTime.of(date, time);
    }

}
