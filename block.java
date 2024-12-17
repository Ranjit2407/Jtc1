class hello{
	int a=11;
	int b=12;
	static int c=13;
	
	{
		System.out.println("Instance block in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static{
		System.out.println("Static block in hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(){
		System.out.println("m2 in hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}

class Block{
	public static void main(String arg[]){
		System.out.println(hello.c);
		System.out.println(hello.c);
		hello h1=new hello();
		hello h2=new hello();
	}
}