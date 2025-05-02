package practice;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		for(int i=1900;i<=2025;i++) {
			if((i%4==0)||!(i%100==0)&&(i%400==0)) {
				list.add(i);
			}
		}
		for(Integer a : list) {
//			get 사용하지않고도 데이터 출력가능
			System.out.println("윤년은"+a+"\t");
		}
	}

}
