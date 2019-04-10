package com.advanced.multithreading;

public class RunnableExample {

	public static void main(String[] args) {
		System.out.println("Executing program...");
		
		Runnable runnable = new MyRunnable();
		
		Thread thread1 = new Thread(runnable, "Thread 1");
        thread1.start();
        
        Thread thread2 = new Thread(runnable, "Thread 2");
        thread2.start();
        
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() +
                            "\twith Runnable: Inner class Runnable runs..." + i);
                }
            }
        }, "Thread 3");
        thread3.start();
	}
	
}
