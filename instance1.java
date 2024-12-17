class hello{
	int a=10;
	int b=15;
	static int c=45;
	
	void m1(){
		System.out.println("m1 method");
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		
		
	}
	static void m2(){
		System.out.println("m2 method");
		//System.out.println("a"+a);
		//System.out.println("b"+b);
		System.out.println("c"+c);
	}
}
class JTC{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
		h1.m2();
		hello h2=new hello();
		System.out.println("instance variable");
		System.out.println(h2.a);
		System.out.println(h2.b);
		System.out.println(h2.c);
		System.out.println("static variable");
		hello h3=new hello();
		System.out.println(h3.a);
		System.out.println(h3.b);
		
	}
}