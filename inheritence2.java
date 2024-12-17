class Hai{
	int a;
	Hai(int a){
		System.out.println("1para in hello");
		this.a=a;
	}
}
class Hello extends Hai{

}
class Inheritence3{
	public static void main(String arg[]){
		Hello h1=new Hello(10);
	}
}