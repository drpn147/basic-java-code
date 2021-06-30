package com.javamultithreading.app;

public class FactoryApp {
	public static void main(String args[]) {
		Factory factory=new Factory();
		Manager manager=new Manager(factory);
		Worker worker=new Worker(factory);
		manager.start();
		/*
		 * Creating thread object as worker class implements runnable interface
		 */
		Thread workerThread=new Thread(worker);
		workerThread.start();
		
	}
}
