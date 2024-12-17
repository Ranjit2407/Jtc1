package com.book;

import java.util.*;

class Calc implements Runnable{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a first number");
		int num1=sc.nextInt();
		System.out.println("please enter a second number");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
	}
}
class Loop implements Runnable{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Loop start");
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println("wrong");
		}
		
	}
}
public class runnable {
	public static void main(String[] args) {
		Calc c1=new Calc();
		Loop p2=new Loop();
		Thread t1=new Thread(c1);
		Thread t2=new Thread(p2);
		t1.start();
		t2.start();
	}
}

