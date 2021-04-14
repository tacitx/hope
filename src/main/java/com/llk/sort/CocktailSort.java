package com.llk.sort;

/**
 * 鸡尾酒排序
 * 也叫双向冒泡排序
 * 针对的是类似于 {2,3,4,5,6,7,8,1}这种类型的排序
 * 特定条件下减少排序的回合数
 *
 * @author llK
 * @date 2021/4/13
 */
public class CocktailSort {

    public static void sort(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

            isSorted = true;

            for (int j = array.length - i - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

    }
}
