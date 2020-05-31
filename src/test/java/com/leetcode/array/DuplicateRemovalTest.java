package com.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateRemovalTest {

    @Test
    void removeDuplicates() {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
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