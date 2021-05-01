package com.llk.thread;

/**
 * @author llK
 * @date 2021/4/30
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("实现Runnerable接口创建新线程");
    }
}
