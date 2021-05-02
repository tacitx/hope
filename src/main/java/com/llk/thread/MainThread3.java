package com.llk.thread;

/**
 * @author llK
 * @date 2021/5/2
 */
public class MainThread3 {
    public static void main(String[] args) throws InterruptedException {
        MyQueue myQueue = new MyQueue();
        new ConsumerThread(myQueue).start();
        new ProducerThread(myQueue).start();

        Thread.sleep(5000);
        System.exit(0);
    }
}
