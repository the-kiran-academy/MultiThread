package com.tka.many_process_many_thread;


public class Test {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();

		MyThread t2 = new MyThread();
		t2.start();
	}

}
