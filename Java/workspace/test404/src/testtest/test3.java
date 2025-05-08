package testtest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
	
		while(true) {
			String s = sc.nextLine();
			if(s.equals("그만")) {
				System.out.println("그만합니다...");
				break;
			}
				StringTokenizer st = new StringTokenizer(s,", ");
				System.out.println("어절 개수는 " + st.countTokens());
			
		}
		
	}

}
