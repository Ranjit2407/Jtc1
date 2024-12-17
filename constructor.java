class Hello{
	int a;
	int b;
	static int c=30;
	Hello(){
		System.out.println("defalut constructor in hello");
	}
	Hello(int a1){
		System.out.println("1parameter in hello");
		a=a1;
	}
	Hello(int a1, int b1){
		System.out.println("2parameter in hello");
		a=a1;
		b=b1;
	}
	void m1(){
		System.out.println("m1 in method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class constructor{
	public static void main(String arg[]){
		Hello h1=new Hello();
		h1.m1();
		Hello h2=new Hello(111);
		h2.m1();
		Hello h3=new Hello(11,22);
		h3.m1();
		
	}
}