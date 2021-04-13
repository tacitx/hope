package com.llk.leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author llK
 * @date 2021/4/8
 */
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException();
    }
}
