class Hello{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in hello");
	}
	static{
		System.out.println("SB in hello");
	}
	Hello(){
		System.out.println("Default constructor in hello");
	}
	void Hello(){
		System.out.println("Hello in Hello");
	}
	Hello(int a1){
		System.out.println("1para constructor in hello");
		a=a1;
	}
	Hello(int a1, int b1){
		a=a1;
		b=b1;
	}
	{
		System.out.println("IB in hello");
	}
	static{
		System.out.println("SB in hello");
	}
	void show(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class constructor1{
	public static void main(String arg[]){
		Hello h1=new Hello();
		h1.show();
		h1.Hello();
	}
}