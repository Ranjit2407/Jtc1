class Array{
	public static void main(String arg[]){
		//Static 2d-array
		int ar1[][]={{1,2,3,4,5},{12,67,46},{56,43,78}};
		for(int i=0;i<=ar1.length-1;i++){
			for(int j=0;j<=ar1[i].length-1;j++){
				System.out.println("ar1..."+i+":"+ar1[i][j]);
			}
			System.out.println();
		}
		//Dynamic 2d-array
		int ar2[][]=new int[3][4];
		for(int i=0;i<=ar2.length-1;i++){
			for(int j=0;j<=ar2[i].length-1;j++){
				System.out.println("ar2..."+i+":"+ar2[i][j]);
			}
			System.out.println();
		}
		
		//Static 3d-array
		int ar3[][][]={{{1,4,66,54,78},{46,23,67,89},{35,85,5}},{{45,74,24,6},{4,7,9,4,7}}};
		for(int i=0;i<=ar3.length-1;i++){
			for(int j=0;j<=ar3[i].length-1;j++){
				for(int k=0;k<=ar3[i][j].length-1;k++){
					System.out.println("ar3..."+i+":"+j+":"+ar3[i][j][k]);
				}
				System.out.println();
			}
		}
		//Dynamic 3d-array
		System.out.println("******************");
		int ar4[][][]=new int[3][2][2];
		for(int i=0;i<=ar4.length-1;i++){
			for(int j=0;j<=ar4[i].length-1;j++){
				for(int k=0;k<=ar4[i][j].length-1;k++){
					System.out.println("ar4..."+i+":"+j+":"+ar4[i][j][k]);
				}
				System.out.println();
			}
		}
	}
}