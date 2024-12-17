class A{
	void sum1(){
		System.out.println("sum1 in A");
	}
	void sum1(int a){
		System.out.println("sum1 (int a) in A");
	}
	void sum1(byte b1){
		System.out.println("sum (byte b1) in A");
	}
	void sum1(int a, byte b1){
		System.out.println("sum (int a byte b1) in A");
	}
	void sum1(int a, int b){
		System.out.println("sum (int a int b)in A");
	}
	void sum1(int a, double d){
		System.out.println("sum1 (int a double d)in A");
	}
	void sum1(double d, int a){
		System.out.println("sum1 (double d int a)in A");
	}
}
public class override{
	public static void main(String arg[]){
		A h1= new A();
		h1.sum1();
		h1.sum1(111);
		h1.sum1((byte)111);
		h1.sum1(111,22.2);
		h1.sum1(22.2,111);
	}
}