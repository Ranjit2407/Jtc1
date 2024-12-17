class Hello{
	int a=10;
	static int b=30;
	void m1(){
		System.out.println("m1 in hello");
	}
	static void m2(){
		System.out.println("m2 in hello");
	}
	void m11(){
		System.out.println("m11 in hello");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	static void m22(Hello h1){
		System.out.println("m22 in hello");
		//System.out.println(a);
		System.out.println(h1.a);
		System.out.println(b);
		//m1();
		m2();
		h1.m1();
	}
}
class Method2{
	public static void main(String arg[]){
		Hello.m22(new Hello());
		Hello.m22(null);
	}
}