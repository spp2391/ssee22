package chapter15;

import java.util.Arrays;
import java.util.Collections;

public class Ex14_AraaySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1= {1,3,2,4};
		Double[] arr2 = {4.4, 3.3, 2.2, 1.1};
		String[] arr3= {"홍길동","전우치","손오공","멀린"};
//		int 배열의 경우 오름차순밖에 실행할 수 없음.
//		Integer배열의 경우 내림차순,오름차순 둘다 가능
//		Integer배열은 Collections.reverseOrder()를 사용하여 내림차순
		Arrays.sort(arr1,Collections.reverseOrder());
		
		Arrays.sort(arr2,Collections.reverseOrder());
//		doble은 내림차순 불가, Double은 내림차순 가능
		Arrays.sort(arr3,Collections.reverseOrder());
		for(int n:arr1) {
			System.out.print(n+"\t");
		}
		System.out.println();
		for(String s:arr3) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(double d:arr2) {
			System.out.print(d+"\t");
		}
	}

}
