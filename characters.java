class Character{
	void character_literals(){
		System.out.println("Working on character");
		//char a1=B;
		char a2='B';
		System.out.println(a2);
		char a3=1;
		System.out.println(a3);
		char a4='1';
		System.out.println(a4);
		char a5='@';
		System.out.println(a5);
		//char a6='';
		char a7=' ';
		/*char a8='A ';
		char a9=' B';
		char a10='AB';
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
	    */
	    //escape sequence
		char a11='\n';
		System.out.print("Rajnish");
		System.out.print(a11);
		System.out.println("Kushwaha");
		char a12='\t';
		System.out.print("Rajnish");
		System.out.print(a12);
		System.out.println("Kushwaha");
		char a13='\r';
		System.out.print("Rajnishkr");
		System.out.print(a13);
		System.out.println("Kushwaha");
		char a14='\b';
		System.out.print("Rajnish");
		System.out.print(a14);
		System.out.println("Kushwaha");
		
		
		
		
	}
}

class House{
	public static void main(String arg[]){
		new Character().character_literals();
	}
}