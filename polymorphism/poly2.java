class Hello{
	final void m1(){
		System.out.println("m1 in Hello");
	}
	static void m2(){
		System.out.println("m2 in hello");
	}
	void m3(){
		System.out.println("m3 in hello");
	}
}
class Hai extends Hello{
	/*void m1(){
		System.out.println("m1 in hai");
	}*/
	/*void m2(){
		System.out.println("m2 in hai");
	}*/
	/*static void m3(){
		System.out.println("m3 in hai");
	}*/
	static void m2(){
		System.out.println("m2 in hai");
	}
	void m3(){
		System.out.println("m4 in hai");
	}
	
}
public class poly2{
	public static void main(String arg[]){
		Hai h1= new Hai();
		h1.m1();
		h1.m2();
		h1.m3();
	}
}