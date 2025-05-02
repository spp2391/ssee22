package chapter21;

import java.util.HashMap;

class Student9{
int	stdno;
String	name;
String	id;
int	grade;
}
public class Ex14_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		map은 키와 value갑을 가진 자료구조
//		key: value를 꺼내기위해 설정하는 id, Priamry Key의 데이터를 설정하는 경우가 많음 
//		value : 데이터, 테이블에 들어있는 데이터를 객체로 만들어 저장 
		HashMap<String, String> map = new HashMap<>();
//		put(key, value) : 데이터 추가메서드
		
		map.put("홍길동", "010-123-1443");
		map.put("전우치", "010-4321-1466");
		map.put("손오공", "010-9876-1443");
		
//		get(key) : value를 출력하는 메서드
		System.out.println("홍길동 :"+map.get("홍길동"));
		System.out.println("전우치 :"+map.get("전우치"));
		System.out.println("손오공 :"+map.get("손오공"));
		System.out.println();
//		remove(key) : 해당하는 key찾아 데이터삭제
		map.remove("손오공");
//		get실행 시 삭제된 데이터는 null 반환
		System.out.println("손오공:"+map.get("손오공"));
		
//		PK를 검색해서 데이터를 출력하는 경우가 가장 많기 때문에
//		거머색속도가 빠름 map쓰면 , 데이터 추가삭제빠르다
//		PK:studno
		HashMap<Integer,Student9> stuMap = new HashMap<>();
		
	}

}
