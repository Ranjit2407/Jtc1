
//Write a Java program to shuffle elements in an array list.
package Practice;
import java.util.*;
public class ArrayList10 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(4);
		l1.add(6);
		l1.add(3);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println("after shuffling :"+l1);
	}
}
