package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		
		System.out.print("정수 10개 입력하세요");
		for(int i=0;i<x.length;i++) {
			x[i]= sc.nextInt();
			System.out.print(x[i]+" ");
		}
//		메서드를 이용하여 정렬
		Arrays.sort(x);
//	for(int i=0; i<x.length;i++) {
//		for(int j=0;j<x.length;j++) {
//			if(x[j]>x[j+1]) {
//				int num= x[j];
//				x[j]=x[j+1];
//				x[j+1]=x[j];
//			}
//		}
//	}
		
		
	}

}
