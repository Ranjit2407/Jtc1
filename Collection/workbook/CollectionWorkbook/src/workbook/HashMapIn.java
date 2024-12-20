package workbook;
import java.util.*;
public class HashMapIn {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		h1.put("sid", new Integer(99));
		h1.put("sname", "raj");
		h1.put("email", "abc");
		System.out.println(h1);
		System.out.println(h1.containsKey("sid"));
		System.out.println(h1.containsKey("sid1"));
		System.out.println(h1.containsValue("raj"));
		System.out.println(h1.containsValue("raj1"));
		System.out.println(h1.get("sname"));
		System.out.println(h1);
		h1.put("sname1", "kumar");
		h1.put(null, "kumar");
		h1.put(new Double(999.99), null);
		System.out.println(h1);
		
		Collection col1=h1.values();
		System.out.println(col1);
		System.out.println("using keyset");
		Set s1=h1.keySet();
		System.out.println(s1);
		Iterator it1=s1.iterator();
		while(it1.hasNext()) {
			Object o1=it1.next();
			String key="";
			if(o1!=null) {
				key=o1.toString();
			}else {
				key=null;
			}
			Object o2=h1.get(key);
			String val="";
			if(o2!=null) {
				val=o2.toString();
			}
			else {
				val=null;
			}
			System.out.println(key+"....."+val);
		}
		System.out.println("using entryset()\n\n");
		Set s2=h1.entrySet();
		Iterator i2=s2.iterator();
		while(i2.hasNext()) {
			Object o=i2.next();
			Map.Entry m1=(Map.Entry)o;
			Object o1=m1.getKey();
			String key="";
			if(o1!=null) {
				key=o1.toString();
			}else {
				key=null;
			}
			Object o2=m1.getKey();
			String val="";
			if(o2!=null) {
				val=o2.toString();
			}else {
				val=null;
			}
			System.out.println(key+"......"+val);
		}
		
	}
}
