package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        NumericOperations numOps = new NumericOperations();
        NumberFilters filters = new NumberFilters();
        NumberTransforms transforms = new NumberTransforms();

        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Using For Loop:");
        System.out.println("Max: " + numOps.maximumUsingForLoop(numbers));
        System.out.println("Min: " + numOps.minimumUsingForLoop(numbers));
        System.out.println("Sum: " + numOps.sumUsingForLoop(numbers));
        System.out.println("Average: " + numOps.averageUsingForLoop(numbers));

        System.out.println("\nUsing Stream:");
        System.out.println("Max: " + numOps.maximumUsingStream(numbers));
        System.out.println("Min: " + numOps.minimumUsingStream(numbers));
        System.out.println("Sum: " + numOps.sumUsingStream(numbers));
        System.out.println("Average: " + numOps.averageUsingStream(numbers));

        System.out.println("\nFilters:");
        System.out.println("Evens Only: " + Arrays.toString(filters.evensOnly(numbers)));
        System.out.println("Odds Only: " + Arrays.toString(filters.oddsOnly(numbers)));

        System.out.println("\nTransforms:");
        System.out.println("Add Five: " + Arrays.toString(transforms.addFive(numbers)));
        System.out.println("Square Numbers: " + Arrays.toString(transforms.squareNumbers(numbers)));
    }
}
