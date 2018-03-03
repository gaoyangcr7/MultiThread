package com.gaoyang.multithread.singleton;

/**
 * Created by Gaoyang on 2018/3/2.
 */

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton2.getSingleton2().hashCode());
        }
    }
}
