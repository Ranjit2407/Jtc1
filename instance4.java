class hello{
	void m1(){
		System.out.println("m1 in hello");
	}
}
class Instance3{
	int a=10;
	static int b=20;
	hello h1=new hello();
	static hello h2=new hello();
	public static void main(String arg[]){
		System.out.println("main method");
		//System.out.println(a);
		System.out.println(b);
		//System.out.println(h1);
		System.out.println(h2);
		//h1.m1();
		h2.m1();
	}
}