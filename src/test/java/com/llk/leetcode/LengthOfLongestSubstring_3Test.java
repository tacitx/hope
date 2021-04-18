package com.llk.leetcode;


import org.junit.jupiter.api.Test;

class LengthOfLongestSubstring_3Test {
    @Test
    void test1() {
        String s = "abcabcbb";
        LengthOfLongestSubstring_3 lengthOfLongestSubstring_3 = new LengthOfLongestSubstring_3();
        int i = lengthOfLongestSubstring_3.lengthOfLongestSubstring_1(s);
        System.out.println(i);
    }
}