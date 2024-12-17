package workbook;
import java.util.*;
public class ListInterface {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(new Integer(99));
		al1.add("raj");
		al1.add("123");
		System.out.println(al1);
		al1.add(0, "aaaa");
		al1.add(2,"bbbbb");
		System.out.println(al1);
		al1.remove(4);
		System.out.println(al1);
		System.out.println(al1.get(2));
		System.out.println(al1.indexOf("som"));
		System.out.println(al1.lastIndexOf("som"));
		al1.set(0, "jtc");
		System.out.println(al1);
		List list=al1.subList(1, 4);
		System.out.println(list);
		System.out.println("forward order");
		ListIterator li=al1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("reverse order");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
