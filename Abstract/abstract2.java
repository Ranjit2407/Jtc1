abstract class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB in hello");
	}
	static{
		System.out.println("SB in hello");
	}
	Hello(){
		System.out.println("Default constructor");
	}
	Hello(int a, int b){
		System.out.println("2para constructor");
		this.a=b;
		this.b=b;
	}
	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	abstract void m2();
		/*private abstract void m3();
		final abstract void m4();
		static void m5();*/
		
	

}
class hai extends Hello{
	public void m2(){
		System.out.println("m2 in hai");
	}
	//void m3();
	public void m3(){
		System.out.println("m3 in hai");
	}
	void show(){
		System.out.println("show in hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class abstract2{
	public static void main(String arg[]){
		Hello h2=null;
		h2=new hai();
		h2.m2();
		//h2.m3();
		//h2.show();
		hai h1=(hai)h2;
		h1.m3();
		h1.show();
		new hai().show();
		
	}
}