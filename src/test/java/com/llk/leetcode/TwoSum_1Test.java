package com.llk.leetcode;


import org.junit.jupiter.api.Test;

class TwoSum_1Test {
    @Test
    void test1() {
        TwoSum_1 twoSum_1 = new TwoSum_1();
        int[] arr = {3, 3, 4};
        int[] ints = twoSum_1.twoSum(arr, 6);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}