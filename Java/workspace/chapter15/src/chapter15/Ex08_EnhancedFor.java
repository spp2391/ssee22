package chapter15;

public class Ex08_EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5};
//		for(배열의 자료형 변수이름 : 배열){
				for(int e : arr) {
					System.out.print(e+" ");
				}
				System.out.println();
				int sum=0;
				for(int e : arr) {
					sum=sum+e;
				}
				
				String[] strArr = {"a","b","c"};
				for(String arr2  : strArr) {
					System.out.print(arr2+ " ");
				}
		}
	

}
