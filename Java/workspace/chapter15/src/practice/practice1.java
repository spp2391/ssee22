package practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		for(char i='a';i<='f';i++) {
			//System.out.print(i);
			for(char j='i'-1;j<'f';j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}

}
