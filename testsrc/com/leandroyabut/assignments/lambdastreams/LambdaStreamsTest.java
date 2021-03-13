package com.leandroyabut.assignments.lambdastreams;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class LambdaStreamsTest {

    @Test
    public void filtersAAndThreeTest() {
        LambdaStream filter = new LambdaStream();

        List<String> strings = new ArrayList<>();
        strings.add("Bad");
        strings.add("Cat");
        strings.add("America");
        strings.add("Mapping");
        strings.add("Alpha");

        List<String> expectedStrings = new ArrayList<>();
        expectedStrings.add("Bad");
        expectedStrings.add("Cat");

        assertArrayEquals(expectedStrings.toArray(), filter.filterAAndThree(strings).toArray());
    }

}
