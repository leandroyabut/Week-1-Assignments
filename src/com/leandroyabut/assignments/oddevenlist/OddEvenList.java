package com.leandroyabut.assignments.oddevenlist;

import java.util.Random;

public class OddEvenList {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }

        OddEvenPrinter printer = new OddEvenPrinter(numbers);
        printer.printOddEvenList();

    }

}