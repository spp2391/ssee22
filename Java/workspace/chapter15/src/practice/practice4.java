package practice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("소문자 입력하시오.");
		char ch = sc.next().charAt(0);
		for(char i= ch; i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
