package com.collection;


import java.util.*;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> link1=new LinkedList<Integer>();
		link1.add(12);
		link1.add(11);
		link1.add(1, 2);
		link1.addFirst(15);
		link1.addLast(18);
		System.out.println(link1);
		
		LinkedList<String> link2=new LinkedList<String>(Arrays.asList("apple","banana","mango","papaya"));
		LinkedList<String> link3=new LinkedList<String>(Arrays.asList("apple","mango"));
		link2.removeAll(link3);
		System.out.println(link2);
	}
}
