package com.book;

class Hellotwo implements Runnable{
	public Hellotwo() {
		Thread t1=new Thread(this);
		t1.start();
	}
	Hellotwo(String tname){
		Thread t2=new Thread(this,tname);
		t2.start();
	}
	Hellotwo(String tname,ThreadGroup tg){
		Thread t3=new Thread(tg,this,tname);
		t3.start();
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" under "+Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(500);
			}catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
}

class Mythread implements Runnable{
	void m1() {
		System.out.println("m1 in mythread");
		String tname="jtc";
		Thread t1=new Thread(this);
		Thread t2=new Thread(this,tname);
		t1.start();
		t2.start();
	}
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class two {
	public static void main(String[] args) {
		Mythread m2=new Mythread();
		m2.m1();
	}
}
