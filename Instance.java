class student{
	int sid;
	String sname;
	String scity;
	int spincode;
	String sphone;
	String semail;
	String scategory;
	String sgender;
	String smaritalstatus;
	String DOB;
	static String snationallity;
	static String sinstitutename;
	static String sbatchnumber;
	static String gstnumber;
	static String companyname;
	
}
class instance_variable{
	public static void main(String arg[]){
		student h1=new student();
		h1.sid=10;
		h1.sname="Rajnish";
		h1.scity="Sasaram";
		h1.spincode=802213;
		h1.sphone="7481938515";
		h1.semail="rajnishk748183@gmail.com";
		h1.scategory="Hindu";
		h1.sgender="Male";
		h1.smaritalstatus="Single";
		h1.DOB="05-09-2006";
		h1.snationallity="Indian";
		h1.sinstitutename="JTC INDIA";
		h1.sbatchnumber="B67";
		h1.gstnumber="PKHG675634567";
		h1.companyname="JTC INDIA";
		
		System.out.println("h1 object");
		System.out.println("sid :"+h1.sid);
		System.out.println("sname :"+h1.sname);
		System.out.println("scity :"+h1.scity);
		System.out.println("spincode :"+h1.spincode);
		System.out.println("sphone :"+h1.sphone);
		System.out.println("semail :"+h1.semail);
		System.out.println("scategory :"+h1.scategory);
		System.out.println("sgender :"+h1.sgender);
		System.out.println("smaritalstatus :"+h1.smaritalstatus);
		System.out.println("DOB :"+h1.DOB);
		System.out.println("snationallity :"+h1.snationallity);
		System.out.println("sbatchnumber :"+h1.sbatchnumber);
		System.out.println("gstnumber :"+h1.gstnumber);
		System.out.println("companyname :"+h1.companyname);
		
		student h2=new student();
		h2.sid=11;
		h2.sname="Nivesh";
		h2.scity="ABP";
		h2.spincode=224122;
		h2.sphone="8877234256";
		h2.semail="nivesh@gmail.com";
		h2.scategory="Hindu";
		h2.sgender="Male";
		h2.smaritalstatus="Single";
		h2.DOB="05-09-2004";
		h2.snationallity="Indian";
		h2.sinstitutename="JTC INDIA";
		h2.sbatchnumber="B67";
		h2.gstnumber="PKHG675634567";
		h2.companyname="JTC INDIA";
		
		System.out.println(".........h2 object...............");
		System.out.println("sid :"+h2.sid);
		System.out.println("sname :"+h2.sname);
		System.out.println("scity :"+h2.scity);
		System.out.println("spincode :"+h2.spincode);
		System.out.println("sphone :"+h2.sphone);
		System.out.println("semail :"+h2.semail);
		System.out.println("scategory :"+h2.scategory);
		System.out.println("sgender :"+h2.sgender);
		System.out.println("smaritalstatus :"+h2.smaritalstatus);
		System.out.println("DOB :"+h2.DOB);
		System.out.println("snationallity :"+h2.snationallity);
		System.out.println("sbatchnumber :"+h2.sbatchnumber);
		System.out.println("gstnumber :"+h2.gstnumber);
		System.out.println("companyname :"+h2.companyname);
	}
}