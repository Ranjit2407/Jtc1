package com.collection;
import java.util.*;

class Hello{
	
}

public class ennumaration {
	public static void main(String[] args) {
//		collection element
		Vector ve=new Vector();
		ve.addElement("jtc india");
		ve.addElement(12345);
		ve.add(new Hello());
		ve.addElement(12345);
		System.out.println(ve);
		
		Enumeration enm=ve.elements();
		while (enm.hasMoreElements()) {
			Object o=enm.nextElement();
			System.out.println(enm);
			
		}
		
//		key and value
		Properties p=new Properties();
		p.put("Name", "Email");
		p.put("jhantu", "jhantu@gmail.com");
		p.put("bdka jhantu", "bdk@gmail.com");
		p.put("bdk jhantu", "bdk@gmail.com");
		System.out.println(p);
		
		
		Enumeration enm1=p.propertyNames();
		while (enm1.hasMoreElements()) {
			Object o=enm1.nextElement();
			Object pvale=p.get(o);
			System.out.println(o+" : "+pvale);
			
			
		}
	}
	
	
}
