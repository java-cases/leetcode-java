package com.usecase.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

    public static int run(int[] nums) {
        return new FirstMissingPositive().firstMissingPositive(nums);
    }

    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return nums.length + 1;
    }
}
