package testtest;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Scanner;


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		HashMap<String  , Integer> map = new HashMap<>();
		System.out.println("<< 통장 관리 프로그램입니다. >>");
		while(true) {
		
		System.out.println("이름과 금액 입력>>");	
		String name= sc.next();
		if(name.equals("exit")) {
			System.out.println("종료");
			break;
			
		}
		
		int money=sc.nextInt();
		map.put(name,money);
		
		for(String key : map.keySet()) {
			System.out.print("("+key+">"+map.get(key)+")");
			
		}
		System.out.println("");
	}
	}
}
//(홍길동>45000원)