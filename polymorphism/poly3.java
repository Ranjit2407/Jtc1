class A{
	
}
class B extends A{
	
}
class Hello{
	A m1(){
		System.out.println("m1 in Hello");
		return new A();
	}
	B m2(){
		System.out.println("m2 in Hello");
		return new B();
	}
	A m3(A a1){
		System.out.println("m3 in Hello");
		return a1;
	}
	A m4(B b1){
		System.out.println("m4 in Hello");
		return b1;
	}
}
class Hai{
	B m1(){
		System.out.println("m1 in HAi");
		return new B();
	}
	A m2(){
		System.out.println("m2 in Hai");
		return new A();
	}
	A m3(B b1){
		System.out.println("m3 in Hai");
		return b1;
	}
	A m4(A a1){
		System.out.println("m4 in HAi");
		return a1;
	}
}
public class poly3{
	public static void main(String arg[]){
		Hai h1=new Hai();
		h1.m1();
	}
}