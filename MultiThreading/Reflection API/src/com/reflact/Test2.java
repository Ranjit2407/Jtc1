package com.reflact;

import java.lang.reflect.Method;

class Hai{
	void m1(String s1,String s2) {
		System.out.println("m1 in hai");
		System.out.println(s1);
		System.out.println(s2);
	}
	void m2(int a,int b) {
		System.out.println("m2 in hai");
		System.out.println(a);
		System.out.println(b);
	}
	void showAll() {
		System.out.println("showall in hai");
	}
}


public class Test2 {
	public static void main(String[] args) {
		try {
		Class cls=Class.forName("com.reflact.Hai");
		Hai h=(Hai) cls.newInstance();
		
		Method m[]=cls.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getName());
			if(m[i].getName().equals("m1")) {
				String s[]={"jtc","student"};
				m[i].invoke(h, s);
			}
		}
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getName());
			if(m[i].getName().equals("showAll")) {
				String s[]={"jtc","student"};
				m[i].invoke(h, null);
			}
		}
		
		
		}catch(Exception e) {
			
		}
	}
}
