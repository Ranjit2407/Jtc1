package com.book;

import java.util.*;

class Calc extends Thread{
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
class Loop extends Thread{
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
public class Thread1 {
	public static void main(String[] args) {
		Calc t1=new Calc();
		Loop t2=new Loop();
		t1.start();
		t2.start();
	}
}
