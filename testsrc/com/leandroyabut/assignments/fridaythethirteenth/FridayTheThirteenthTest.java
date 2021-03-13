package com.leandroyabut.assignments.fridaythethirteenth;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class FridayTheThirteenthTest {

    @Test
    public void isFridayTheThirteenthTest() {
        FridayTheThirteenth ftt = new FridayTheThirteenth();
        LocalDate testDate = LocalDate.of(2020, 11, 13); // Friday the thirteenth in 2020

        assertTrue(ftt.isFridayTheThirteenth(testDate));
    }

}
