package com.llk.leetcode;


import com.llk.entity.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbers_2Test {

    @Test
    void test1() {
        AddTwoNumbers_2 addTwoNumbers_2 = new AddTwoNumbers_2();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);

        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        listNode5.next = listNode6;
        listNode6.next = listNode7;

        ListNode listNode = addTwoNumbers_2.addTwoNumbers(listNode1, listNode5);
    }

}