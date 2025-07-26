package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberFiltersTest {

    NumberFilters filters = new NumberFilters();

    private final int[] sample = {1, 2, 3, 4, 5, 6};

    @Test
    void testEvensOnly() {
        assertArrayEquals(new int[]{2, 4, 6}, filters.evensOnly(sample));
    }

    @Test
    void testOddsOnly() {
        assertArrayEquals(new int[]{1, 3, 5}, filters.oddsOnly(sample));
    }

    @Test
    void testNullArrayThrows() {
        assertThrows(IllegalArgumentException.class, () -> filters.evensOnly(null));
        assertThrows(IllegalArgumentException.class, () -> filters.oddsOnly(null));
    }
}
