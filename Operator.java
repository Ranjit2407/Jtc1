class operator{
	void assignment_operator(){
		System.out.println("working on assignment_operator");
		int a=10;
		int b=a;
		System.out.println("b: "+b);
		System.out.println(b==a);
		//Type casting
		byte b1=10;
		short s1=b1;
		System.out.println("s1: "+s1);
		System.out.println(s1==b1);
		
		short s2=20;
		byte b2=(byte)s2;
		System.out.println("b2: "+b2);
		System.out.println(b2==s2);
	}
	
	void relational_operator(){
		System.out.println("Working on relational_operator");
		int i1=25;
		short s3=30;
		System.out.println(i1>s3);
		System.out.println(i1>=s3);
		System.out.println(i1<s3);
		System.out.println(i1<=s3);
		System.out.println(i1==s3);
		System.out.println(i1!=s3);
	}
	
	void logical(){
		System.out.println("working on logical");
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(true && true);
		System.out.println(false && false);
		
		String db_userid="rajnish2580";
		String db_pass="rajnish123";
		String uid="rajnish2580";
		String upass="rajnish123";
		boolean result=uid==db_userid && upass==db_pass;
		System.out.println(result);
	}
}
class JTC{
	public static void main(String arg[]){
		operator h1=new operator();
		h1.assignment_operator();
		h1.relational_operator();
		h1.logical();
	}
}