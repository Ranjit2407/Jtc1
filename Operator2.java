class hello{
	void increment_operator(){
		System.out.println("working on increment_operator");
		int a=10;
		int b= ++a + ++a;
		System.out.println("a :"+a);
		System.out.println("b: "+b);
	}
	void decrement_operator(){
		System.out.println("working on decrement_operator");
		int a=10;
		int b= --a + a--;
		System.out.println("a :"+a);
		System.out.println("b: "+b);
	}
	
	//WAP to check the given number is a postive or postive not.
	void case1(){
		System.out.println("working on case-1");
		int a=10;
		String s1=(a>0)?"number is postive":"not postive";
		System.out.println("working on case-1");
		int b=0;
		String s3=(b>0)?"number is postive":"not postive";
		System.out.println(s3);
		
	}
	
	//WAP to check the given number is a postive or negative or zero.
	void case2(){
		System.out.println("Working on case2");
		int a=5;
		String s2=(a>0)?"number is postive":(a==0)? "number is zero":"number is negative";
		System.out.println(s2);
	}
	// WAp to check the given number is odd ya even.
	void case3(){
		System.out.println("working on case3");
		int a1=20;
		int a2=(a1%2==0)?a1-1:a1*2;
		System.out.println(a2);
	}
	//WaP to get the greatest number out of 3 given number .
	void case4(){
		System.out.println("working on cas4");
		int n1=45;
		int n2=20;
		int n3=481;
		String s1=(n1>n2)?(n1>n3)?"n1 is greatest":"n3 is greatest":(n2>n3)?"n2 is greatest":"n3 is greatest" ;
		System.out.println(s1);
	}
	
	
}

class JTC{
	public static void main(String arg[]){
		hello h2=new hello();
		h2.increment_operator();
		h2.decrement_operator();
		h2.case1();
		h2.case2();
		h2.case3();
		h2.case4();
	}
}