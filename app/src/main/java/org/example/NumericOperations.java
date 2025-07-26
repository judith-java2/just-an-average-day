package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;

public class NumericOperations {

    // For loop implementations
    public int maximumUsingForLoop(int[] nums) {
        validateArray(nums);
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) {
        validateArray(nums);
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    public int sumUsingForLoop(int[] nums) {
        validateNotNull(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double averageUsingForLoop(int[] nums) {
        validateArray(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    // Stream implementations
    public int maximumUsingStream(int[] nums) {
        validateArray(nums);
        return Arrays.stream(nums)
                .max()
                .getAsInt(); // safe after validateArray
    }

    public int minimumUsingStream(int[] nums) {
        validateArray(nums);
        return Arrays.stream(nums)
                .min()
                .getAsInt(); // safe after validateArray
    }

    public int sumUsingStream(int[] nums) {
        validateNotNull(nums);
        return Arrays.stream(nums).sum();
    }

    public double averageUsingStream(int[] nums) {
        validateArray(nums);
        OptionalDouble avg = Arrays.stream(nums).average();
        return avg.getAsDouble();
    }

    private void validateArray(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
    }

    private void validateNotNull(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
    }
}
