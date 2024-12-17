package com.threads;
class HelloThread extends Thread{
	
	public HelloThread() {
		super();
		start();
	}
	HelloThread(String tname){
		super(tname);
		start();
	}
	HelloThread(String tname,ThreadGroup tg){
		super(tg,tname);
		start();
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+ " under the threadGroup : " + Thread.currentThread().getThreadGroup().getName());
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}


public class creattingThread {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("jtc thread group");
		HelloThread th=new HelloThread();
		HelloThread th1=new HelloThread("jtc");
		HelloThread th2=new HelloThread("jtc-india",tg);
	}
}
