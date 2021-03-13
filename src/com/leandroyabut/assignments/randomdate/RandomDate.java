package com.leandroyabut.assignments.randomdate;

import java.time.LocalDate;
import java.util.Random;

public class RandomDate {

    private Random random;
    private LocalDate localDate;

    public RandomDate() {
        random = new Random(System.currentTimeMillis());
        localDate = LocalDate.of(generateRandomNumber(1980, 2021), generateRandomNumber(1, 12), generateRandomNumber(1, 28));
    }

    private int generateRandomNumber(int min, int max) {
        return random.nextInt(max + 1 - min) + min;
    }

    public LocalDate getDate() {
        return localDate;
    }

}
