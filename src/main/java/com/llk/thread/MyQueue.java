package com.llk.thread;

/**
 * @author llK
 * @date 2021/5/2
 */
public class MyQueue {
    private String[] data = new String[10];
    private int putIndex = 0;
    private int getindex = 0;
    private int size = 0;

    public synchronized void put(String s) {
        if (size == data.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data[putIndex] = s;
        notify();
        size++;
        putIndex++;
        if (putIndex == data.length) {
            putIndex = 0;
        }

    }

    public synchronized String get() {
        if (size == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String result = data[getindex];
        notify();
        getindex++;
        size--;
        if (getindex == data.length) {
            getindex = 0;
        }


        return result;
    }
}
