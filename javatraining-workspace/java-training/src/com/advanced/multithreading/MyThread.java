package com.advanced.multithreading;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "\twith Thread: MyThread runs..." + i);
		}
	}

}
