package com.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArraylist {
	public static void main(String[] args) {
		List<String>list=new CopyOnWriteArrayList<String>();
		list.add("egg");
		list.add("banana");
		System.out.println(list);
		
		for(String s:list) {
			System.out.println(s);
			if(s.equals("egg")) {
				list.add("butter");
			}
		}
		System.out.println(list);
	}
}
