package com.leandroyabut.assignments.randomdate;

import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDate;

public class LastThursdayTest {

    @Test
    public void getLastThursdayTest() {
        LocalDate testDate = LocalDate.of(2021, 3, 9);
        LocalDate expectedDate = LocalDate.of(2021, 3, 4);

        assertEquals(expectedDate, new LastThursday().getLastThursday(testDate));
    }

}
