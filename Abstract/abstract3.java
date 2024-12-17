abstract class animal{
	public abstract void m3();
	public abstract void sleeping();
}
abstract class dog extends animal{
	public void eating(){
		System.out.println("dog is eating");
	}
}
abstract class mydog extends dog{
	public void sleeping(){
		System.out.println("mydog is sleeping");
	}
}
abstract class cat extends animal{
	public void eating(){
		System.out.println("cat is eating");
	}
	public void sleeping(){
		System.out.println("cat is sleeping");
	}
}
abstract class mycat extends cat{
	
}
class animal_factory{
	static final int DOG=1;
	static final int CAT=2;
	static animal getAnimal(int a){
		animal ani=null;
		if(a==1){
			ani=new mydog();
		}else{
			ani=new mycat();
		}
		return ani;
	}
}
public class abstract3{
	public static void main(String arg[]){
		animal ani=null;
		ani=animal_factory.getAnimal(animal_factory.DOG);
		show(ani);
		ani=animal_factory.getAnimal(animal_factory.CAT);
		show(ani);
	}
	static void show(animal ani){
		ani.eating();
		ani.sleeping();
	}
}