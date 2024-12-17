
//Write a Java program to extract a portion of an array list.
package Practice;
import java.util.*;
public class ArrayList12 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(1);
		l1.add(3);
		l1.add(1);
		l1.add(3);
		l1.add(1);
		l1.add(3);
		System.out.println("before extract :"+l1);
		List<Integer> l2=l1.subList(1, 4);
		System.out.println("after extract : "+l2);
	}
}
