package com.gaoyang.multithread.syncBlockMoreObjectOneLock;

public class Service {

	public static void printA() {
		synchronized (Service.class) {
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

	}

	public static void printB() {
		synchronized (Service.class) {
			System.out.println("Thread name is " + Thread.currentThread().getName()
					+ " in " + System.currentTimeMillis() + "enter printB");
			System.out.println("Thread name is " + Thread.currentThread().getName()
					+ " in " + System.currentTimeMillis() + "leave printB");
		}
	}
}
