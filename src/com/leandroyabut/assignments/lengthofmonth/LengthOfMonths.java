package com.leandroyabut.assignments.lengthofmonth;

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class LengthOfMonths {

    public static void main(String[] args) {

        System.out.print("Please enter a year: ");

        Scanner scanner = new Scanner(System.in);
        Year year = Year.of(scanner.nextInt());

        for(int i = 1; i <= 12; i++) {
            Month currentMonth = year.atMonth(i).getMonth();
            System.out.println(currentMonth.name() + " has " + currentMonth.length(year.isLeap()) + " days...");
        }

        scanner.close();

    }

}
