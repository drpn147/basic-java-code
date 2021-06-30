package com.javamultithreading.app;

public class Manager extends Thread {

	Factory factory;

	public Manager(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		int i = 1;
		while (true) {
			try {
				this.factory.produceWork(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				i++;
			}

		}
	}
}
