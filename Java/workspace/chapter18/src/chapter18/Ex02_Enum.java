package chapter18;
enum Human2{MAN,WOMAN}

enum Machine2{TANK,AIRPLANE}

//interface MACHINE1{
//	i
//}
public class Ex02_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUnit(Machine2.TANK);
		createUnit(Machine2.AIRPLANE);
//		createUnit(Human2.MAN);매개변수 타입이 Machine2 이기때문에 에러발생
		System.out.println(Machine2.TANK);
		System.out.println(Machine2.TANK.name());//이름
		System.out.println(Machine2.TANK.toString());//이름
		System.out.println(Machine2.TANK.ordinal());//enum에 저장한 순서 
		System.out.println(Machine2.TANK.values());//메모리 주소
	}
	public static void createUnit(Machine2 kind) {
		switch(kind) {
//		상수 사용시 TANK의 값이 1이 설정되고 int자료형 1이면 모두 실행
		case TANK:
			System.out.println("탱크를 만듭니다.");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
	}

}
