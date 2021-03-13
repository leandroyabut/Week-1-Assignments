package com.leandroyabut.assignments.oddevenlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenPrinter {

    int[] numbers;

    public OddEvenPrinter(int[] numbers) {
        this.numbers = numbers;
    }

    public String[] createOddEvenList() {

        List<String> list = new ArrayList<>();

        Arrays.stream(numbers).forEach(n -> {
            if(n % 2 == 0) list.add("e" + n);
            else list.add("o" + n);
        });

        String[] stringsList = new String[list.size()];
        list.toArray(stringsList);

        return stringsList;

    }

    public void printOddEvenList() {
        String[] list = createOddEvenList();
        Arrays.stream(list).forEach(this::printWithComma);
    }

    private void printWithComma(String i) {
        System.out.print(i + ",");
    }
}
