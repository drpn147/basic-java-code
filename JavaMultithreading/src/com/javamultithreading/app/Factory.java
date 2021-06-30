package com.javamultithreading.app;

public class Factory {

	private int work;

	private boolean flag = false;

	synchronized public void produceWork(int work) throws InterruptedException {
		if (flag) {
			wait();
		}
		this.work = work;
		System.out.println("Produced Work: " + this.work);
		flag = true;
		notify();
	}

	synchronized public int assignWork() throws InterruptedException {
		if (!flag) {
			wait();
		}
		System.out.println("Assigned Work: " + this.work);
		flag = false;
		notify();
		return this.work;
	}
}
