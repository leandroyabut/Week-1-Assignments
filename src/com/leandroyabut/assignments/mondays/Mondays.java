package com.leandroyabut.assignments.mondays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class Mondays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        Year year = Year.of(scanner.nextInt());
        System.out.print("Enter a month (1 - Jan, 2 - Feb, ... , 12 - Dec): ");
        YearMonth month = year.atMonth(scanner.nextInt());
        int length = month.getMonth().length(year.isLeap());

        for(int i = 1; i <= length; i++) {
            LocalDate day = month.atDay(i);
            if(day.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                System.out.println(day.toString());
            }
        }

    }

}
