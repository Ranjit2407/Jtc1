package com1.jtc.p4;
import com1.jtc.p1.*;
import com1.jtc.p2.C;
import com1.jtc.p3.D;

public class Test{
	public static void main(String arg[]){
		System.out.println("main method");
		A a1=new A();
		a1.m1();
		B b1=new B();
		b1.m2();
		C c1=new C();
		c1.m3();
		D d1=new D();
		d1.m4();
	}
}