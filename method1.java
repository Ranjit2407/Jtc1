class hello{
	int a=15;
	int b=98;
	static int c=87;
	
	{
		System.out.println("instance block");
		
	}
	static{
		System.out.println("static block");
	}
	int m1(){
		System.out.println("m1 in hello");
		return 10;
	}
	void m2(){
		System.out.println("m2 in hello");
		//return 10.2;
	}
	static void m3(){
		System.out.println("static method");
	}
	static int m4(int a1){
		System.out.println("m4 in hello");
		return a1;
	}
}
class Method1{
	public static void main(String arg[]){
		hello h1=new hello();
		int a2=h1.m1();
		h1.m2();
		h1.m3();
		System.out.println(a2);
		int a3=hello.m4(190837);
		System.out.println(a3);
	}
}