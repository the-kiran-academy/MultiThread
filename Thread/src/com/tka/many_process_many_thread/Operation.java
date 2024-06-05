package com.tka.many_process_many_thread;

public class Operation {
	
	public void tableOfSeven() {

		
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i*7);
		}

	}
	
	
	public void tableOfThree() {


		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i*3);
		}

	}

}
