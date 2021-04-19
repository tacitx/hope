package com.llk.leetcode;


import org.junit.jupiter.api.Test;

class RemoveKdigits_402Test {

    @Test
    void test1() {
        RemoveKdigits_402 removeKdigits_402 = new RemoveKdigits_402();
        String s = removeKdigits_402.removeKdigits_1("10001", 4);
        System.out.println(s);
    }

}