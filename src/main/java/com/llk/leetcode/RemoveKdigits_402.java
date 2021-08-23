package com.llk.leetcode;

/**
<<<<<<< HEAD
 * 移除k位数字
 * 贪心算法
 *
 * @author lilk
 */
public class RemoveKdigits_402 {

    /**
     * 贪心算法
     * 通过获取局部最优解的方式来获得全局最优解
     *
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits_1(String num, int k) {
        String numNew = num;

        for (int i = 0; i < k; i++) {
            boolean hasCut = false;
            for (int j = 0; j < numNew.length() - 1; j++) {
                if (numNew.charAt(j) > numNew.charAt(j + 1)) {
                    numNew = numNew.substring(0, j) + numNew.substring(j + 1, numNew.length());
                    hasCut = true;
                    break;
                }
            }
            if (!hasCut) {
                numNew = numNew.substring(0, numNew.length() - 1);
            }
            numNew = removeZero(numNew);
        }
        if (numNew.length() == 0) {
            return "0";
        }
        return numNew;


    }

    private String removeZero(String numNew) {
        int length = numNew.length();
        for (int i = 0; i < length; i++) {
            if (numNew.charAt(0) != '0') {
                break;
            }
            numNew = numNew.substring(1, numNew.length());
        }
        return numNew;
=======
 * @author llK
 * @date 2021/5/1
 * 移掉K位数字
 */
public class RemoveKdigits_402 {

    public String removeKdigits(String num, int k) {
        return null;
>>>>>>> origin/main
    }
}
