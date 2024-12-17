class hello{
	void logical_not(){
		System.out.println("Working on logical_not");
		System.out.println(!true);
		System.out.println(!false);
	}
	void bitwise_and(){
		System.out.println("Working on bitwise_and");
		System.out.println(0&0);
		System.out.println(0&1);
		System.out.println(1&0);
		System.out.println(1&1);
		//System.out.println(10&&23);
		System.out.println(10&23);
	}
	void bitwise_or(){
		System.out.println("Working on bitwise_or");
		System.out.println(0|0);
		System.out.println(0|1);
		System.out.println(1|0);
		System.out.println(1|1);
		//System.out.println(10|23);
		System.out.println(10|23);
	}
	
	void bitwise_xor(){
		System.out.println("Working on bitwise_xor");
		System.out.println(0^0);
		System.out.println(0^1);
		System.out.println(1^0);
		System.out.println(1^1);
		//System.out.println(10^23);
		System.out.println(10^23);
	}
	void bitwise_leftshift(){
		System.out.println("Working on bitwise_leftshift");
		System.out.println(10<<1);
		System.out.println(10<<29);
		System.out.println(10<<28);
	}
	void bitwise_rightshift(){
		System.out.println("Working on bitwise_rightshift");
		System.out.println(10>>1);
		System.out.println(-10>>1);
		
	}
	void bitwise_unsignedrighttshift(){
		System.out.println("Working on bitwise_unsignedrighttshiftshift");
		System.out.println(10>>>1);
		System.out.println(-10>>>1);
		
	}
	void bitwise_negation(){
		System.out.println("Working on bitwise_negation");
		byte b1=24;
		System.out.println(b1);
	}
	
	
}
class JTC{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.logical_not();
		h1.bitwise_and();
		h1.bitwise_or();
		h1.bitwise_xor();
		h1.bitwise_leftshift();
		h1.bitwise_rightshift();
		h1.bitwise_unsignedrighttshift();
		h1.bitwise_negation();
	}
}