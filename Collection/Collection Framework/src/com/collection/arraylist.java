package com.collection;
import java.util.*;

public class arraylist {
	public static void main(String[] args) {
		Collection cl=new ArrayList();
		System.out.println(cl.size());
		System.out.println(cl.isEmpty());
		cl.add("aa");
		cl.add("bb");
		cl.add("cc");
		cl.add("mm");
		cl.add("ll");
		cl.add(123);
		System.out.println(cl);
		System.out.println(cl.size());
		System.out.println(cl.isEmpty());
		System.out.println("**********");
		cl.remove("cc");
		System.out.println(cl);
		cl.clear();
		System.out.println(cl);
		
	}
}