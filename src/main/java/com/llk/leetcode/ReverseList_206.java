package com.llk.leetcode;


import com.llk.entity.ListNode;

/**
 * 反转链表
 *
 * @author llK
 * @date 2021/3/8
 */
public class ReverseList_206 {

    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
