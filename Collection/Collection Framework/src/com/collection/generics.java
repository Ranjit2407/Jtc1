package com.collection;
import java.util.*;

class Customer{
	int id;
	String name;
	int age;
	long phone;
	
	
	public Customer() {
		
	}


	public Customer(int id, String name, int age, long phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	String show() {
		System.out.println("show method");
		return toString()
	}
	
	
}

public class generics {
	public static void main(String[] args) {
		ArrayList<Customer> cus=new ArrayList<Customer>();
		cus.add(new Customer(1,"raj",18,896363));
		cus.add(new Customer(2,"raj",18,896363));
		cus.add(new Customer(3,"raj",18,896363));
		cus.add(new Customer(4,"raj",18,896363));
		cus.add(new Customer(5,"raj",18,896363));
		
		System.out.print(cus);
		
		Iterator<Customer> itr=cus.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
