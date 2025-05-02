package practice;

import java.util.Scanner;

public class practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[10];
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=sc.nextInt();
		}
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+" ");
		}
	}

}
