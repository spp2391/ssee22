package chapter22;

interface Unit7{
	void move(String s);
//	void move2(String s);
}
public class Ex07_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		람다식을 이용하면 여러가지 메서드 작성 문법을 생략가능
//		람다식의 경우 인터페이스에 있는 하나의 메서드를 구현할 수있음.
//		인터페이스 안에 미구현 메서드가 2개이상 있는 경우 람다식을 사용할수없음.
//		               매개변수  람다식표시        실행할 코드
		Unit7 unit = (s) ->{
			System.out.println(s);
		};
		unit.move("람다식으로 실행");
		Unit7 unit2 = new Unit7() {
			@Override
			public void move(String s) {
				System.out.println(s);
			}
		};
		unit2.move("익명 내부 클래스로 실행");
	}

}
