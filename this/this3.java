class hello{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in hello");
	}
	static{
		System.out.println("SB in hello");
	}
	hello(int a, int b, int c){
		System.out.println("3para cons");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	hello(int a, int b){
		this(22,33,44);
		System.out.println("2-para");
		this.a=a;
		this.b=b;
	}
	hello(int a){
		this(444,333);
		System.out.println("1para con");
		this.a=a;
	}
	hello(){
		this(111);
		System.out.println("default");
		
	}
	void show(){
		System.out.println("show in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class this3{
	public static void main(String arg[]){
		hello h1= new hello();
		h1.show();
	}
}