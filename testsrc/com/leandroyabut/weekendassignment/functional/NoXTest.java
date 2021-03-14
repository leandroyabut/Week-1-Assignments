package com.leandroyabut.weekendassignment.functional;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NoXTest {

    private final NoX noX = new NoX();

    @Test
    public void removeXTest() {
        String string = "axbxc";
        String expected = "abc";

        assertEquals(expected, noX.removeX(string));
    }

    @Test
    public void emptyRemoveXTest() {
        String string = "x";
        String expected = "";

        assertEquals(expected, noX.removeX(string));
    }

    @Test
    public void noXListTest() {
        List<String> strings = Arrays.asList("aax", "bb", "cxc");
        List<String> expectedStrings = Arrays.asList("aa", "bb", "cc");

        assertEquals(expectedStrings, noX.noXList(strings));
    }

    @Test
    public void emptyNoXListTest() {
        List<String> strings = Arrays.asList("x", "xx", "xxx");
        List<String> expectedString = Arrays.asList("", "", "");

        assertEquals(expectedString, noX.noXList(strings));
    }
}
