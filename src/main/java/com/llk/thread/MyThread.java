package com.llk.thread;

/**
 * @author llK
 * @date 2021/4/30
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("继承Thread类创建新线程:" + i);
        }

    }

}
