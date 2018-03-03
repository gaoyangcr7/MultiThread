package com.gaoyang.multithread.singleton;

/**
 * Created by Gaoyang on 2018/3/2.
 */

public class Singleton2 {

    public Singleton2() {
    }

    private static Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    public static Singleton2 getSingleton2() {
        return singleton2;
    }

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();
        t1.start();
        t2.start();
        t3.start();
    }
}
