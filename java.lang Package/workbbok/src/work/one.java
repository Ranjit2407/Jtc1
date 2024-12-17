package work;
class ClassService{
	static void showClassInfo(Object obj) {
		Class c1=obj.getClass();
		System.out.println("Name :"+c1.getName());
		System.out.println("Name:"+c1.getSimpleName());
		System.out.println("super class:"+c1.getSuperclass());
		System.out.println("package:"+c1.getPackage());
		Class inter[]=c1.getInterfaces();
		for(int i=0;i<inter.length;i++) {
			Class in=inter[i];
			System.out.println(in);
		}
	}
}
interface inter1{}
interface inter2{}
class Person{}
class Students extends Person implements inter1,inter2{
	int id;
	String name;
	long phone;
	public Students(int id, String name, long phone) {
		Students st1=new Students(99, "rajnish",123456);
		Students st2=new Students(99, "rajnish", 123456);
		System.out.println("====:"+(st1==st2));
		System.out.println("eq():"+st1.equals(st2));
		System.out.println("employee");
	}
		
		
}
class Student{
	int sid;
	String name;
	
	public Student(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
}

class Employee{
	int eid;
	String name;
	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Employee emp=(Employee) obj;
		return this.eid=emp.eid && this.name.equals(emp.name);
	}
	
}





public class one {

}
