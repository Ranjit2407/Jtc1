package com.threads1;
class jtcThread extends Thread{
	public void run() {
		Hello12 h=new Hello12();
		h.show();
	}
}

class Hello12{
	void show() {
		Thread th=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println("show\t"+i+"\t"+th.getName());
		}
	}
}


public class two {
	public static void main(String[] args) {
		jtcThread jt1=new jtcThread();
		jt1.start();
		Thread thread=Thread.currentThread();
		for(int i=100;i<110;i++) {
			System.out.println("Main"+i+"\t"+thread.getName());
			if(i==105) {
				int x=10/0;
			}
		}
	}
}
