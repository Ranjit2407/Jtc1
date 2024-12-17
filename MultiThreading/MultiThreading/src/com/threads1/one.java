package com.threads1;
class jtcStudent{
	public void finalize() {
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		for(int i=20;i<40;i++) {
			System.out.println(i+ "\t" +th.getName()+"\t"+tg.getName());
		}
	}
}


public class one {
	public static void main(String[] args) {
		System.out.println("main started");
		System.out.println("length :" +args.length);
		for(int i=0;i<args.length;i++) {
			System.out.println("args"+i+"\t"+args[i]);
		}
		
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		new jtcStudent();
		System.gc();
		for(int i=0;i<10;i++) {
			System.out.println(i+"\t"+th.getName()+" \t "+tg.getName());
		}
		System.out.println("main completed");
	}
}
