
//Write a Java program to update an array element by the given element.
package Practice;
import java.util.*;
public class ArrayList5 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		System.out.println(l1);
//		update 
		l1.set(0, "raj");
		System.out.println("update :"+l1);
	}
}
