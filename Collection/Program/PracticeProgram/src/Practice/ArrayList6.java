
// Write a Java program to remove the third element from an array list.
package Practice;
import java.util.*;
public class ArrayList6 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		l1.add("dd");
		System.out.println(l1);
//		remove
		l1.remove(3);
		System.out.println("remove : "+l1);
	}
}
