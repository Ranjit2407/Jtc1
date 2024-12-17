
// Write a Java program to clone an array list to another array list.
package Practice;
import java.util.*;
public class ArraList16 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println(list);
		ArrayList<String> newList=(ArrayList<String>)list.clone();
		newList.add("1");
		newList.add("2");
		System.out.println("new arraylist : "+newList);
	}
}
