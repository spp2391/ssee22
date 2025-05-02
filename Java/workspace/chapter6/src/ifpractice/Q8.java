package ifpractice;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("뭐 시킬래?");
		
		String name=  sc.next();
		int num =sc.nextInt();
		
		if(name.equals("에스프레소")) {
			System.out.println(2000*num);
		}
		
		else if(name.equals("아메리카노")) {
			System.out.println(2500*num);
		}
		
		else if(name.equals("카푸치노")) {
			System.out.println(3000*num);
		}
		
		else if(name.equals("카페라떼")) {
			System.out.println(3500*num);
		}
		
		System.out.print("또 뭐?");
		
		String name2=  sc.next();
		int num2 =sc.nextInt();
		
		switch(name2) {
		case "에스프레소" :
			System.out.println(2000*num2);
			break;
		case "아메리카노" :
			System.out.println(2500*num2);
			break;
		case "카푸치노" :
			System.out.println(3000*num2);
			break;
		case "카페라떼" :
			System.out.println(3500*num2);
			break;
		}
	}

}
