
// Write a Java program to create an array list, add some colors (strings) and print out the collection.


package Practice;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("red");
		l1.add("yellow");
		l1.add("black");
		l1.add("purple");
		System.out.println(l1);
	}
}
