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
    public static void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 第一次优化
     * 添加标志位
     * 如果在其中一轮冒泡中没有发生交换，那么数组有序
     * 可以直接跳出循环
     *
     * @param array
     */
    public static void sort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    /**
     * 第二次优化
     * 针对数组部分有序
     * 主要思路为记录有序区的位置，并且在一轮次的排序中执行到有序区的边缘
     *
     * @param array
     */
    public static void sort3(int[] array) {
        // 最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数组的边界，只需比较到这里
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
    }
}
