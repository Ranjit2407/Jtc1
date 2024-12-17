class Details{
	int id;
	String name;
	String city;
}


class Student extends Details{
	
	String doe;
	String course;
	
	void show(){
		System.out.println("STudent detail");
		System.out.println("sid :"+id);
		System.out.println("sname : "+name);
		System.out.println("scity : "+city);
		System.out.println("doe : "+doe);
		System.out.println("course : "+course);
	}
}
class Teacher extends Details{
	int id;
	String name;
	String city;
	String doj;
	
	
	void show(){
		System.out.println("Teacher detail");
		System.out.println("tid :"+id);
		System.out.println("tname : "+name);
		System.out.println("tcity : "+city);
		System.out.println("doj : "+doj);
	}
	   
}
class Admin extends Details{
	int id;
	String name;
	String city;
	String dept;
	
	void show(){
		System.out.println("Admin detail");
		System.out.println("aid :"+id);
		System.out.println("aname : "+name);
		System.out.println("acity : "+city);
		System.out.println("dept : "+dept);
	}

}

class Inheritence{
	public static void main(String arg[]){
		Student s1=new Student();
		s1.id=10;
		s1.name="rajnish";
		s1.city="sasaram";
		s1.doe="12-march-2024";
		s1.course="java full stack";
		
		Teacher t1=new Teacher();
		t1.id=13;
		t1.name="amit";
		t1.city="Noida";
		t1.doj="12-april-2022";
		
		Admin a1=new Admin();
		a1.id=14;
		a1.name="Nivesh";
		a1.city="delhi";
		a1.dept="java";
		
		s1.show();
		t1.show();
		a1.show();
	}
}
