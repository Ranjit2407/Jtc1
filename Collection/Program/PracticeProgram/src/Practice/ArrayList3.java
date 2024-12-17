
// Write a Java program to insert an element into the array list at the first position.
package Practice;
import java.util.*;
public class ArrayList3 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		System.out.println(l1);
		System.out.println("add first and last position");
		l1.add(0,"dd");
		l1.add(4, "eee");
		System.out.println(l1);
	}
}
