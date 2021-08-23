package com.llk.thread;

/**
 * @author llK
 * @date 2021/5/2
 */
public class MyQueueImprove extends MyQueue {
    private String[] data = new String[10];
    private int putIndex = 0;
    private int getindex = 0;
    private int size = 0;

    @Override
    public synchronized void put(String s) {
        if (size == data.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            put(s);
        } else {
            put0(s);
            notify();
        }


    }

    private void put0(String s) {
        data[putIndex] = s;
        size++;
        putIndex++;
        if (putIndex == data.length) {
            putIndex = 0;
        }
    }

    @Override
    public synchronized String get() {
        if (size == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return get();
        } else {
            notify();
            return get0();
        }
    }

    private String get0() {
        String result = data[getindex];
        getindex++;
        size--;
        if (getindex == data.length) {
            getindex = 0;
        }
        return result;
    }
}
