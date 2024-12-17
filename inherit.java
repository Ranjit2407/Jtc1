class Details{
	int id;
	String name;
	String city;
	
	Details(){
		this.id=id;
		this.name=name;
		this.city=city;
	}
}

class Student extends Details{
	String course;
	String doe;
	
	Student(int id, String name, String city, String course, String doj){
		super(id,name,city);
		this.course=course;
		this.doe=doe;
	}
	void show(){
		System.out.println(".....Student details......");
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
		System.out.println(course);
		System.out.println(doe);
	}
}
class Teacher extends Details{
	
	String subject;
	String doj;
	
	Teacher(int id, String name, String city, String subject, String doj){
		super(id,name,city);
		this.subject=subject;
		this.doj=doj;
	}
	void show(){
		System.out.println(".....Teacher details......");
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
		System.out.println(subject);
		System.out.println(doj);
	}
}
class detail{
	public static void main(String arg[]){
		Student s1= new Student(12,"raj","ssm","12-march-2024","java");
		Teacher t1=new Teacher(13,"rohut","delhi","java","13-april-2022");
		s1.show();
		t1.show();
	}
}