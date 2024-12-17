interface i1{
	public static int a=10;
	public abstract void m1();
}
interface i2{
	int b=20;
	void m2();
}
interface i3 extends i1,i2{
	int c=30;
	void m3();
}
interface i4{
	int d=40;
	void m4();
}
interface i5{
	int e=50;
	void m5();
}
interface i6 extends i4,i5{
	int c=60;
	void m3();
}
class hello implements i3,i6{
	public void m1(){
		System.out.println("m1 in hello");
	}
	public void m2(){
		System.out.println("m2 in hello");
	}
	public void m4(){
		System.out.println("m4 in hello");
	}
	public void m5(){
		System.out.println("m5 in hello");
	}
	public void m3(){
		System.out.println("m3 in hello");
	}
	
	void show(){
		System.out.println("show in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a);
		//System.out.println(c);
		System.out.println(i3.c);
		System.out.println(i6.c);
	}
}

class I3{
	public static void main(String arg[]){
		i3 h=null;
		h=new hello();
		h.m1();
		h.m2();
		h.m3();
		//h.m4();
		i6 h1=null;
		h1=new hello();
		//h1.m1();
		h1.m4();
		h1.m5();
		h1.m3();
		hello h2=new hello();
		h2.show();
	}
}