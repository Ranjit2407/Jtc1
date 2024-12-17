class Hello{
	int a;
	/*final Hello(int a1){
		System.out.println("1para constructor in hello");
		a=a1;
	}*/
	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
	}
	
}
class constructor3{
	public static void main(String arg[]){
		//Hello h1=new Hello();
		//h1.m1();
		Hello h2=new Hello();
		h2.m1();
	}
}