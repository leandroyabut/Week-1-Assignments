package com.leandroyabut.assignments.oddevenlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class OddEvenPrinterTest {

    @Test
    public void createOddEvenListTest() {
        int[] numbers = new int[] {
                10, 25, 32, 71, 88
        };

        OddEvenPrinter printer = new OddEvenPrinter(numbers);

        String[] expectedOddEvenList = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if(number % 2 == 0) expectedOddEvenList[i] = "e" + number;
            else expectedOddEvenList[i] = "o" + number;
        }

        assertArrayEquals(expectedOddEvenList, printer.createOddEvenList());

    }

}
