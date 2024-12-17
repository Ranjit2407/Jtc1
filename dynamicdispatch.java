class hello{
}
class hai extends hello{
	void m1(){
		System.out.println("hai");
	}
}
class dynamic_disptch{
	public static void main(String arg[]){
		hello h1= new hello();
		hai h2=new hai();
		hello h3=new hai();// dynamic_disptch
		//hai h3=new hello();
		//hai h3=(hai)new hello();
	}
}