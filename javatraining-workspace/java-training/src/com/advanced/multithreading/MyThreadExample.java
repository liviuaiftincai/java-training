package com.advanced.multithreading;

public class MyThreadExample {

	public static void main(String[] args) {
		System.out.println("Executing program...");
		
		Thread thread1 = new MyThread("Thread 1");
        thread1.start();
        
        Thread thread2 = new MyThread("Thread 2");
        thread2.start();
        
        Thread thread3 = new MyThread("Thread 3");
        thread3.start();
	}
	
}
