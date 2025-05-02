package chapter21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		set으로 자료형 설정하면 Set상속받는 클래스 모두 사용가능
		Set<String> set = new HashSet<>();
//		실행결과 : orange banana apple
//		중복이 제거되고 저장된 순서가 아닌 다른 순서로 출력
//		hashCode() : 객체를 숫자로 반환하여 변환, orange를 hash코드로 변환하면 -1008851410
//		hashCode가 같으면 중복된 데이터로 취급
		set.add("orange");
		System.out.println("orange".hashCode());
		set.add("apple");
		set.add("banana");
		set.add("apple");
//		set.get(index) 사용 불가
//		Set의 경우 인덱스가 존재하지 않기때문에 
		set.remove("apple");
		
//		remove(data); : index가 없기 때문에 데이터를 기준으로 삭제
		
		System.out.println("객체 수 :"+set.size());
//		인덱스를 이용한 출력이 불가능하기 때문에 iterator나 foreach문으로 출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
				System.out.println();
				
				for(String s : set)
					System.out.print(s+'\t');
				System.out.println();
	}

}
