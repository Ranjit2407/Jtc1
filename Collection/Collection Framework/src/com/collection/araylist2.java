package com.collection;
import java.util.*;
public class araylist2 {
	public static void main(String[] args) {
		List courseList=new ArrayList();
		courseList.add("java");
		courseList.add("python");
		System.out.println(courseList);
		
		List courseList1=new ArrayList();
		courseList1.add(12);
		courseList1.add(123);
		System.out.println(courseList1);
		
		courseList.add(courseList1);
		//courseList.addAll(courseList1);
		System.out.println(courseList);
		boolean bn=courseList.contains(courseList1);
		System.out.println(bn);
	}
}
