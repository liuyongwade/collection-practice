package com.liuyong.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class MyLock implements Lock {
	private boolean isHoldLock = false;

	private int reentryCount = 0;

	private Thread threadLocal = null;

	public synchronized void lock() {
		if (isHoldLock && Thread.currentThread() != threadLocal) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		reentryCount++;
		threadLocal = Thread.currentThread();
		isHoldLock = true;
	}

	public synchronized void unlock() {
		if (Thread.currentThread() == threadLocal) {
			reentryCount--;
			if (reentryCount == 0) {
				notify();
				isHoldLock = false;
				threadLocal = null;
			}
		}
	}

	public void lockInterruptibly() throws InterruptedException {

	}

	public boolean tryLock() {
		return false;
	}

	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		return false;
	}

	public Condition newCondition() {
		return null;
	}
}
