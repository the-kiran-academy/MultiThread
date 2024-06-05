package com.tka.one_process_many_thread;

public class MyThread extends Thread {
	Operation operation;
	
	public MyThread(Operation operation) {
		this.operation=operation;
	}


	@Override
	public void run() {
		operation.printTable();
	}

}
