package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTransformsTest {

    NumberTransforms transforms = new NumberTransforms();

    private final int[] sample = {1, 2, 3};

    @Test
    void testAddFive() {
        assertArrayEquals(new int[]{6, 7, 8}, transforms.addFive(sample));
    }

    @Test
    void testSquareNumbers() {
        assertArrayEquals(new int[]{1, 4, 9}, transforms.squareNumbers(sample));
    }

    @Test
    void testNullArrayThrows() {
        assertThrows(IllegalArgumentException.class, () -> transforms.addFive(null));
        assertThrows(IllegalArgumentException.class, () -> transforms.squareNumbers(null));
    }
}
