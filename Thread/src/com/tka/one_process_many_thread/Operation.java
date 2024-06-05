package com.tka.one_process_many_thread;

public class Operation {

	synchronized public void printTable() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {

			System.out.println(Thread.currentThread().getName() + " : " + i);
		}

	}

}
