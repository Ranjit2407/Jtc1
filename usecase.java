//wap to get sum of all even number in given array.

class array{
	void use_case_1(){
		System.out.println("working on use-case-1");
		int ar1[]={14,57,98,56,13,45,67,89};
		int sum=0;
		for(int i=0;i<=ar1.length-1;i++){
			if(ar1[i]%2==0){
				sum=sum+ar1[i];
			}
		}
		System.out.println(sum);
	}
	
	//wap  to add a new element into given array at begin.
	void use_case_2(){
		System.out.println("working on use-case-2");
		int ar1[]={12,34,56,23,67};
		int a=11;
		int new_arr[]=new int[ar1.length+1];
		new_arr[0]=a;
		for(int i=1;i<=new_arr.length-1;i++){
			new_arr[i]=ar1[i-1];
		}
		for(int i=0;i<=new_arr.length-1;i++){
			System.out.println(new_arr[i]);
		}
	}
	
	//wap  to add a new element into given array at end.
	void use_case_3(){
		System.out.println("working on use-case-3");
		int ar1[]={12,34,56,76,32,7};
		int n=2;
		int new_arr[]=new int[ar1.length+1];
		new_arr[new_arr.length-1]=n;
		for(int i=0;i<=new_arr.length-2;i++){
			new_arr[i]=ar1[i];
		}
		for(int i=0;i<=new_arr.length-1;i++){
			System.out.println(new_arr[i]);
		}
	}
	//wap to remove the duplicate item in given array.
	void use_case_4(){
		System.out.println("working on use-case-4");
		int ar1[]={12,34,56,34,56,12,45,78,54};
		int new_arr[]=new int[ar1.length];
		int count=0;
		for(int i=0;i<=ar1.length-1;i++){
			int status=0;
			for(int j=0;j<=new_arr.length-1;j++){
				if(ar1[i]==new_arr[j]){
					status=1;
					break;
				}
			}
			if(status==0){
				new_arr[count]=ar1[i];
				count++;
			}
		}
		for(int i=0;i<=new_arr.length-1;i++){
			System.out.println(new_arr[i]);
		}
	}
}

class JTC{
	public static void main(String arg[]){
		array h1=new array();
		h1.use_case_1();
		h1.use_case_2();
		h1.use_case_3();
		h1.use_case_4();
	}
}