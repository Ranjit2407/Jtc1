package com.collection;
import java.util.*;

class Gen<T>{
	T obj;
	
	public Gen(T obj) {
		this.obj=obj;
	}
	
	void show() {
		System.out.println(obj.getClass().getName());
	}

	public T getObj() {
		return obj;
	}
	
	
	
}



public class generics1 {
	public static void main(String[] args) {
		Gen<Integer> gen=new Gen<Integer>(10);
		gen.show();
		System.out.println(gen.getObj());
		
		Gen<String> gen1=new Gen<String>("raj");
		gen1.show();
		System.out.println(gen1.getObj());
	}
}
