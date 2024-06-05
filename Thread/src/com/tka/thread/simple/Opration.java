package com.tka.thread.simple;

public class Opration {
	
	public void hello() {
		
		String name = Thread.currentThread().getName();
		
		System.out.println(name);
	
		System.out.println("hello");

	}

}
