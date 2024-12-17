class hello{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in hello");
		int a=101;
		int b=202;
		{
			System.out.println("local block in IB");
			int a1=111;
			int b1=222;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(a1);
			System.out.println(b1);
		}
	}
	static{
		System.out.println("SB in hello");
		int a=101;
		int b=202;
		{
			System.out.println("local block in SB");
			int a1=111;
			int b1=222;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a1);
			System.out.println(b1);
		}
	}
	hello(){
		System.out.println("default");
	}
	hello(int a1, int b1){
		
	}
	void m1(){
		System.out.println("m1 in hello");
	}
}
public class arg4{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
	}
}