package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Arrays.asList로 만든 Array lst는 변경할 수없음. 추가삭제안됨
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "전우치");
//		수정가능한 list로 변경
		list=new ArrayList<>(list);
		list.add("해리포터");
		
		for(Iterator<String>  itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next()+'\t');
		System.out.println();
		
		list=new LinkedList<>(list);
		
		for(String s : list)
			System.out.println(s+'\t');
		System.out.println();
		
	}

}
