package com.book;

class jtc extends Thread{
	public void run() {
		for(int i=0;i<115;i++) {
			System.out.println("jt1\t"+i);
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class jtc1 extends Thread{
	Thread th=null;
	void setThreadTojoin(Thread th) {
		this.th=th;
	}
	public void run() {
		for(int i=0;i<115;i++) {
			System.out.println("jt2\t"+i);
			try {
				if(i==105) {
					th.join();
				}
				Thread.sleep(100);
			}catch (Exception e) {
				e.printStackTrace();			}
		}
	}
}
public class three {
	public static void main(String[] args) {
		jtc ath=new jtc();
		jtc1 bth=new jtc1();
		bth.setThreadTojoin(ath);
		ath.start();
		bth.start();
	}
}
