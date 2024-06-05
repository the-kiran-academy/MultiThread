package com.tka.two_process_one_thread;

public class Operation {
	
	public void tableOfSeven() {

		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*7);
		}

	}
	
	
	public void tableOfThree() {

		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*3);
		}

	}

}
