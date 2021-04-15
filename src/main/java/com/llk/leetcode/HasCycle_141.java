package com.llk.leetcode;

import com.llk.entity.ListNode;

public class HasCycle_141 {
    /**
     * 快慢指针/追击问题
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
            if (l1 == l2) {
                return true;
            }
        }
        return false;
    }
}
