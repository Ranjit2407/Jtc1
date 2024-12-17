package workbook;
class ArithmeticOperation{
	public static int getReminder(String val1,String val2) {
		int rem=-1;
		try {
			System.out.println("getReminder");
			System.out.println("Values\t:" + val1 + "\t" + val2);
			System.out.println("converting into int type-- ");
			int ab=Integer.parseInt(val1);
			int bc=Integer.parseInt(val2);
			System.out.println("accessing reminder");
			rem=ab%bc;
			System.out.println("Reminder \t" +rem);
			return rem;
		}catch(ArithmeticException e){
			System.out.println("catch in getReminder");
		}finally {
			System.out.println("finally block in getReminder");
		}
		return rem;
	}
}
public class four {
	public static void main(String[] args) {
		System.out.println("in main");
		int ab=ArithmeticOperation.getReminder("12", "7");
		System.out.println("in main rem\t:"+ab);
		int xy=ArithmeticOperation.getReminder("12","0");
		System.out.println("in main rem\t:" +xy);
		try {
			int rt=ArithmeticOperation.getReminder("12", "j");
			System.out.println("in main rem\t:" +rt);
		}catch(NumberFormatException e) {
			System.out.println("catch in main method");
		}System.out.println("\n main completed");
	}
}
