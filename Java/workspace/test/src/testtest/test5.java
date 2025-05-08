package testtest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
		for(int i=1;i<=5;i++) {
			System.out.print("나라 이름, 인구 >>");
			String nara= sc.next();
			int ingu=sc.nextInt();
			nations.put(nara,ingu);
		}


		Integer miningu = Collections.min(nations.values());
		
		System.out.println("제일 인구가 적은 나라는"+miningu);
		
	}

}
//제일 인구가 적은 나라는 (Swiss, 2000)