package com.llk.leetcode;


import com.llk.entity.ListNode;
import org.junit.jupiter.api.Test;

public class HasCycle_141Test {
    @Test
    void test1() {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(7);
        ListNode listNode3 = new ListNode(8);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(14);
        ListNode listNode7 = new ListNode(9);
        ListNode listNode8 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;

        HasCycle_141 hasCycle_141 = new HasCycle_141();
        boolean hasCycle = hasCycle_141.hasCycle(listNode1);
        System.out.println(hasCycle);
    }
}