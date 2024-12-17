package com.book;

class HelloThread extends Thread{
	public HelloThread() {
		super();
		start();
	}
	public HelloThread(String tname) {
		super(tname);
		start();
	}
	HelloThread(ThreadGroup tg,String tname){
		super(tg,tname);
		start();
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" under the threadgroup of "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	

public class one {
	public static void main(String[] args) {
		
	
	ThreadGroup tg=Thread.currentThread().getThreadGroup();
	HelloThread th1=new HelloThread();
	HelloThread th2=new HelloThread("jtc1");
	HelloThread th3=new HelloThread(tg,"jtc-2");
	
	
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+" under the threadgroup of "+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
}
