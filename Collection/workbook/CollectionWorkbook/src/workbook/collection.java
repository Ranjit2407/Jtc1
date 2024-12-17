package workbook;
import java.util.*;
public class collection {
	public static void main(String[] args) {
		ArrayList aList=new ArrayList();
		System.out.println(aList);
		System.out.println(aList.size());
		System.out.println(aList.isEmpty());
		
		aList.add(new Integer(99));
		aList.add("raj");
		aList.add(new Long(11111));
		System.out.println(aList);
		System.out.println(aList.isEmpty());
		Object[] obj=aList.toArray();
		System.out.println(obj.length);
		for(int i=1;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("checking and casting");
		for(int i=0;i<obj.length;i++) {
			Object o=obj[i];
			if(o instanceof String) {
				String str=(String)o;
				System.out.println(str);
			}
			else if (o instanceof Integer) {
				Integer in=(Integer)o;
				System.out.println(in);
			}else if (o instanceof Double) {
				Double double1=(Double)o;
				System.out.println(double1);
			}
		}
		Iterator itr=aList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(aList.contains("raj"));
		System.out.println(aList.contains("jtv"));
		System.out.println(aList);
		aList.add("123");
		System.out.println(aList);
		aList.remove("123");
		
		ArrayList aList1=new ArrayList();
		aList1.add("aa");
		aList1.add("bb");
		aList1.add("cc");
		aList1.add("dd");
		System.out.println(aList1);
		System.out.println(aList1.size());
		aList.addAll(aList1);
		System.out.println(aList);
		System.out.println(aList.containsAll(aList1));
		aList.retainAll(aList1);
		System.out.println(aList);
		aList.clear();
		System.out.println(aList);
	}
	
	
}