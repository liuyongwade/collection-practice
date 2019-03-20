package com.liuyong.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CarNum {
	static int num = 0;

	static CountDownLatch countDownLatch = new CountDownLatch(100);
	
	static Lock lock = new ReentrantLock();

	public static void increase() {
		lock.lock();
		num++;
		lock.unlock();
	}

	public static void main(String[] args) throws InterruptedException {
		for (int k = 0; k < 100; k++) {
			final int index = k;
			new Thread(() -> {
				for (int i = 0; i < 1000; i++) {
					increase();
				}
				System.out.println(index);
				countDownLatch.countDown();
			}).start();
		}

		countDownLatch.await();
		System.out.println(num);
	}
}
