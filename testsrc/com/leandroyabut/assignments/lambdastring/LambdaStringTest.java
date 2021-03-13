package com.leandroyabut.assignments.lambdastring;

import org.junit.Test;
import static org.junit.Assert.*;

public class LambdaStringTest {

    @Test
    public void sortByLengthTest() {

        LambdaStringSorter sorter = new LambdaStringSorter();

        String[] strings = new String[]{
                "AAAA",
                "A",
                "AAA",
                "AAAAA",
                "AA"
        };

        String[] expectedSorted = new String[]{
                "A",
                "AA",
                "AAA",
                "AAAA",
                "AAAAA"
        };

        assertArrayEquals(expectedSorted, sorter.sortByLength(strings));

    }

    @Test
    public void sortByLengthReverseTest() {

        LambdaStringSorter sorter = new LambdaStringSorter();

        String[] strings = new String[]{
                "AAAA",
                "A",
                "AAA",
                "AAAAA",
                "AA"
        };

        String[] expectedSorted = new String[]{
                "AAAAA",
                "AAAA",
                "AAA",
                "AA",
                "A"
        };

        assertArrayEquals(expectedSorted, sorter.sortByLengthReverse(strings));

    }

    @Test
    public void sortAlphabeticallyFirstCharTest () {

        LambdaStringSorter sorter = new LambdaStringSorter();

        String[] strings = new String[]{
                "Office",
                "Banana",
                "Apple",
                "Account",
                "Boring",
                "Colony",
                "Caring"
        };

        String[] expectedStrings = new String[]{
                "Apple",
                "Account",
                "Banana",
                "Boring",
                "Colony",
                "Caring",
                "Office"
        };

        assertArrayEquals(expectedStrings, sorter.sortAlphabeticallyFirstChar(strings));

    }

    @Test
    public void sortByETest() {

        LambdaStringSorter sorter = new LambdaStringSorter();

        String[] strings = new String[] {
                "epic",
                "Account",
                "barcode",
                "marker",
                "Alpha",
                "mask"
        };

        String[] expectedStrings = new String[] {
                "epic",
                "barcode",
                "marker",
                "Account",
                "Alpha",
                "mask"
        };

        assertArrayEquals(expectedStrings, sorter.sortByE(strings));
    }

    @Test
    public void sortByEHelperTest() {

        LambdaStringSorter sorter = new LambdaStringSorter();

        String[] strings = new String[] {
                "epic",
                "Account",
                "barcode",
                "marker",
                "Alpha",
                "mask"
        };

        String[] expectedStrings = new String[] {
                "epic",
                "barcode",
                "marker",
                "Account",
                "Alpha",
                "mask"
        };

        assertArrayEquals(expectedStrings, sorter.sortByEHelper(strings));
    }

}
