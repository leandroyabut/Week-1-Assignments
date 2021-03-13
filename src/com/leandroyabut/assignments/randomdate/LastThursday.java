package com.leandroyabut.assignments.randomdate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LastThursday {

    public static void main(String[] args) {
        RandomDate randomDate = new RandomDate();
        LocalDate date = randomDate.getDate();
        LastThursday lastThursday = new LastThursday();
        LocalDate lastDate = lastThursday.getLastThursday(date);
        System.out.println(date.toString() + " " + date.getDayOfWeek().toString());
        System.out.println(lastDate.toString() + " " + lastDate.getDayOfWeek().toString());
    }

    public LocalDate getLastThursday(LocalDate date) {
        LocalDate lastThursday;
        int difference = DayOfWeek.THURSDAY.getValue() - date.getDayOfWeek().getValue(); // Difference between this dates day from Thursday of their week

        if(date.getDayOfWeek().equals(DayOfWeek.THURSDAY))
            lastThursday = date.minusDays(7); // If already Thursday, minus 1 week worth of date
        else lastThursday = date.minusDays(7 - difference); // If not Thursday, get a week minus the difference

        return lastThursday;
    }

}
