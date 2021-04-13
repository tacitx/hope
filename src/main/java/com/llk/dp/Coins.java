package com.llk.dp;

/**
 * @author llK
 * @date 2021/3/31
 */
public class Coins {
    /**
     * 动态规划
     *
     * @param a 有那些硬币可供选择
     * @param m 最后要得到的数值
     * @return 获得这个数值所需最小数量
     */
    public static int coinChange(int[] a, int m) {
        int[] f = new int[m + 1];
        f[0] = 0;
        int n = a.length;
        // i 情景为多少枚硬币
        for (int i = 1; i <= m; i++) {
            // 先设置为无穷枚
            f[i] = Integer.MAX_VALUE;
            // 遍历最后一枚的情况
            for (int j = 0; j < n; j++) {
                // 设置边界条件
                if (i >= a[j] && f[i - a[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - a[j]] + 1, f[i]);
                }
            }
        }
        if (f[m] == Integer.MAX_VALUE) {
            f[m] = -1;
        }
        return f[m];
    }

    public static void main(String[] args) {
        int i = coinChange(new int[]{2, 5, 7}, 27);
        System.out.println(i);
    }
}
