class Literal{
	void integral(){
		int a=56739;
		System.out.println("a in decimal format");
		System.out.println("a: "+a);
		
		//int a1=05678;  error
		//System.out.println("a1 is not octal format");
		//System.octal.println("a1: "+a1);
		int a2=074521;
		System.out.println("a2 in octal format");
		System.out.println("a2: "+a2);
		
		int a3=0x45ba;
		int a4=0X839da;
		System.out.println("a3 in hexadecimal format");
		System.out.println("a3: "+a3); //17850
		System.out.println("a4: "+4);  //4
		
		//int a5=0b4583;  error
		//Sytem.out.println("a5 is not in binary format");
		//System.out.println("a5: "+a5);
		int a6=0b01010100;
		System.out.println("a6 in binary format");
		System.out.println("a6: "+a6);  //84
		
		
		
	}
	
	void Floating(){
		//float a7=1234.67; error
		//System.out.println("a7 is not in floating value");
		//System.out.println("a7: "+a7);
		float a8=1235.6f;
		System.out.println("a8 in floating value");
		System.out.println("a8: "+a8);
		float a9=1285.685F;
		System.out.println("a9 in floating value");
		System.out.println("a9: "+a9);
		
		double a10=6748.4d;
		System.out.println("a10 in double");
		System.out.println("a10: "+a10);
		
		
	}
	
	void Boolean(){
		boolean a11=true;
		System.out.println("a11 in boolean");
		System.out.println("a11: "+a11);
	}
}

class Home{
	public static void main(String arg[]){
		new Literal().integral();
		new Literal().Floating();
		new Literal().Boolean();
	}
}