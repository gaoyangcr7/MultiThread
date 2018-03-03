package com.gaoyang.multithread.singleton;

/**
 * Created by Gaoyang on 2018/3/2.
 */

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton1.getSingleton1().hashCode());
        }
    }
}
