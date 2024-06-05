package com.tka.one_process_one_thread;

public class MyThread extends Thread{
	
	Operation operation=new Operation();
	@Override
	public void run() {
		
		operation.printTable();
	}
	

}
