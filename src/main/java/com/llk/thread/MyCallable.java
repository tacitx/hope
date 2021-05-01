package com.llk.thread;

import java.util.concurrent.Callable;

/**
 * @author llK
 * @date 2021/5/1
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return "call()函数返回";
    }
}
