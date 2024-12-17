
//Write a Java program to search for an element in an array list.
package Practice;
import java.util.*;
public class ArrayList7 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
//		search element b
		if(l1.contains("b")) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}
}
