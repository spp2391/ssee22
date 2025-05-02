package chapter6;

public class StringSwitchAndif {

	public static void main(String[] args) {
		String name="홍길동";
//		switch는 문자열 == 비교가능
		switch(name) {
		case "홍길동" :
			System.out.println("제 이름은 홍길동 입니다!");
			break;
			
		case "전우치" :
			System.out.println("제 이름은 전우치 입니다!");
			break;
			
		
		case "베지터" :
			System.out.println("제 이름은 베지터 입니다!");
			break;
			
		default :
			System.out.println("같은 이름이 없네요..");
		
		}
//		if문의 경우 문자열 비교시 == 사용하여 비교 x
		
		String name2= "베지터";
		String name3=new String("홍길동");//클래스 선언문으로 새롭게 변수생성
		if(name2 == "홍길동") {
			System.out.println("제 이름은 홍길동이에요!");
		}
		
		else if(name2 == "전우치") {
			System.out.println("제 이름은 홍길동이에요!");
		}
		
		else if(name2 == "베지터") {
			System.out.println("제 이름은 홍길동이에요!");
		}
		
		System.out.println(name == name2);
		System.out.println(name==name3);//메모리 주소가 다르기때문에 false출력
		
//		== : 메모리 비교 , equelse() : 안의 데이터 비교
//		equals : String 경우 클래스 자료형이기 때문에 equals로 비교해야 결과가 정상적으로 출력됨.
		System.out.println(name2.equals(name3));
		
//		기초자료형 byte, short, int, long, float, double, boolean, char 는 == 으로 비교
//		클래스자료형 : Byte, Short, Integer, Long, Float, Double, Character 는 equals로비교
		
		if(name2.equals(name3)) {
			System.out.println("같네!");
		}
		else {System.out.println("달라");
	}

}
}
