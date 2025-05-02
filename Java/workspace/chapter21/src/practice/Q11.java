package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Double> map = new HashMap<>();
		map.put("A",4.0);
		map.put("B",3.0);
		map.put("C",2.0);
		map.put("D",1.0);
		map.put("F", 0.0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학점");
		String hak = sc.next();
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
//		switch(hak) {
//		case "A" :
//			
//			System.out.println(map.get("A"));
//			break;
//			
//case "B" :
//			
//			System.out.println(map.get("B"));
//			break;
//case "C" :
//	
//	System.out.println(map.get("C"));
//	break;
//case "D" :
//	
//	System.out.println(map.get("D"));
//	break;
//case "F" :
//	
//	System.out.println(map.get("F"));
//	break;
//		}
		
		
	}

}
