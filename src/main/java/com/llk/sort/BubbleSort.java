package com.llk.sort;

/**
 * 冒泡排序
 *
 * @author llK
 * @date 2021/4/13
 */
public class BubbleSort {
    /**
     * 普通冒泡排序
     *
     * @param array 待排序数组
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
