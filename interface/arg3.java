class hello{
	int a;
	int b;
	static int c=30;
	hello(int a){
		System.out.println("hello (int a)");
		this.a=a;
	}
	hello(int a, int b){
		System.out.println("hello (int a ,int b)");
		this.a=a;
		this.b=b;
	}
	hello(int... a){
		System.out.println("hello (int... a)");
	}
	void show(){
		System.out.println("show in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class arg3{
	public static void main(String arg[]){
		hello h1=new hello();
	    hello h2=new hello();
		hello h3=new hello();
		h3.show();
	}
}