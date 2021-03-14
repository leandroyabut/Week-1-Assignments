package com.leandroyabut.weekendassignment.functional;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DoubledIntegersTest {

    private final DoubledIntegers doubledIntegers = new DoubledIntegers();

    @Test
    public void doubledTest() {
        int[] numbers = new int[]{3, 6, 8, 37, 102};
        int[] expectedNumbers = new int[]{6, 12, 16, 74, 204};

        for(int i = 0; i < numbers.length; i++) {
            assertEquals(expectedNumbers[i], check(doubledIntegers.doubled(), numbers[i]));
        }
    }

    @Test
    public void getDoubledListTest() {
        List<Integer> integers = Arrays.asList(10, 22, 107);
        List<Integer> expected = Arrays.asList(20, 44, 214);

        assertEquals(expected, doubledIntegers.getDoubledList(integers));
    }

    private int check(PerformOperation operation, int num) {
        return operation.get(num);
    }

}
