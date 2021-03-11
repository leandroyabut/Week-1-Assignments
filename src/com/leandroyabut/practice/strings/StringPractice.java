package com.leandroyabut.practice.strings;

public class StringPractice {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Apple");
        builder.append("Banana");
        builder.append("Orange");

        builder.reverse();

        System.out.println(builder.toString());
    }

}
