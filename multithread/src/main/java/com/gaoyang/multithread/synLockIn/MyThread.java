package com.gaoyang.multithread.synLockIn;


public class MyThread extends Thread {
	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}

}
