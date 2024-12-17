package com.exception;

import java.io.IOException;

class Aexception extends Exception{
	
}
class Bexception extends RuntimeException{
	
}
class Handling{
	void m1() throws Aexception,InstantiationException{
		System.out.println("m1 in handling");
		throw new Aexception();
	}
	void m2() throws Bexception,IOException{
		System.out.println("m2 in handling");
		throw new Bexception();
	}
	void m3() throws IOException{
		System.out.println("m3 in handling");
		try {
		m1();
		m2();
		}catch (Aexception | InstantiationException e) {
			
		}
		
	}
}


public class Test3 {
	public static void main(String[] args) throws IOException{
		Handling h=new Handling();
		h.m3();
		
	}
}
