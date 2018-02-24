package com.gaoyang.multithread.hasSelfPrivateNum;



public class Run {

	public static void main(String[] args) {

		/**
		 * 多个线程访问同一个对象，所以输出是顺序输出
		 * 当有syncronized的时候，输出为：a set over!
		 								a num=100
		 								b set over!
		 								b num=200
		 */
//		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
//
//		ThreadA athread = new ThreadA(numRef);
//		athread.start();
//
//		ThreadB bthread = new ThreadB(numRef);
//		bthread.start();


		/**
		 * 创建了两个对象，所以产生了两个锁
		 * 当有syncronized的时候，输出为：a set over!
										 b set over!
										 b num=200
										 a num=100
		 */
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

		ThreadA athread = new ThreadA(numRef1);
		athread.start();

		ThreadB bthread = new ThreadB(numRef2);
		bthread.start();

	}

}
