package com.leandroyabut.assignments.numbersum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSum {

    public static void main(String... args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        int numberCount = promptForNumber("How many numbers would you like to add? ", 2, 100);

        for(int i = 1; i <= numberCount; i++) {
            numbers.add(promptForNumber(i + ") Enter a number: ", Integer.MIN_VALUE, Integer.MAX_VALUE));
        }

        int sum = 0;

        for(int i : numbers) {
            sum += i;
        }

        System.out.println("Your sum is: " + sum);
    }

    /**
     *
     * @param message Prompt to print out
     * @param min Minimum range
     * @param max Maximum range
     * @return Number within range of min and max (inclusive)
     */
    public static int promptForNumber(String message, int min, int max) {

        Scanner scanner = new Scanner(System.in);
        int result;

        System.out.print(message);

        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number...");
            return promptForNumber(message, min, max);
        }

        if (result <= max && result >= min) {
            return result;
        }

        System.out.println("Input is out of range...");
        return promptForNumber(message, min, max);

    }

}
