
//Write a Java program to append the specified element to the end of a linked list.
package Practice;
import java.util.*;
public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		l1.addLast(5);
		System.out.println(l1);
	}
}
