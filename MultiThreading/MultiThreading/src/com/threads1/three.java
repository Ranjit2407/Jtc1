package com.threads1;
class JtcThread1 extends Thread{
	public void run() {
		Service sr=new Service();
		sr.downloadFile();
	}
}
class JtcThread2 extends Thread{
	public void run() {
		Service sr=new Service();
		sr.readJtcStudentInfo();
	}
}
class Service{
	void downloadFile() {
		for(int i=0;i<=100;i+=5) {
			System.out.println("download\t"+i+"%");
		}
	}
	
	void readJtcStudentInfo() {
		for(int i=0;i<=100;i++) {
			System.out.println("jtcstudent with id\t"+i+"\tinformation");
		}
	}
}



public class three {
	public static void main(String[] args) {
		JtcThread1 jth1=new JtcThread1();
		JtcThread2 jth2=new JtcThread2();
		jth1.start();
		jth2.start();
	}
}
