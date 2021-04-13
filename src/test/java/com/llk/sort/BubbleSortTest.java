package com.llk.sort;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {

    @Test
    void test1() {
        int[] arr = new int[]{2, 3, 5, 3, 4};
        BubbleSort.sort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void test2() {
        int[] arr = new int[]{2, 3, 5, 3, 4};
        BubbleSort.sort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}