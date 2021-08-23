package com.llk.thread;

import java.util.concurrent.*;

/**
 * @author llK
 * @date 2021/5/1
 */
public class MainThread2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 8,
                500, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10)
        ) {
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                //如果call()中出现错误会在这里进行处理
                super.afterExecute(r, t);
            }
        };
        Future<String> submit = threadPoolExecutor.submit(myCallable);
        String result = submit.get();
        System.out.println(result);
    }
}
