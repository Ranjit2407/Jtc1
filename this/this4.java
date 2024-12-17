class hello{
	int a;
	int b;
	static int c=30;
	hello(){
		System.out.println("default");
	}
	hello(int a){
		System.out.println("1para");
		this.a=a;
	}
	hello(int a, int b){
		System.out.println("2-para");
		this.a=a;
		this.b=b;
	}
	hello(int a, int b, int c){
		System.out.println("3-para");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show(){
		System.out.println("show");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
}
public class this4{
	public static void main(String arg[]){
		hello h1= new hello();
		h1.show();
		hello h2=new hello(11);
		h2.show();
		hello h3=new hello(11,22);
		h3.show();
		hello h4=new hello();
		h4.show();
	}
}