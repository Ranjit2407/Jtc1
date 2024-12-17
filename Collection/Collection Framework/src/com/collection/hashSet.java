package com.collection;
import java.util.*;
public class hashSet {
	public static void main(String[] args) {
		HashSet se1=new HashSet();
		se1.add(11);
		se1.add('h');
		se1.add("hello");
		se1.add(1.2);
		se1.add(11);
		System.out.println(se1);
		
		Iterator itr=se1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
