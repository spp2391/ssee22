package chapter21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List는 인터페이스 이기 때문에 List 상속받는 자료구조 모두 사용가능
		List<String> list = new LinkedList<>();
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
				System.out.print(str+"\t");
			}
			
//			Iterator : 반복자
//			반복자 선언시 제네릭으로 리스트의 제네릭을 설정
			Iterator<String> itr = list.iterator();
//			hasNext() : 다음 데이터가 있으면 true 없으면 false를 반환하는 메서드
			while(itr.hasNext()) {
//				next() : 다음 데이터를 반환하는 메서드
//				다음데이터가 없는 경우 에러 발생 후 프로그램 강제종료
//				next 는 반드시 hasNext와 세트로 사용
				String str = itr.next();
				System.out.print(str + "\t");
				if(str.equals("apple")) {
					itr.remove();//데이터가 apple이라면 삭제
//					iterator 에서 remove 이용하여 list의 내용 삭제
					
				}
			}
			System.out.println();
			itr= list.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+"\t");
			}
			System.out.println();
	}

}
