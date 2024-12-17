class hello{
	int a=10;
	int b=20;
	void m1(){
		System.out.println("m1 in hello");
	}
	void m1(int a){
		System.out.println("m1 (int a) in hello");
	}
	void m1(int... a){
		System.out.println("m1 (int... a) in hello");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	void m1(double d, int a){
		System.out.println("m1 (double d, int a) in hello");
	}
	void m2(int... a){
		System.out.println("m2 in hello");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	void m2(int a, int b){
		System.out.println("m2 (int a, int b) in hello");
	}
}

public class arg1{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
		h1.m1(11);
		h1.m1(11,22,33,44,55);
		h1.m1(11.22,23);
		h1.m2();
	}
}