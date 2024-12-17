class hello{
	public static void main(String arg[]){
		int ar1[]={1,2,3,4,5};
		byte ar2[]={5,7,3,7,4,56,8,4};
		short ar3[]={5,7,3,7,9,0,53,57,33,4};
		hello ar4[]={new hello(),new hello(),new hello()};
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		System.out.println(".....length..........");
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		System.out.println(ar3.length);
		System.out.println(ar4.length);
		for(int i=0;i<=4;i++){
			System.out.println(ar1[i]);
		}
		
		int sum=0;
		int i=0;
		while(i<=4){
			sum=sum + ar1[i];
			i++;
		}
		System.out.println(sum);
		
		//dynamic
		String emails[]=new String[20];
		for(int k=0;k<=emails.length-1;k++){
			emails[k]="student"+k+"@gmail.com";
		}
		for(int j=0;j<=emails.length-1;j++){
			System.out.println(emails[j]);
		}
	}

}