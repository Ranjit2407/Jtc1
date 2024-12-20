package com.collection;

import java.util.*;

class Student implements Comparable<Student>{
	int marks;
	int age;
	String name;
	public Student(int marks, int age, String name) {
		this.marks = marks;
		this.age = age;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", age=" + age + ", name=" + name + "]";
	}
	
	public int compareTo(Student a) {
		if(this.age>a.age)
			return 1;
		else 
			return -1;
					
	}
}

//class Alpha implements Comparator<Student>{
//	public int compare(Student a,Student b) {
//		if(a.age>b.age)
//			return 1;
//		else 
//			return -1;
//	}
//}


public class comparatorInterface {
	public static void main(String[] args) {
		Student s1=new Student(98,18, "raj");
		Student s2=new Student(76, 17, "vinay");
		Student s3=new Student(100, 20, "ranjit");
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//Collections.sort(list);
//		Alpha a=new Alpha()
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
