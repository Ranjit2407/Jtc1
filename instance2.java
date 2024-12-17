class hello{
	int a=10;
	int b=15;
	static int c =45;
	
	void m1(){
		System.out.println("m1 method");
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		
		
	}
	static void m2(hello h1){
		System.out.println("m2 in hello");
		//System.out.println("a"+a);
		//System.out.println("b"+b);
		System.out.println(h1.a);
		System.out.println(h1.b);
		System.out.println(h1.c);
	}
}
class Instance1{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
		h1.m2(h1);
		
		
	}
}