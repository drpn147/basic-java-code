package com.javamultithreading.app;

public class Worker implements Runnable {

	Factory factory;

	public Worker(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		while (true) {
			try {
				this.factory.assignWork();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
