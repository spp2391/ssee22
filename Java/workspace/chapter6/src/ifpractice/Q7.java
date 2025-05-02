package ifpractice;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("학점 입력 하세요>>>");
		String hak=sc.next();
		
		switch(hak){
		case "A" : case "B" :
			System.out.println("Excellent");
			break;
			
		case "C" : case "D" :
			System.out.println("Good");
			break;
			
		default:
			System.out.println("BYE");
			break;
		}
	}

}
