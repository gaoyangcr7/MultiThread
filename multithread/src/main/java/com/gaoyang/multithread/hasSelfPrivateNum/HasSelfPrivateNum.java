package com.gaoyang.multithread.hasSelfPrivateNum;

/**
 * addI不带synchronized的时候：若num是方法内部局部变量，num同步；如果是方法外面的实例变量，则非同步
 * addI带synchronized的时候：无论num是局部还是实例变量，都同步
 */
public class HasSelfPrivateNum {

	int num = 0;

	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
