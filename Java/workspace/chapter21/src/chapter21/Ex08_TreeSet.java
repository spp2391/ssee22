package chapter21;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex08_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정렬 순서/ 문자 : ㄱ~ㅎ
//		숫자 : 0~9999
		TreeSet<String> tree = new TreeSet<>();
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("손오공");
		tree.add("멀린");
		tree.add("손오공");
		tree.add("가");
		tree.add("1");
		tree.add("apple");
		
		System.out.println("객체 수 : "+tree.size());
		
		Set<Integer> tree2 = new TreeSet<>();
		tree2.add(6);
		tree2.add(2);
		tree2.add(7);
		tree2.add(4);
		tree2.add(8);
		
		for(int t : tree2) {
			System.out.print(t+"\t");
		}
		
		
		for(Iterator<String> itr= tree.iterator();itr.hasNext();)
			System.out.println(itr.next().toString()+'\t');
				System.out.println();
	}

}
