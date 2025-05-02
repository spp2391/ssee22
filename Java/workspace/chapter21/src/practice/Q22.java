package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> nations = new HashMap<String, String>(); 
//		Set<String> ks = nations.keySet();
		Scanner sc = new Scanner(System.in);
//		System.out.println("나라이름과 수도를 입력하세요. (예 : Korea 서울) ");
//		System.out.print("나라 이름, 수도>>");
//		
//		String s = sc.next();
		
		for(;;) {
			System.out.println("나라이름과 수도를 입력하세요. (예 : Korea 서울) ");
			System.out.print("나라 이름, 수도>>");
			String s = sc.next();
			if(s.equals("그만")) {
				break;
			}
			String s2= sc.next();
			nations.put(s,s2);
			System.out.println(nations);
			
		}
		
		for(;;) {
			System.out.print("수도검색");
			String p = sc.next();
			System.out.print(p+"의 수도는"+nations.get(p));
			if(p.equals("그만")) {
				System.out.println("END");
				break;
			}
			if(nations.get(p)== null)
				System.out.print(p+"란 나라는 없습니다.");
			continue;
		}
		

		
	}

}
