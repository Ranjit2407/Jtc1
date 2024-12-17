interface i1{
	public abstract void m1();
	/*void m1(){
		System.out.println("m1");
	}*/
	default void m2(){
		System.out.println("m2 in i1");
	}
	static void m3(){
		System.out.println("m3 in i1");
	}
}
class hello implements i1{
	public void m1(){
		System.out.println("m1 in hello");
	}
	public void m2(){
		System.out.println("m2 in hello");
	}
	public void m3(){
		System.out.println("m3 in hello");
	}
}
public class I4{
	public static void main(String arg[]){
		i1 a1=null;
		a1=new hello();
		a1.m1();
		a1.m2();
		i1.m3();
	}
}
