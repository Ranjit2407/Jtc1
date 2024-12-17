class hello{
	int a=10;
	int b=15;
	static int c =45;
	
	void m1(){
		int a1=13;
		//static int a2=12;
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a1);
		//System.out.println(a2);
		
		
		
	}
	static void m2(){
		int a3=14;
		//static int a4=17;
		System.out.println("m2 in hello");
		//System.out.println("a"+a);
		//System.out.println("b"+b);
		System.out.println(c);
		System.out.println(a3);
		//System.out.println(a4);
	}
}
class Instance2{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
		h1.m2();
		
		
	}
}