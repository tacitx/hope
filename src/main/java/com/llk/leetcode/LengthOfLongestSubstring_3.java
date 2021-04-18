package com.llk.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * 滑动窗口
 *
 * @author llK
 * @date 2021/4/15
 */
public class LengthOfLongestSubstring_3 {

    public int lengthOfLongestSubstring_0(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int rightPoint = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rightPoint + 1 < n && !set.contains(s.charAt(rightPoint + 1))) {
                rightPoint++;
                set.add(s.charAt(rightPoint));
            }
            ans = Math.max(ans, rightPoint - i + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstring_1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int leftPoint = 0;
        int max = 0;
        for (int rightPoint = 0; rightPoint < s.length(); rightPoint++) {
            char c = s.charAt(rightPoint);
            if (map.containsKey(c)) {
                // max函数针对leftpoint在中间，而发生重复的值小于leftpoint的情况
                leftPoint = Math.max(map.get(c) + 1, leftPoint);
            }
            max = Math.max(max, rightPoint - leftPoint + 1);
            // 如果有一样的char会覆盖掉原来的
            map.put(c, rightPoint);
        }
        return max;
    }
}
