
//Write a Java program to iterate through all elements in an array list.
package Practice;
import java.util.*;

public class ArrayList2 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		System.out.println(l1);
		
		for(String s1:l1) {
			System.out.println(s1);
		}
	}
}
