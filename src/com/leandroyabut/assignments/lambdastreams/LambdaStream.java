package com.leandroyabut.assignments.lambdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStream {

    public List<String> filterAAndThree(List<String> strings) {
        return strings.stream().filter(s -> (s.contains("a") && s.length() == 3)).collect(Collectors.toList());
    }

}
