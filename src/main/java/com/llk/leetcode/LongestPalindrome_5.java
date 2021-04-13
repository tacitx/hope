package com.llk.leetcode;


/**
 * 最长回文子串
 *
 * @author llK
 * @date 2021/4/1
 */
public class LongestPalindrome_5 {

    public String longestPalindrome(String s) {
        int maxLen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        int len = s.length();
        boolean[][] f = new boolean[len][len];
        for (int m = 0; m < len; m++) {
            f[m][m] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (chars[i] != chars[j]) {
                    f[i][j] = false;
                } else {
                    if (j - i < 3) {
                        f[i][j] = true;
                    } else {
                        f[i][j] = f[i + 1][j - 1];
                    }
                }
                if (f[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * leetcode解法
     *
     * @param s
     * @return
     */
    public String longestPalindromeLeetCode(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }

}
