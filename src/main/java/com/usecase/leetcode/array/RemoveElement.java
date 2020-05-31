package com.usecase.leetcode.array;

public class RemoveElement {

    public static int run(int[] nums, int val) {
        return new RemoveElement().removeElement(nums, val);
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }

        if (nums.length < 1) {
            return nums.length;
        }

        int filledIndex = nums.length - 1;
        for (int i = 0; i < nums.length && i <= filledIndex; i++) {
            if (nums[i] == val) {
                nums[i] = nums[filledIndex];

                filledIndex--;
                i--;
            }
        }

        return filledIndex + 1;
    }

}
