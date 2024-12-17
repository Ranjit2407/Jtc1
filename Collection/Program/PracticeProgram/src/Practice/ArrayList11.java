
//Write a Java program to reverse elements in an array list.
package Practice;
import java.util.*;
public class ArrayList11 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println("after reverse :"+l1);
	}
}
