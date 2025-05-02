package chapter21;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List는 인터페이스 이기 때문에 List 상속받는 자료구조 모두 사용가능
		List<String> list = new ArrayList<>();
//		add(저장할 데이터) :리스트에 데이터 저장하는 메서드
//		size():리스트에 저장되있는 데이터 개수반환
//		length : 배열에 설정된 길이반환, 저장된 데이터와 관련 x
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
//		get(inedex) : list데이터를 반환 하는 메서드
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();
//		remove(index) : 인덱스번재의 데이터를 삭제
		list.remove(0);
		
//		for(int i=0;i<list.size();i++) 
//			System.out.print(list.get(i)+'\t');
//			System.out.println();
		
			for(String str : list) {
//				get 사용하지않고도 데이터 출력가능
				System.out.println(str+"\t");
			}
			

	}

}
