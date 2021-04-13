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
     * 主要思路为记录有序区的位置
     *
     * @param array
     */
    public static void sort3(int[] array) {
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
}
