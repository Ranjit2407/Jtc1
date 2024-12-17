package com.jtc.p1;
class hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
}
class JTC{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
	}
}