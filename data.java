class A{
	int i=10; //class level variable 
	void a1(){
		System.out.println("a1 in class A");
		System.out.println("j class level variable "+new B().j);
	}
	void a2(){
		System.out.println("a2 in class A");
		System.out.println("k class level variable "+new D().k);
	}
}

class B{
	int j=-30;
	void a3(){
		System.out.println("a3 in class B");
		System.out.println("i class level variable "+new A().i);
	}
	void a4(){
		System.out.println("a4 in class B");
		System.out.println("k in class variable "+new D().k);
	}

}

class C{
	void a5(){
		System.out.println("a5 in class C");
		System.out.println("i in class variable "+new A().i);
	}

}

class D{
	int k=40;
	void a6(){
		System.out.println("k in class D");
		System.out.println("j in class variable: "+new B().j);
	}

}

class E{
	void a7(){
		System.out.println("a7 in class E");
		System.out.println("k in class variable: "+new D().k);
	}

}

class Variable{
	public static void main(String arg[]){
		System.out.println("Main method in class variable");
		System.out.println("i: "+new A().i);
		System.out.println("j: "+new B().j);
		System.out.println("k: "+new D().k);
		new A().a1();
		new A().a2();
		new B().a3();
		new B().a4();
		new C().a5();
		new D().a6();
		new E().a7();
		
	}

}