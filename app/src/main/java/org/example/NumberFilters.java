package org.example;

import java.util.Arrays;

public class NumberFilters {

    public int[] evensOnly(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("Array cannot be null");
        return Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public int[] oddsOnly(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("Array cannot be null");
        return Arrays.stream(nums)
                .filter(n -> n % 2 != 0)
                .toArray();
    }
}
