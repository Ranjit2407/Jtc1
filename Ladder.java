//wap to check the given number is.
  //if the given number is 1 print number is 1.
  //if the given number is 2 print number is 2.
  //if the given number is 3 print number is 3.
  //if the given number is 4 print number is 4.
  //if the given number is 5 print number is 5.
  //if the given number is not 1 to 5 then print number is not in between 1 to5.
  
  
class hello{
	void lader_if(){
		System.out.println("working on lader_if");
		int a=4;
		if(a==1){
			System.out.println("number is 1");
		}else if(a==2){
			System.out.println("number is 2");
		}else if(a==3){
			System.out.println("number is 3");
		}else if(a==4){
			System.out.println("number is 4");
		}else if(a==5){
			System.out.println("number is 5");
		}
		else{
			System.out.println("number is not between1 to 5");
		}
	}
	
	//write a program to create a system of internation driving licence.
	//an applicant must carry out addhar card,pancard,passport.
	//system all automatically apply for all those document which are not available with an applicant.
	
	void driving_licence(){
		System.out.println("working on driving_licence");
		int ac=0;
		int pc=0;
		int pass=0;
		if(ac==1){
			if(pc==1){
				if(pass==1){
					System.out.println("Eligible");
				}else{
					System.out.println("Not eligible");
					System.out.println("Applying for passport");
				}
			}else{
				System.out.println("Not eligible");
				System.out.println("Applying for pancard");
				if(pass!=1){
					System.out.println("Applying for passport");
				}
			}
		}else{
			System.out.println("Not eligible");
			System.out.println("Applying for addhar");
			if(pc!=1){
				System.out.println("Applying for pancard");
			}if(pass!=1){
				System.out.println("Applying for passport");
			}
		}
	}
	
	//write a program to create a calculator.
	void switch_statement(){
		System.out.println("working on switch_statement");
		String s1="-";
		switch(s1){
			case "+":
				int a1=12;
				int a2=12;
				System.out.println(a1+a2);
				break;
				
		    case "-":
				int a3=13;
				int a4=14;
				System.out.println(a3-a4);
				break;
			
			case "*":
				int a5=13;
				int a6=14;
				System.out.println(a5*a6);
				break;
				
			case "/":
				int a7=13;
				int a8=14;
				System.out.println(a7/a8);
				break;
				
			case "%":
				int a9=13;
				int a10=14;
				System.out.println(a9%a10);
		}
	}
	
	//write a program to print 1 to 10.
	void case_4(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
	
	// write a program to print -10 to 10
	void case_5(){
		for(int i=-10;i<=10;i++){
			System.out.println(i);
		}
	}
	// write a program to print table of 2.
	void case_6(){
	for(int i=1;i<=10;i++){
		System.out.println("2*"+i+"="+(2*i));
	}
	}
	//write a program to print all those number 1 to 1000 divisible by 3 to 7.
	void case_7(){
		for(int i=1;i<=1000;i++){
			if(i%3==0 && i%7==0){
				System.out.println(i);
			}
		}
	}
}

class ladder{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.lader_if();
		h1.driving_licence();
		h1.switch_statement();
		h1.case_4();
		h1.case_5();
		h1.case_6();
		h1.case_7();
	}
}
  