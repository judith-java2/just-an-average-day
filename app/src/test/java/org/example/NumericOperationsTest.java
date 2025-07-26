package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumericOperationsTest {

    NumericOperations numOps = new NumericOperations();

    private final int[] sample = {4, 2, 7, 1, 9};

    @Test
    void testMaximumUsingForLoop() {
        assertEquals(9, numOps.maximumUsingForLoop(sample));
    }

    @Test
    void testMinimumUsingForLoop() {
        assertEquals(1, numOps.minimumUsingForLoop(sample));
    }

    @Test
    void testSumUsingForLoop() {
        assertEquals(23, numOps.sumUsingForLoop(sample));
    }

    @Test
    void testAverageUsingForLoop() {
        assertEquals(4.6, numOps.averageUsingForLoop(sample), 0.0001);
    }

    @Test
    void testMaximumUsingStream() {
        assertEquals(9, numOps.maximumUsingStream(sample));
    }

    @Test
    void testMinimumUsingStream() {
        assertEquals(1, numOps.minimumUsingStream(sample));
    }

    @Test
    void testSumUsingStream() {
        assertEquals(23, numOps.sumUsingStream(sample));
    }

    @Test
    void testAverageUsingStream() {
        assertEquals(4.6, numOps.averageUsingStream(sample), 0.0001);
    }

    @Test
    void testEmptyArrayThrows() {
        int[] empty = {};
        assertThrows(IllegalArgumentException.class, () -> numOps.maximumUsingForLoop(empty));
        assertThrows(IllegalArgumentException.class, () -> numOps.minimumUsingForLoop(empty));
        assertThrows(IllegalArgumentException.class, () -> numOps.averageUsingForLoop(empty));
        assertThrows(IllegalArgumentException.class, () -> numOps.maximumUsingStream(empty));
        assertThrows(IllegalArgumentException.class, () -> numOps.minimumUsingStream(empty));
        assertThrows(IllegalArgumentException.class, () -> numOps.averageUsingStream(empty));
    }

    @Test
    void testNullArrayThrows() {
        assertThrows(IllegalArgumentException.class, () -> numOps.maximumUsingForLoop(null));
        assertThrows(IllegalArgumentException.class, () -> numOps.minimumUsingForLoop(null));
        assertThrows(IllegalArgumentException.class, () -> numOps.sumUsingForLoop(null));
        assertThrows(IllegalArgumentException.class, () -> numOps.averageUsingForLoop(null));
        assertThrows(IllegalArgumentException.class, () -> numOps.maximumUsingStream(null));
        assertThrows(IllegalArgumentException.class, () -> numOps.minimumUsingStream(null));
        assertThrows(IllegalArgumentException.class, () -> numOps.averageUsingStream(null));
    }
}
