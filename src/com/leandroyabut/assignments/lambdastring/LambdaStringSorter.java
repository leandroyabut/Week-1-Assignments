package com.leandroyabut.assignments.lambdastring;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaStringSorter {

    /**
     *
     * @param strings to sort
     * @return sorted
     */
    public String[] sortByLength(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        return strings;
    }

    /**
     *
     * @param strings to sort
     * @return sorted
     */
    public String[] sortByLengthReverse(String[] strings) {
        Arrays.sort(strings, (a, b) -> b.length() - a.length());
        return strings;
    }

    /**
     *
     * @param strings to sort
     * @return sorted
     */
    public String[] sortAlphabeticallyFirstChar(String[] strings) {
        Arrays.sort(strings, Comparator.comparing(a -> a.toUpperCase().charAt(0)));
        return strings;
    }

    /**
     *
     * @param strings to sort
     * @return sorted
     */
    public String[] sortByE(String[] strings) {
        Arrays.sort(strings, (a, b) -> {
            if(a.toLowerCase().contains("e") && !b.toLowerCase().contains("e")) return -1;
            return 0;
        });
        return strings;
    }

    /**
     *
     * @param strings to sort
     * @return sorted
     */
    public String[] sortByEHelper(String[] strings) {
        List<String> allEs = Arrays.stream(strings).filter(s -> s.contains("e")).collect(Collectors.toList());
        List<String> noEs = Arrays.stream(strings).filter(s -> !s.contains("e")).collect(Collectors.toList());
        List<String> sorted = new ArrayList<>();
        sorted.addAll(allEs);
        sorted.addAll(noEs);
        return sorted.toArray(strings);
    }

}
