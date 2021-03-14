package com.leandroyabut.weekendassignment.recursion;

import java.util.Arrays;

public class GroupSumClump {

    public static void main(String[] args) {
        GroupSumClump gsc = new GroupSumClump();
        int[] ints = new int[]{1, 4, 4, 4, 3, 8, 10};
        int[] targets = new int[]{5, 12, 7, 11, 21};

        for(int target : targets) {
            System.out.println(Arrays.toString(ints) + " " + target + " -> " + gsc.groupSumClump(0, ints, target));
        }
    }

    public boolean groupSumClump(int begin, int[] ints, int target) {

        int i = begin;
        int currentInt = 0;
        int len = ints.length;
        
        if(begin >= len) return target == 0; // Check if target has depleted to 0 when the array length is exhausted

        while(i < len && ints[begin] == ints[i]) { // Make sure sum is equal to all the same ints added together
            currentInt += ints[i];
            i++;
        }

        if(groupSumClump(i, ints, target - currentInt)) return true;
        return groupSumClump(i, ints, target);

    }

}
