package com.threads1;
class a implements Runnable{
	Stack st=null;
	a(Stack st,String name){
		this.st=st;
		Thread t1=new Thread(this,name);
		t1.start();
	}
	public void run() {
		int a=1;
		for(int i=0;i<7;i++) {
			st.push(a++);
		}
	}
}
class b implements Runnable{
	Stack st=null;
	b(Stack st,String name){
		this.st=st;
		Thread t2=new Thread(this,name);
		t2.start();
	}
	public void run() {
		for(int i=0;i<7;i++) {
			st.pop();
		}
	}
}


class Stack{
	int x;
	boolean flag=false;
	
	public synchronized void push(int x) {
		if(flag) {
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		this.x=x;
		System.out.println(x+"is pushed");
		flag=true;
		notify();
	}
	synchronized public int pop(){
		if(!flag) {
			try {
				wait();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(x+"is poped");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		flag=false;
		notify();
		return x;
	}
}


public class seven {

}
