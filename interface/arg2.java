class Hai{
}
class hello{
	void m1(){
		System.out.println("m1 in hello");
	}
	void m1(int... a){
		System.out.println("m1 (int a) in hello");
		System.out.println(a);
	}
	void m1(Hai hai){
		System.out.println("m1 (Hai hai)");
	}
	void m2(Object O){
		System.out.println("m2 (object)");
	}
	void m2(hello h){
		System.out.println("m2 (hello)");
	}
	void m2(String arg){
		System.out.println("m2 (String)");
	}
	
}
public class arg2{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1(11,22);
		h1.m2(null);
	}
}