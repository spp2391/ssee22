package ifpractice;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("논리 연산을 입력하시오>>>");
		boolean a = sc.nextBoolean();
		String op= sc.next();
		boolean b = sc.nextBoolean();
		
		switch(op) {
		case "AND" :
			System.out.println(a&&b==true);
		
			break;
			
		case "OR" :
			System.out.println(a||b==true);
			
			break;
			
			
		}

	}

}
