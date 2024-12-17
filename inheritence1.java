class Hello{
	int a=10;
	int b=20;
	static int c=30;
	
	{
		System.out.println("IB in hello");
	}
	static{
		System.out.println("Sb in hello");
	}
	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(){
		System.out.println("m2 in hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}

class Hai extends Hello{
	void showall(){
		System.out.println("Show all in hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		m1();
		m2();
	}
}
class Inheritence2{
	public static void main(String arg[]){
		Hai h1= new Hai();
		System.out.println(h1.a);
		h1.m1();
		
		Hello h2=new Hello();
		h2.m1();
		h1.showall();
	}
}