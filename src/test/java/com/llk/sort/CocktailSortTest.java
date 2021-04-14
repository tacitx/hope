package com.llk.sort;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CocktailSortTest {

    @Test
    void test1() {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 1};
        CocktailSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}