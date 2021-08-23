package com.llk.thread;

import java.util.Random;

/**
 * @author llK
 * @date 2021/5/2
 */
public class ConsumerThread extends Thread {
    private final MyQueue myQueue;

    public ConsumerThread(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            String s = myQueue.get();
            System.out.println("消费生产者数据"+s);
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
