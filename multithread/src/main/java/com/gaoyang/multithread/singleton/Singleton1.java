package com.gaoyang.multithread.singleton;

/**
 * Created by Gaoyang on 2018/3/2.
 */

public class Singleton1 {

    public Singleton1() {
    }

    private static Singleton1 singleton1;

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        t1.start();
        t2.start();
        t3.start();
    }
}
