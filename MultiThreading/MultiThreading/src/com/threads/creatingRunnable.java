package com.threads;
class Athread implements Runnable{
	public Athread() {
		Thread t1=new Thread(this);
		t1.start();
	}
	Athread(String tname){
		Thread t2=new Thread(this,tname);
		t2.start();
	}
	Athread(ThreadGroup tg,String tname){
		Thread t3=new Thread(tg,this,tname);
		t3.start();
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+ " under the thradegroup of : " +Thread.currentThread().getThreadGroup().getName());
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}


public class creatingRunnable {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("jtc india");
		Athread th1=new Athread();
		Athread th2=new Athread("jtc thread1");
		Athread th3=new Athread(tg,"jtc thread2");
	}
}
