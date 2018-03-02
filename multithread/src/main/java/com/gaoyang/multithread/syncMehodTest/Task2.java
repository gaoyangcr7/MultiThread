package com.gaoyang.multithread.syncMehodTest;

/**
 * Created by Gaoyang on 2018/2/26.
 */

/**
 * P76，2.2.3 用同步代码块解决同步方法的弊端
 * 当一个线程访问object的一个Synchronized同步代码块时，
 * 另一个线程仍然可以访问该object对象中的非Synchronized(this)同步代码块
 */
public class Task2 {

    private String getData1;
    private String getData2;

    public void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            synchronized (this) {
                getData1 = "长时间处理任务后从远程返回的值1 threadName="+Thread.currentThread().getName();
                getData2 = "长时间处理任务后从远程返回的值2 threadName="+Thread.currentThread().getName();
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
