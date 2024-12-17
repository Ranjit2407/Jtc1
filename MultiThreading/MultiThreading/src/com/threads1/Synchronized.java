package com.threads1;
class Hello{
	synchronized void m1() {
		for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+ " threadgroup of :  " +Thread.currentThread().getThreadGroup().getName());
		
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	}
	void m2() {
		
	}
}

class cThread implements Runnable{
	Hello h1=null;
	cThread(){
		
	}
	cThread(String tname,Hello h1){
		this.h1=h1;
		Thread th1=new Thread(this,tname);
		th1.start();
	}
	public void run() {
		h1.m1();
	}
}
class dThread implements Runnable{
	Hello h1=null;
	dThread(){
		
	}
	dThread(String tname,Hello h1){
		this.h1=h1;
		Thread th2=new Thread(this,tname);
		th2.start();
	}
	public void run() {
		h1.m1();
	}
}

public class Synchronized {
	Hello h1=new Hello();
	cThread ath1=new cThread("t1",h1);
	dThread bth1=new dThread("t2",h1);
}
