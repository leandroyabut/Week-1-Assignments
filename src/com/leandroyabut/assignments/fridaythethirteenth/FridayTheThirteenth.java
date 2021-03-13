package com.leandroyabut.assignments.fridaythethirteenth;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayTheThirteenth {

    public boolean isFridayTheThirteenth(LocalDate date) {
        return (date.getDayOfWeek().equals(DayOfWeek.FRIDAY) && date.getDayOfMonth() == 13);
    }

}
