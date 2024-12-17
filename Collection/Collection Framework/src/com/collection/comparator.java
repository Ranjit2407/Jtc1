package com.collection;

import java.util.*;

class myComapre1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}

class myCompare implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
//		asscending order
		return o1-o2;
//		descending order
//		return o2-o1;
	}
	
}

public class comparator {
	public static void main(String[] args) {
		
		List<String> word=Arrays.asList("apple","banana","by");
		word.sort(new myComapre1());
		System.out.println(word);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.sort(new myCompare());
		System.out.println(list);
	}
}
