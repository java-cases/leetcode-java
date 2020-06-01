package com.usecase.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstMissingPositiveTest {

    @Test
    void firstMissingPositive() {
        int[] nums = {3, 4, -1, 1};
        assertEquals(2, FirstMissingPositive.run(nums));
    }

    @Test
    void runWithNullArray() {
        int[] nums = null;
        assertEquals(1, FirstMissingPositive.run(nums));
    }

    @Test
    void runWithEmptyArray() {
        int[] nums = {};
        assertEquals(1, FirstMissingPositive.run(nums));
    }
}