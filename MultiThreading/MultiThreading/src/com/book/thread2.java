package com.book;

import java.util.*;

class hey extends Thread{
	public void run() {
		String tname=currentThread().getName();
		if(tname.equals("CAL")) {
			calc();
		}
		else{
			messege();
		}
	}
	public void calc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a first number");
		int num1=sc.nextInt();
		System.out.println("please enter a second number");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
	}
	
	public void messege() {
		try {
			for(int i=0;i<50000;i++) {
				System.out.println("Loop start");
//				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println("wrong");
		}
	}
}

public class thread2 {
	public static void main(String[] args) {
		hey h1=new hey();
		hey h2=new hey();
		h1.setName("CAL");
		h2.setName("MSG");
		h1.start();
		h2.start();
	}
}