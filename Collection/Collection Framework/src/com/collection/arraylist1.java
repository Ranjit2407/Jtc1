package com.collection;
import java.util.*;
public class arraylist1 {
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
		
		System.out.println("***iterator****");
		Iterator itr=cl.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
		}
		System.out.println("******");
		Object oArray[]=cl.toArray();
		for(Object o1 : oArray) {
			System.out.println(o1);
		}
	}
}
