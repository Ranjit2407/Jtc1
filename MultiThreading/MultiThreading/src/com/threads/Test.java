package com.threads;

public class Test {
	public static void main(String[] args) {
		System.out.println("main method");
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		t1.setName("Athreads");
		System.out.println(t1);
		System.out.println("new threads");
		Thread t2=new Thread();
		System.out.println(t2);
		
	}
}
