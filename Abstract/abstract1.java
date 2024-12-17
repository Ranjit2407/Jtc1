abstract class Hello{
	int a=10;
	int b=20;
	static int c=30;
	void m1(){
		System.out.println("m1 in hello");
	}
	abstract void m2();
	public abstract void m3();
}
abstract class hai extends Hello{
	void m2(){
		System.out.println("m2 in hai");
	}
}
class hai1 extends hai{
	/*void m3(){
		System.out.println("m3 in hai1");
	}*/
	public void m3(){
		System.out.println("m3 in hai1");
	}
}
public class abstract1{
	public static void main(String arg[]){
		Hello h=null;
		h=new hai1();
		h.m2();
		h.m3();
		
	}
}
