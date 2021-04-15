package com.llk.leetcode;

import java.util.Stack;

/**
 * 最小栈
 *
 * @author llk
 */
public class MinStack_155 {

    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public MinStack_155() {

    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (minStack.peek().equals(mainStack.peek())) {
            minStack.pop();
        }
        mainStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
