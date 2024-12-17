package com.exception;

import java.io.FileNotFoundException;

class Hai{
	void m1(int i) {
		System.out.println("m1 in hai");
		try {
		if(i==0) {
			throw new ArithmeticException();
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
		}catch(ArithmeticException e) {
			System.out.println("plzz provide non zero value :"+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("plzz provide some value :"+e);
		}
	}
	void m2(int i) throws FileNotFoundException{
		System.out.println("m2 in hai");
		try {
			if(i==0) {
			throw new InstantiationException();
			}
			else {
			throw new FileNotFoundException();
			}
		}catch (InstantiationException e) {
			System.out.println(e);
		}
	}
	void m3() throws FileNotFoundException,InstantiationException{
		System.out.println("m3 in hai");
		m2(1);
	}
}


public class CheckedUnchecked {
	public static void main(String[] args) throws FileNotFoundException,InstantiationException{
		Hai h1=new Hai();
		h1.m1(1);
		h1.m3();
	}
}
