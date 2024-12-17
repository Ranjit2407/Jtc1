package workbook;

public class MultipleTryCatch {
	public static void main(String[] args) {
		System.out.println("main method");
		String s=null;
		try {
			s=args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please provide the some value:");
			System.out.println(e);
		}
		int x=0;
		try {
			x=Integer.parseInt(s);
			System.out.println(x);
		}
		catch (NumberFormatException e) {
			System.out.println("please provide some integer");
			System.out.println(e);
		}
		try {
			int y=10/x;
			System.out.println(y);
		}catch (ArithmeticException e) {
			System.out.println("please provide dont zero");
			System.out.println(e);
		}
		System.out.println("main end");
	}
}
