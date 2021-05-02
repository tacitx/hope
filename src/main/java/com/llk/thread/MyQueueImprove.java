package com.llk.thread;

/**
 * @author llK
 * @date 2021/5/2
 */
public class MyQueueImprove extends MyQueue {

    @Override
    public synchronized void put(String s) {
        super.put(s);
    }

    @Override
    public synchronized String get() {
        return super.get();
    }
}
