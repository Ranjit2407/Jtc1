class Hai{
	Hai(){
		super(111);
		System.out.println("default");
		
	}
}
class Hello extends Hai{
	Hello(){
		super();
		System.out.println("default");
	}
}
class Inheritence4{
	public static void main(String arg[]){
		Hello h1=new Hello();
	}
}