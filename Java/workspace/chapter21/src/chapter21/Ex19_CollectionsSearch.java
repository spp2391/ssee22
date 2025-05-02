package chapter21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StringDesc implements Comparator<String>{
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);	
	}
}
public class Ex19_CollectionsSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		list.remove(0);
		
		Collections.sort(list);
		System.out.println(list);
		
		StringDesc cmp = new StringDesc();
		
		Collections.sort(list, cmp);
		System.out.println(list);
		
		Map<String,Integer> map = new HashMap<>();
		map.put("홍길동",1);
		map.put("전우치",1);
		map.put("홍길동",1);
		map.put("손오공",1);
		
		System.out.println(map);
		
	}

}
