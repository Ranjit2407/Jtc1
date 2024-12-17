package com.collection;
import java.util.*;
public class vector {
	public static void main(String[] args) {
		Vector<Integer> arrayList=new Vector<Integer>();
//		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Thread t1=new Thread(()-> {
			for(int i=0;i<1000;i++) {
				arrayList.add(i);
			}
		});
		
		Thread t2=new Thread(()-> {
			for(int i=0;i<1000;i++) {
				arrayList.add(i);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(arrayList.size());
	}
}

