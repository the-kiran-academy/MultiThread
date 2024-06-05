package com.tka.many_process_many_thread;

public class MyThread extends Thread {

	Operation operation = new Operation();

	@Override
	public void run() {
		operation.tableOfSeven();
		operation.tableOfThree();
	}

}
