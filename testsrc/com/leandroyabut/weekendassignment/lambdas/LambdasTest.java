package com.leandroyabut.weekendassignment.lambdas;

import org.junit.Test;
import static org.junit.Assert.*;

public class LambdasTest {

    private Lambdas lambdas = new Lambdas();

    @Test
    public void isOddSuccess() {
        assertTrue(check(lambdas.isOdd(), 3));
        assertTrue(check(lambdas.isOdd(), 5));
        assertTrue(check(lambdas.isOdd(), 9));
    }

    @Test
    public void isOddFail() {
        assertFalse(check(lambdas.isOdd(), 2));
        assertFalse(check(lambdas.isOdd(), 6));
        assertFalse(check(lambdas.isOdd(), 8));
    }

    @Test
    public void isPrimeSuccess() {
        assertTrue(check(lambdas.isPrime(), 7));
        assertTrue(check(lambdas.isPrime(), 13));
        assertTrue(check(lambdas.isPrime(), 17));
    }

    @Test
    public void isPrimeFail() {
        assertFalse(check(lambdas.isPrime(), 4));
        assertFalse(check(lambdas.isPrime(), 9));
        assertFalse(check(lambdas.isPrime(), 12));
    }

    @Test
    public void isPalindromeSuccess() {
        assertTrue(check(lambdas.isPalindrome(), 525));
        assertTrue(check(lambdas.isPalindrome(), 65356));
        assertTrue(check(lambdas.isPalindrome(), 1523251));
    }

    @Test
    public void isPalindromeFail() {
        assertFalse(check(lambdas.isPalindrome(), 125));
        assertFalse(check(lambdas.isPalindrome(), 6532));
        assertFalse(check(lambdas.isPalindrome(), 12256));
    }

    private boolean check(PerformOperation performOperation, int num) {
        return performOperation.isCorrect(num);
    }

}
