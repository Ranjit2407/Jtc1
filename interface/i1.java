interface i{
	public static final int a=10;
	static final int b=20;
	final int c=30;
	int d=40;
	public abstract void m1();
	abstract void m2();
	void m3();
	
	/*{
		System.out.println("IB is not allowed");
	}*/
	
}

abstract class Hello implements i{
	public void m1(){
		System.out.println("m1 in hello");
	}
	public void m2(){
		System.out.println("m2 in hello");
	}
	/*
	public void m3(){
		System.out.println("m3 in hello");
	}*/
}

class hai extends Hello{
	public void m3(){
		System.out.println("m3 in hai");
	}
	void m4(){
		System.out.println("m4 in hai");
	}
}
public class i1{
	public static void main(String arg[]){
		//i1 a=new Hello();
		i a1=new hai();
		Hello h1=new hai();
		a1.m1();
		a1.m2();
		a1.m3();
		//a1.m4();
		h1.m1();
		h1.m3();
	}
}