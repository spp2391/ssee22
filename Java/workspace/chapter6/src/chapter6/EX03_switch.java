package chapter6;

public class EX03_switch {

	public static void main(String[] args) {
		
//		switch(변수) {
//		case 비교값 :
//			실행할 코드;
//			
//			break;
//			
//		case 비교값 :
//			실행할 코드;
//			break;
//			
//		default :
//			실행할 코드;
//		}
		
		int n=4;
		switch(n%3) {
		case 1 :
			System.out.println("나머지가 1");
		break;
		
		case 2 :
			System.out.println("나머지가 2");
		break;
		
		default :
			System.out.println("나머지가 0");
		break;
		
		}

//		banana, apple, tomato, mango,melon, carrot
		String gwa="melon";
		switch(gwa) {
		case "banana" :
			System.out.println("과일");
			break;
			
		case "apple" :
			System.out.println("과일");
			break;
			
		case "potato" :
			System.out.println("야채");
			break;
			
		case "mango" :
			System.out.println("과일");
			break;
			
		case "melon" :
			System.out.println("과일");
			break;
			
		case "carrot" :
			System.out.println("야채");
			break;
		}
		
		
		int month= 10;
		switch(month) {
		case 1 :
			System.out.println("31일 이에요!");
			break;
		case 2 :
			System.out.println("28일 이에요!");
			break;
		case 3 :
			System.out.println("31일 이에요!");
			break;
		case 4 :
			System.out.println("30일 이에요!");
			break;
		case 5 :
			System.out.println("31일 이에요!");
			break;
		case 6 :
			System.out.println("30일 이에요!");
			break;
		case 7 :
			System.out.println("31일 이에요!");
			break;
		case 8 :
			System.out.println("31일 이에요!");
			break;
		case 9 :
			System.out.println("30일 이에요!");
			break;
		case 10 :
			System.out.println("31일 이에요!");
			break;
		case 11 :
			System.out.println("30일 이에요!");
			break;
		case 12 :
			System.out.println("31일 이에요!");
			break;
		}
		
	}

}
