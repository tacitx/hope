package com.llk.thread;

/**
 * @author llK
 * @date 2021/5/1
 */
public class MyClass {

    public void method1() {
        synchronized (this) {
            // ...
        }
    }

    public static void method2() {
        synchronized (MyClass.class) {
            // ...
        }
    }
}
