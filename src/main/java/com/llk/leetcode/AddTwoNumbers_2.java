package com.llk.leetcode;

import com.llk.entity.ListNode;

/**
 * @author llK
 * @date 2021/4/12
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumListNode = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;

            int sum = n1 + n2 + carry;
            if (sum > 9) {
                carry = 1;
            }
            sumListNode.val = sum % 10;
        }
        return null;
    }
}
