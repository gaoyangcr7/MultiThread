package com.gaoyang.multithread.syncMoreObjectStaticOneLock;

public class Service {

	synchronized public static void printA() {
		try {
			System.out.println("Thread name is " + Thread.currentThread().getName()
					+ " in " + System.currentTimeMillis() + "enter printA");
			Thread.sleep(3000);
			System.out.println("Thread name is " + Thread.currentThread().getName()
					+ " in " + System.currentTimeMillis() + "leave printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		System.out.println("Thread name is " + Thread.currentThread().getName()
				+ " in " + System.currentTimeMillis() + "enter printB");
		System.out.println("Thread name is " + Thread.currentThread().getName()
				+ " in " + System.currentTimeMillis() + "leave printB");
	}

}
