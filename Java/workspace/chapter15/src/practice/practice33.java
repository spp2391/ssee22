package practice;

public class practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	

		System.out.println("   | 1  2  3  4  5  6  7  8  9");
		System.out.println("---+--------------------------");
		int x[]= {1,2,3,4,5,6,7,8,9};
		int y[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<y.length;i++) {
			System.out.print(" "+(i+1)+" | ");
			for(int j=0;j<x.length;j++) {
				System.out.print(x[j]*y[i]+" ");
			}
			System.out.println(" ");
		}
	}

}
