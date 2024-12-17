class hello{
	int a;
	int b;
	static int c=20;
	hello(){
		System.out.println("Default constructor in hello");
	}
	hello(int a){
		System.out.println("(int a) para");
		this.a=a;
	}
	hello(int a, int b){
		System.out.println("(int a, int b) para");
		this.a=a;
		this.b=b;
	}
	hello(int a, int b, int c){
		System.out.println("(int a, int b, int c) para");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show(){
		int a=101;
		int b=202;
		int c=303;
		System.out.println("void show");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
}
public class this1{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.show();
		hello h2=new hello(111);
		h2.show();
		hello h3=new hello(111,222);
		h3.show();
		hello h4=new hello(111,222,333);
		h4.show();
	}
}