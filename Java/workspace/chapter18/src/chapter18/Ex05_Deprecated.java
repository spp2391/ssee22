//package chapter18;
//
//interface Unit5{
//	
////	JavaDoc 주석 : 자바 도큐먼트 주석
//	
//	/**
//	 * 언젠간 삭제될 메서드
//	 * 대신 run 메서드 사용해주세요
//	 * @param str
//	 */
//	@Deprecated
//	public void move(String str);
//	public void run(String str);
//	public void test(String str);
//	
//}
//class Human5 implements Unit5{
//	@Override
//	@SuppressWarnings("deprecation")
//	public void move(String str) {
//		System.out.println(str);
//	}
//	@Override
//	public void run(String str) {
//		System.out.println(str);
//	}
//	/**
//	 * 매개변수 str을 integer로 변환
//	 * @param str
//	 * @return str을 integer로  변환
//	 * @author 이승준
//	 */
//	public int test (String str){
//		System.out.println();
//		return Integer.parseInt(str);
//	}
//}
//
//
//public class Ex05_Deprecated {
//
//	@SuppressWarnings("deprecation")
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Unit5 unit = new Human5();
//		unit.move("dlsrksgud dbsltdl dlehdgkqslek");
//		unit.run("인간형 유닛들이 달립니다.");
//		Unit5 h5 = new Human5();
//		int num=h5.test("5");
//	}
//
//}
