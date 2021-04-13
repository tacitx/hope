package com.llk.leetcode;

import org.junit.jupiter.api.Test;


class LongestPalindrome_5Test {

    @Test
    void test1() {
        LongestPalindrome_5 longestPalindrome_5 = new LongestPalindrome_5();
        String s = longestPalindrome_5.longestPalindrome("aaaa");
        System.out.println("最长回文子串为："+ s);
    }
}