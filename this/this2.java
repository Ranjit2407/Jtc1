class hello{
	int a;
	int b;
	static int c=30;
	{
		int a=101;
		int b=202;
		int c=303;
		System.out.println("IB in hello");
		System.out.println(this);
		System.out.println(this.hashCode());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static{
		int a=101;
		int b=202;
		int c=303;
		System.out.println("SB in hello");
		//System.out.println(this);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	hello(){
		System.out.println("default constructor");
		System.out.println(this);
		System.out.println(this.hashCode());
	}
	hello(int a){
		System.out.println("1-para");
		System.out.println(this);
		System.out.println(this.hashCode());
		this.a=a;
	}
	hello(int a, int b){
		System.out.println("2-para");
		System.out.println(this);
		System.out.println(this.hashCode());
		this.a=a;
		this.b=b;
	}
	void show(){
		int a=100;
		int b=200;
		int c=300;
		System.out.println("show");
		System.out.println(this);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	static void show1(){
		int a=999;
		int b=888;
		int c=777;
		System.out.println("show1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(this.a);
		//System.out.println(this.b);
		//System.out.println(this.c);
	}
}
public class this2{
	public static void main(String arg[]){
		hello h1= new hello();
		System.out.println(h1);
		System.out.println(h1.hashCode());
		h1.show();
		System.out.println("2nd object");
		hello h2=new hello(999);
		h2.show();
	}
}