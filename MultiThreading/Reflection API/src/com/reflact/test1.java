package com.reflact;
import java.lang.reflect.Field;

class B{
	public final static int a=10;
	void m1() {
		System.out.println("m1 in B");
	}
}
class C extends B{
	public final static int c1=101;
	
	C(){
		System.out.println("def cons in C");
	}
	
	void m2() {
		System.out.println("m2 in C");
		System.out.println(b1);
	}
	void m3(int a, int b) {
		System.out.println("2par cons in C");
	}
}


public class test1 {
	public static void main(String[] args) {
		try {
		Class cls=Class.forName("com.reflact.B");
		B b1=(B) cls.newInstance();
		System.out.println(java.lang.reflect.Modifier.PUBLIC);
		System.out.println(java.lang.reflect.Modifier.PRIVATE);
		System.out.println(java.lang.reflect.Modifier.FINAL);
		System.out.println("fields**************");
		Field f[]=cls.getFields();
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getName());
		}
		
		Field f1[]=cls.getDeclaredFields();
		for(int i=0;i<f1.length;i++) {
			System.out.println(f1[i].getModifiers()+" Type "+f1[i].getType()+" Name "+f1[i].getName());
		}
		}catch(Exception e) {
			
		}
		
	}
}
