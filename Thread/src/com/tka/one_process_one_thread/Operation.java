package com.tka.one_process_one_thread;

public class Operation {

	public void printTable() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
