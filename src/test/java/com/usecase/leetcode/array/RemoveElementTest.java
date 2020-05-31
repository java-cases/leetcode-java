package com.usecase.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    void removeElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, RemoveElement.run(nums, 2));
    }

    @Test
    void removeElementWithNullArray() {
        int[] nums = null;
        assertEquals(0, RemoveElement.run(nums, 2));
    }

    @Test
    void removeElementWithOneElementArray() {
        int[] nums = {1};
        assertEquals(1, RemoveElement.run(nums, 0));
    }
}