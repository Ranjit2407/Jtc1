package com.reflact;
class A{
}

interface i1{
	
}
interface i2{
	
}
class Hello extends A implements i1,i2{
	int a=10;
	static int b;
	static{
		System.out.println("sb in hello");
	}
	{
		System.out.println("ib in hello");
	}
	
	Hello(){
		System.out.println("def cons in hello");
	}
	Hello(int a){
		System.out.println("1para cons in hello");
	}
	void show() {
		System.out.println("show in hello");
		System.out.println(a);
		System.out.println(b);
	}
}


public class Test {
	public static void main(String[] args) throws Exception{
		Hello h1=new Hello();
		h1.show();
		System.out.println("**************");
		Class cls=Class.forName("com.reflact.Hello");
		Hello h2=(Hello) cls.newInstance();
		h2.show();
		ClassLoader cl=cls.getClassLoader();
		System.out.println(cl);
		System.out.println(cls.getName());
		System.out.println(cls.getPackageName());
		System.out.println(cls.getSuperclass());
		Class cls1[]=cls.getInterfaces();
		for(int i=0;i<cls1.length;i++) {
			System.out.println(cls1[i].getName());
		}
	}
}
