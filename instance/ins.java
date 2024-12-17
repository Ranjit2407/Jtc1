class outer{
	int a=10;
	int b=20;
	static int c=30;
	void m1(){
		System.out.println("m1 in outer");
	}
	static void m2(){
		System.out.println("m12 in outer");
	}
	class inner{
		int a1=101;
		//static int b1=202;
		static final int c1=303;
		void m11(){
			System.out.println("m11 in inner");
		}
		/*static void m12(){
			System.out.println("m12 in inner");
		}*/
		void showinner(){
			System.out.println("showinner in inner");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a1);
			//System.out.println(b1);
			System.out.println(c1);
			m1();
			m2();
		}
	}
	void showouter(){
		System.out.println("showouter in outer");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(a1);
		//System.out.println(b1);
		inner inr=new inner();
		System.out.println(inr.a1);
		System.out.println(inr.c1);
	}
}
public class ins{
	public static void main(String arg[]){
		outer otr=new outer();
		otr.m1();
		outer.inner o12=new outer().new inner();
		o12.m11();
	}
}