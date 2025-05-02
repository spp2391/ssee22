package practice;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~100까지 숫자중 3배수 리스트에저장
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<101; i++) {
			
			if(i%3==0) {
				list.add(i);
			}
			
		}
			for(Integer t : list) {
//				get 사용하지않고도 데이터 출력가능
				System.out.println(t+"\t");
			}
		}
	}


