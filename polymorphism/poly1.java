class Hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
	void m2(int a){
		System.out.println("m2 in Hello");
	}
	private void m3(){
		System.out.println("m3 in Hello");
	}
	protected int m4(){
		System.out.println("m4 in Hello");
		return 300;
	}
}
class Hai extends Hello{
	void m1(){
		System.out.println("m1 in Hai");
	}
	/*int m2(int a){
		System.out.println("m2 in Hai");
		return 10;
	}*/
	void m2(int a){
		System.out.println("m2 in Hai");
	}
	void m2(int a, int b){
		System.out.println("m2 in hai ab");
	}
	public void m3(){
		System.out.println("m3 in hai");
	}
	/*int m4(){
		System.out.println("m4 in hai");
		return 19;
	}*/
	public int m4(){
		System.out.println("m4 in hai public");
		return 156;
	}
	private void m5(){
		System.out.println("m5 in Hai");
	}
}
public class poly1{
	public static void main(String arg[]){
		Hai h1= new Hai();
		h1.m1();
		h1.m2(11);
		h1.m2(11,22);
	}
}