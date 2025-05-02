package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StringLength implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
public class Ex17_CollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("홍길동","전우치","손오공","멀린");
		list = new ArrayList<>(list);
		
		System.out.println(list);
//		리스트 정렬
//		sort(리스트변수) : 오름차순정렬, 클래스에 Compareable을 상속받아야사용가능.
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());//내림차순
		System.out.println(list);
		
//		sort(리스트 변수 , 직접만든 클래스 : 정렬방식 직접 설정
		Collections.sort(list, new StringLength());//내림차순
		System.out.println(list);
		
	}

}
