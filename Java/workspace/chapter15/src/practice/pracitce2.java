package practice;

import java.util.Scanner;

public class pracitce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int[] x = new int[100];	
//		for(int i=1;i<x.length;i++) {
//			x[i]=i;
//			System.out.println(x[i]);
//		}
	System.out.println("숫자입력");
	String z= sc.next();
	System.out.print("박수 ");
		for(int i=0;i<z.length();i++) {
			char c=z.charAt(i);
			int num=c-'0';
			if(num%3==0) {
				System.out.print("짝");
			}
		}
	}

}
