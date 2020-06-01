package com.usecase.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> run(int[] nums, int target) {
        return new FourSum().fourSum(nums, target);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;

        //定义4个指针i，j，head，tail  i从0开始遍历，j从i+1开始遍历，留下head和tail，head指向j+1，tail指向数组最大值
        for (int i = 0; i < length - 3; i++) {

            //当i的值与前面的值相等时忽略
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏
            int min1 = nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (min1 > target) {
                break;
            }

            //获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略
            int max1 = nums[i] + nums[length - 1] + nums[length - 2] + nums[length - 3];
            if (max1 < target) {
                continue;
            }

            //第二层循环j，初始值指向k+1
            for (int j = i + 1; j < length - 2; j++) {

                //当i的值与前面的值相等时忽略
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int head = j + 1;
                int tail = length - 1;

                //获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏，忽略
                int min = nums[i] + nums[j] + nums[head] + nums[head + 1];
                if (min > target) {
                    continue;
                }

                //获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略
                int max = nums[i] + nums[j] + nums[tail] + nums[tail - 1];
                if (max < target) {
                    continue;
                }

                //如果等于目标值，head++并去重，tail--并去重，当当前和大于目标值时tail--，当当前和小于目标值时head++
                while (head < tail) {
                    int curr = nums[i] + nums[j] + nums[head] + nums[tail];

                    if (curr == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[head], nums[tail]));
                        head++;

                        //跳过计算过的数据，同时防止结果重复
                        while (head < tail && nums[head] == nums[head - 1]) {
                            head++;
                        }

                        tail--;

                        //跳过计算过的数据，同时防止结果重复
                        while (head < tail && j < tail && nums[tail] == nums[tail + 1]) {
                            tail--;
                        }
                    } else if (curr > target) {
                        tail--;
                    } else {
                        head++;
                    }
                }
            }
        }

        return result;
    }
}
