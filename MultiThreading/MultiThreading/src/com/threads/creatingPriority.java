package com.threads;

public class creatingPriority {
	public static void main(String[] args) {
		Thread th1=new Thread();
		System.out.println(th1);
		System.out.println(th1.getPriority());
		th1.setPriority(10);
		System.out.println(th1.getPriority());
		System.out.println(th1);
	}
}
