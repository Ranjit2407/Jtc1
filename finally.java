class Finally{
	public static void main(String arg[]){
		final int i=10;
	    System.out.println("i: "+i);
		//i=20;
		System.out.println("i: "+i);
	}
	
	
}

class Hello{
	int i=1;
	void a1(){
		System.out.println(new Hey().j);
	}
	void a2(){
		System.out.println(new Hii().k);
	}
}

class Hey{
	int j=5;
	void a3(){
		System.out.println(new Hii().k);
	}
}

class Hii{
	int k=8;
	void a4(){
		System.out.println(new Hello().i);
	}
}

class Concatation{
	public static void main(String arg[]){
		System.out.println("class hello hey hii in concat");
		new Hello().a1();
		new Hello().a2();
		new Hey().a3();
		new Hii().a4();
		
	}
}