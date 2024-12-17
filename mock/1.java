class Hello{
	{
		System.out.println("Ib in hello");
	}
	static{
		System.out.println("Sb in hello");
	}	
}
class hai{
	static Hello h1= new Hello();
	public static void main(String arg[]){
		System.out.println("main");
	}
	
}