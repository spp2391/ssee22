package testtest;

import java.util.HashMap;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		HashMap<String  , Integer> map = new HashMap<>();
		map.put("밀키스", 700);
		map.put("코카콜라",800);
		map.put("펩시",1000);
		map.put("칠성사이다", 1200);
		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
		while(true) {
			System.out.println("선택 >>");
				String can=sc.next();
				if(can.equals("밀키스")) {
					System.out.println("밀키스의 가격은"+map.get("밀키스")+"원 입니다.");
				}
				else if(can.equals("코카콜라")) {
					System.out.println("코카콜라의 가격은"+map.get("코카콜라")+"원 입니다.");
				}
				else if(can.equals("펩시")) {
					System.out.println("펩시의 가격은"+map.get("펩시")+"원 입니다.");
				}
				else if(can.equals("그만")) {
					System.out.println("종료");
					break;
				}
		}
	}

}
