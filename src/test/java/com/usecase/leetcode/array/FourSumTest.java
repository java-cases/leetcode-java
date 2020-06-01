package com.usecase.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourSumTest {

    @Test
    void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = FourSum.run(nums, 0);
        assertEquals(3, result.size());
    }

    @Test
    void runWithNullArray() {
        int[] nums = null;
        assertEquals(Collections.emptyList(), FourSum.run(nums, 0));
    }

    @Test
    void runWithEmptyArray() {
        int[] nums = {};
        assertEquals(Collections.emptyList(), FourSum.run(nums, 0));
    }
}