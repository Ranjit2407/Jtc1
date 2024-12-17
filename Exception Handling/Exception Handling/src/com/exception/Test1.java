package com.exception;
class Hello{
	int m1() {
		System.out.println("m1 in hello");
		int i1=1;
		int i2=10;
		
		try {
			int i3=i2/i1;
			System.out.println(i3);
			return 10;
		}catch(Exception e) {
			System.out.println("in catch block");
			System.out.println(e);
		}finally {
			System.out.println("finally in block");
		}
		System.out.println("after the block");
		return 20;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.m1();
	}
}