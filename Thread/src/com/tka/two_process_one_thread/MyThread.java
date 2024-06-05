package com.tka.two_process_one_thread;

public class MyThread extends Thread{
	
	Operation operation=new  Operation();
	@Override
	public void run() {
		
		operation.tableOfThree();
		
		System.out.println("**************");
		
		operation.tableOfSeven();
		
	}

}
