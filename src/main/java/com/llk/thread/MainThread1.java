package com.llk.thread;

import java.util.concurrent.FutureTask;

/**
 * @author llK
 * @date 2021/4/30
 */
public class MainThread1 {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
//        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.run();
        myThread.join();
        // Callable结合FutureTask
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask(myCallable);
        new Thread(futureTask).start();
        // 同步等待
        String s = futureTask.get();
        System.out.println(s);

        System.out.println("主线程执行");
    }
}
