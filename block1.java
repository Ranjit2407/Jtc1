class hello{
	int a=12;
	int b=45;
	static int c=15;
	
	{
		System.out.println("IB1 in hello");
	}
	static{
		System.out.println("SB1 in hello");
	}
	{
		System.out.println("IB2 in hello");
	}
	static{
		System.out.println("SB2 in hello");
	}
}
class Block1{
	int aa=76;
	static int bb=35;
	{
		System.out.println("IB1 in Block");
		System.out.println(aa);
		System.out.println(bb);
	}
	static{
		System.out.println("SB1 in block");
		//System.out.println(aa);
		System.out.println(bb);
	}
	public static void main(String arg[]){
		System.out.println("In main");
		System.out.println(hello.c);
		hello h1=new hello();
		hello h2=new hello();
		Block1 h3=new Block1();
	}

}