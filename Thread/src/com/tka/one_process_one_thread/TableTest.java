package com.tka.one_process_one_thread;

public class TableTest {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();

		t1.start();


	}

}
