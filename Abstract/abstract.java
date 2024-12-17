abstract class university{
	abstract void genId();
}
class student extends university{
	void genId(){
		System.out.println("Student");
	}
}
class teacher extends university{
	void genId(){
		System.out.println("teacher");
	}
}
class admin extends university{
	void genId(){
		System.out.println("admin");
	}
}
class abstract1{
	public static void main(String arg[]){
		university u1=new student();
		university u2=new teacher();
		university u3=new admin();
		u1.genId();
		u2.genId();
		u3.genId();
	}
}

abstract class hello{
	abstract void m1();
	void m2(){
		System.out.println("m2 in class hello");
	}
}
class hai extends hello{
	void m1(){
		System.out.println("m1 in class hai");
	}
}
class JTC{
	public static void main(String arg[]){
		hello h1= new hai();
		h1.m2();
		h1.m1();
	}
}