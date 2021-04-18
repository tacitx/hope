package com.llk.leetcode;


import org.junit.jupiter.api.Test;

class MyQueue_232Test {

    @Test
    void test1() {
        MyQueue_232 myQueue_232 = new MyQueue_232();
        myQueue_232.push(1);
        myQueue_232.push(2);
        System.out.println(myQueue_232.peek());
        System.out.println(myQueue_232.pop());
        System.out.println(myQueue_232.empty());
    }

}