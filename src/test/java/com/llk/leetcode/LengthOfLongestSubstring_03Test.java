package com.llk.leetcode;


import org.junit.jupiter.api.Test;

class LengthOfLongestSubstring_03Test {
    @Test
    void test1() {
        String s = "abcabcbb";
        LengthOfLongestSubstring_03 lengthOfLongestSubstring_03 = new LengthOfLongestSubstring_03();
        int i = lengthOfLongestSubstring_03.lengthOfLongestSubstring_1(s);
        System.out.println(i);
    }
}