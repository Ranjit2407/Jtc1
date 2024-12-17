class hello{
	int a=12;
	int b=56;
	static int c=15;
	
	void m1(){
		System.out.println("Instance method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(){
		System.out.println("Static method");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}
class Method{
	public static void main(String arg[]){
		hello h1=null;
		//h1.m1();
		h1.m2();
		//hello.m1();
		hello.m2();
		hello h2=new hello();
		h2.m1();
		h2.m2();
	}
}