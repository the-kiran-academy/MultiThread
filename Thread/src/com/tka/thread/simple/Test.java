package com.tka.thread.simple;

public class Test {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		
		thread.setName("main-thread");
		
		System.out.println(thread.getName());
		
		System.out.println("Hello World");

	}

}
