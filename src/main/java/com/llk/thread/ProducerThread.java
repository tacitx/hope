package com.llk.thread;

import java.util.Random;

/**
 * @author llK
 * @date 2021/5/2
 */
public class ProducerThread extends Thread {
    private final MyQueue myQueue;
    private int index;


    public ProducerThread(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            String s = "生产者产生数据" + index;
            myQueue.put(s);
            System.out.println(s);
            index++;
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
