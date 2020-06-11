package com.usecase.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] run(int[] nums, int target) {
        return new TwoSum().twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        Map<Integer, Integer> others = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (others.containsKey(other)) {
                return new int[]{others.get(other), i};
            }

            others.put(nums[i], i);
        }

        return null;
    }
//runtime:2 ms
//memory:39.2 MB
}
