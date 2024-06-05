package com.tka.one_process_many_thread;

public class Test {

	public static void main(String[] args) {
		Operation operation = new Operation();
		MyThread t1=new MyThread(operation);
		t1.start();
		
		MyThread t2=new MyThread(operation);
		t2.start();
		

	}

}
