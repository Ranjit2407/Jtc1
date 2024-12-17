class Hai{}
class Hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
	void m1(Hai h1){
		System.out.println("m1 (Hai hai)in hello");
	}
	void m1(int a[]){
		System.out.println("m1 (int a[])in hello");
	}
	void m1(Object O){
		System.out.println("m1 (Object o)in hello");
	}
	void m1(String str){
		System.out.println("m1 in (String str)in hello");
	}
	
}
class Over{
	public static void main(String arg[]){
		Hello h1= new Hello();
		h1.m1();
		h1.m1(new Hai());
		//h1.m1({10,20,30,39});
		//h1.m1(null);
		h1.m1("abc");
	}
}