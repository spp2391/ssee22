package chapter17;

class Book{
	String name;
	String author;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+","+this.author;
	}
	
}
public class Ex02_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자바의 기본 클래스
//		java.lang : 기본 클래스들이 들어있는 패키지명
//		object : 최상위 클래스로 기본 메서드를 제공
//		
		Ex02_toString ex02 = new Ex02_toString();
//		인스턴스 ex02를 print, println에서 실행하면 자동으로 toString 실행
		System.out.println(ex02.toString());
//		Object는 모든 클래스가 상속받으며 직접만든 클래스의 경우 보이지않지만 컴파일 시 상속을 추가해줌
//		Object에 있는 모든 메서드는 어떤 클래스던 사용 가능
		System.out.println(ex02);
		Object obj = new Object();
		
		
		
		String name = "홍길동";
//		toString 메서드를 오버라이딩하여 내용 변경하지않으면 아래 내용 출력
//		패키지명.클래스명@16진수 메모리주소
//		String 클래스 경우 toString을 문자열을 출력하도록 오버라이딩한 상태
		System.out.println(name);
		System.out.println(name.toString());
		Book book1= new Book();
		book1.name = "자바 프로그래밍";
		book1.author= "이재환";
		System.out.println(book1.toString());
		System.out.println(book1);
	}

}
