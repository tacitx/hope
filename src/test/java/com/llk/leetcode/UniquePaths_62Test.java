package com.llk.leetcode;

import org.junit.jupiter.api.Test;

class UniquePaths_62Test {
    // m>0 n>0
    @Test
    void test1() {
        UniquePaths_62 uniquePaths_62 = new UniquePaths_62();
        int num = uniquePaths_62.uniquePaths(1, 1);
        System.out.println("最多有" + num + "种路线");
    }

}