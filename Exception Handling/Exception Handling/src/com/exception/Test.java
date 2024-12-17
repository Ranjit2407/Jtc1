package com.exception;

public class Test {
	public static void main(String arg[]) {
		 System.out.println("main method");
		 try {
			 int i=Integer.parseInt(arg[0]);
			 int i1=10/i;
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("plzz provide some value :" +e);
		 }catch(NumberFormatException e) {
			 System.out.println("plzz provide some numeric value :" +e);
		 }catch(ArithmeticException e) {
			 System.out.println("plzz provide non-zero number :" +e);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	}
}
