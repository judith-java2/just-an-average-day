package org.example;

import java.util.Arrays;

public class NumberTransforms {

    public int[] addFive(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("Array cannot be null");
        return Arrays.stream(nums)
                .map(n -> n + 5)
                .toArray();
    }

    public int[] squareNumbers(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("Array cannot be null");
        return Arrays.stream(nums)
                .map(n -> n * n)
                .toArray();
    }
}
