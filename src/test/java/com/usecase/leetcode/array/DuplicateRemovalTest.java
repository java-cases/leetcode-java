package com.usecase.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateRemovalTest {

    @Test
    void removeDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, DuplicateRemoval.run(nums));
    }

    @Test
    void removeDuplicatesWithNullArray() {
        int[] nums = null;
        assertEquals(0, DuplicateRemoval.run(nums));
    }

    @Test
    void removeDuplicatesWithOneElementArray() {
        int[] nums = {1};
        assertEquals(1, DuplicateRemoval.run(nums));
    }
}