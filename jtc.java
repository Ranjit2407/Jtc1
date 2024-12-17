class A{
	void m1(){
		System.out.println("m1 in A");
	}
}
class B extends A{
	void m2(){
		System.out.println("m1 in B");
	}
}
class c{}
class Hello{
	void m11(){
		System.out.println("m11 in Hello");
	}
	int m12(){
		System.out.println("m12 in Hello");
		return 200;
	}
	A m13(){
		System.out.println("m13 in Hello");
		return new A();
	}
	A m14(){
		System.out.println("m14 in Hello");
		return new B();
	}
	B m15(){
		System.out.println("m15 in Hello");
		return new B();
	}
	/*B m16(){
		System.out.println("m16 in Hello");
		return (B)new A();
	}
	A m17(){
		System.out.println("m17 in Hello");
		return new c();
	}
	B m18(){
		System.out.println("m18 in Hello");
		return (B)m13();
	}*/
	B m19(){
		System.out.println("m19 in Hello");
		return (B)m14();
	}
	
}
public class jtc{
	public static void main(String arg[]){
		Hello h1 = new Hello();
		int i1=h1.m12();
		System.out.println(i1);
		//h1.m16();
		//h1.m18();
		h1.m19();
		A a1=h1.m14();
		B b1=(B)h1.m14();
		b1.m1();
		b1.m2();
	}
}