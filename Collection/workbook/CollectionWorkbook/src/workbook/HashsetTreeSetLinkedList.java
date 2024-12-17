package workbook;
import java.time.format.TextStyle;
import java.util.*;
public class HashsetTreeSetLinkedList {
		public static void main(String[] args) {
			HashSet has1=new HashSet();
			has1.add(new Integer(99));
			System.out.println(has1.add("som"));
			System.out.println(has1);
			
			TreeSet t1=new TreeSet();
			System.out.println(t1.add("raj"));
			t1.add("raj@gmail");
			t1.add("aa");
			t1.add("bb");
			t1.add("cc");
			t1.add("dd");
			System.out.println(t1);
			
			LinkedHashSet l1=new LinkedHashSet();
			l1.add(new Integer(99));
			System.out.println(l1.add("raj"));
			System.out.println(l1);
			
		}
}
