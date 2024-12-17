class hello{
	void m1(){
		System.out.println("m1");
	}
	void m1(int a){
		System.out.println("m2");
	}
	void m1(int a, float b){
		System.out.println("m3");
	}
	void m1(float a, int b){
		System.out.println("m4");
	}
}
class method_overloading{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
		h1.m1(10);
		h1.m1(10,2.5f);
		h1.m1(2.4f,34);
	}
}