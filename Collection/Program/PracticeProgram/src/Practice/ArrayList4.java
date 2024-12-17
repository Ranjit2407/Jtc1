
//Write a Java program to retrieve an element (at a specified index) from a given array list.
package Practice;
import java.util.*;
public class ArrayList4 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		l1.add("dd");
		System.out.println(l1);
//		retrieve element
		System.out.println("first element : "+l1.get(0));
		System.out.println("last element : "+l1.getLast());
	}
}
