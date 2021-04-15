package com.llk.leetcode;

/**
 * 2的幂
 *
 * @author lilk
 */
public class IsPowerOfTwo_231 {
    /**
     * 位运算
     * 2的整数次幂的二进制 只有最高位是1
     * 而原数值 -1 二进制数字全部变为了1
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else {
            return (n & n - 1) == 0;
        }
    }
}
