class Animal{
	int a=67;
	int b=98;
	static int c=96;
	void eating(){
		System.out.println("Animal is eating");
	}
	int sleeping(){
		System.out.println("Animal is sleeping");
		return 10;
	}
	void thinking(){
		System.out.println("Animal is thinking");
	}
	static void seeing(){
		System.out.println("Animal is seeing");
	}
}
class Dog extends Animal{
	int a=101;
	int b=102;
	static int c=103;
	void eating(){
		System.out.println("Dog is eating");
	}
	int sleeping(){
		System.out.println("Dog is sleeping");
		return 10;
	}
	static void seeing(){
		System.out.println("Dog is seeing");
	}
	void barking(){
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal{
	void eating(){
		System.out.println("Cat is eating");
	}
	static void seeing(){
		System.out.println("Cat is seeing");
	}
	void drinking(){
		System.out.println("Cat is drinking");
	}
}
class jtc{
	public static void main(String arg[]){
		Animal h1=new Animal();
		h1.eating();
		h1.thinking();
		h1.seeing();
		Dog h2=new Dog();
		h2.eating();
		h2.thinking();
		h2.seeing();
		h2.barking();
		System.out.println("......................");
		Animal h3=null;
		h3=new Dog();
		h3.eating();
		h3.thinking();
		h3.seeing();
		//h3.barking();
		System.out.println(h3.a);
		System.out.println(h3.c);
	}
}