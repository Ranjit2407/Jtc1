package workbook;
import java.util.*;
public class VectorLinkedList {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("raj");
		v.add("99");
		v.addElement("raj@gmail");
		v.addElement("raj");
		System.out.println(v);
		
		Enumeration en1=v.elements();
		System.out.println("forwrd order");
		while(en1.hasMoreElements()) {
			System.out.println(en1.nextElement());
		}
		Iterator itr1=v.iterator();
		System.out.println("forward order");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		LinkedList l1=new LinkedList(v);
		l1.addFirst("11");
		l1.addLast("22");
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
	}
}
