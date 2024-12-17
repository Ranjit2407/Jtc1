
// Write a Java program to sort a given array list.
package Practice;
import java.util.*;
public class ArrayList8 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(5);
		l1.add(7);
		l1.add(2);
		l1.add(3);
		System.out.println("before sorting : "+l1);
//		after sorting
		Collections.sort(l1);
		System.out.println("after sorting : "+l1);
	}
}
