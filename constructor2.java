class Hello{
	int a;
	int b;
	static int c;
	Hello(int a1){
		System.out.println("1para in hello");
		a=a1;
	}
	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class constructor2{
	public static void main(String arg[]){
		//Hello h1=new Hello();
		//h1.m1();
		Hello h2=new Hello(111);
		h2.m1();
	}
}