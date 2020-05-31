package com.leetcode.array;

/**
 * 删除排序数组中的重复。
 * 方法：双指针法。
 */
public class DuplicateRemoval {

    public static int run(int[] nums) {
        return new DuplicateRemoval().removeDuplicates(nums);
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        if (nums.length <= 1) {
            return nums.length;
        }

        int filledIndex = 0; //返回删除重复元素后的数组指针
        for (int i = 1; i < nums.length; i++) {

            //当前元素与前一个元素不同，当前元素移入待返回的数组
            if (nums[i] != nums[i - 1]) {
                nums[++filledIndex] = nums[i];
            }
        }

        return filledIndex + 1;
    }
}
