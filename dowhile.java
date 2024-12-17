//write a program to print 1 to 10.

class hello{
	void while_loop(){
		System.out.println("working on while loop");
		int a=1;
		while(a<=10){
			System.out.println(a);
			a++;
		}
		
	}
	
	// write a program to print -10 to 10.
	void case_2(){
		System.out.println("working on case_2");
		int a=-10;
		while(a<=10){
			System.out.println(a);
			a++;
		}
	}
	
	// write a program to print table of 2.
	void case_3(){
		System.out.println("working on case_3");
		int a=1;
		while(a<=10){
			System.out.println("2*"+a+"="+(2*a));
			a++;
		}
		
	}
	//write a program to print all those number 1 to 1000 divisible by 3 to 7.
	
	void case_4(){
		System.out.println("working on case_4");
		int a=1;
		while(a<=1000){
			if(a%3==0 && a%7==0){
				System.out.println(a);
				
			}
			a++;
			
		}
	}
	
	//write a program to print 1 to 10.
	void case_5(){
		int a=1;
		do{
			System.out.println(a);
			a++;
		}while(a<=10);
	}
	//break
	void test1(){
		for(int i=1; i<=10; i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
	}
	
	//continue
	void test2(){
		for(int i=1; i<=10; i++){
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
	}
	
}


class While{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.while_loop();
		h1.case_2();
		h1.case_3();
		h1.case_4();
		h1.case_5();
		h1.test1();
		h1.test2();
	}
}

