class Student{
	int sid;
	String sname;
	String scity;
	
	void show(){
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(scity);
	}
	Student(int sid, String sname, String scity){
		this.sid=sid;
		this.sname=sname;
		this.scity=scity;
	}
	
	
}
class Hello{
	Hello(){
		this(10);
		System.out.println("Default");
	}
	Hello(int a1){
		this(12,"ram");
		System.out.println("1para");
	}
	Hello(int a1,String s1){
		System.out.println("2 para");
	}
	Hello(String s1,int a1){
		this();
		System.out.println("3para");
		
	}
	
	
}
class JTC{
	public static void main(String arg[]){
		Student h1=new Student(111,"raj","delhi");
		Student h2=new Student(12,"nitish","noida");
		Hello h3=new Hello();
		Hello h4=new Hello();
		Hello h5=new Hello();
		Hello h6=new Hello();
		
		h1.show();
		h2.show();
		
	}
}