package chapter21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompaator implements Comparator<String>{
	public int compare(String s1, String s2) {
//		글자 길이 기준으로 비교
		return s1.length() - s2.length();
	}
}
public class Ex10_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<String> tree = new TreeSet<>();//멀린	전우치	해리포터	홍길동
//		MyComparator 클래스를 이용하여 글자 수를 기준으로 비교
//		이미 만들어진 String 클래스의 정렬 기준을 변경 할 수있음.
//		Set<String> tree = new TreeSet<>(new MyCompaator());//멀린	홍길동	해리포터
//		Comparator.reverseOrder() 내림에 필요한 메서드가 설정되어있음
//		Set<String> tree = new TreeSet<>(Comparator.reverseOrder());
//		Set<String> tree = new TreeSet<>(new Comparator<String>() {
//		@Override
////		람다식 : 메서드를 더 쉽게 작성하는 방식
////									매개변수 ->실행할 코드
//		public int compare(String o1, String o2) {
//			return o1.length() - o2.length();
//		}});
		
//		람다식 : 메서드를 더 쉽게 작성하는 방식
//		
		Set<String> tree = new TreeSet<>((o1,o2)->o1.length()-o2.length());
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("전우치");
		tree.add("멀린");
		tree.add("해리포터");
		for(String s: tree)
			System.out.print(s.toString()+'\t');
		System.out.println();
	}

}
