package chapter17;

class Book2{
//	Primary Key : 주민등록 번호, 학번, 군번
	Long id;
	String name;
	String author;
	Book2(String name, String author){
		this.name=name;
		this.author= author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+","+author;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		String 타입인 name의 equals를 사용하여 obj의 이름을 비교하고있음.
//		name.equals : String 클래스의 equals, 문자열만 비교
//		obj.toString() : Book2의 toString이 실행되어 name 반환
		String str = this.toString();
		return name.equals(obj.toString());
	}
}

public class Ex05_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		equals : Object클래스에 있는 메서드로 인스턴싂리 비교할 때 사용
//		equals는 오버라이드 하지않으면 메모리주소끼리의 비교, ==으로 비교하는 것과 같음.
		Book2 book1= new Book2("자바 프로그래밍", "이재환");
		Book2 book2= new Book2("HTML", "이승준");
		Book2 book3= new Book2("자바 프로그래밍", "이재환");
//		false 가 나오는 이유 : 두개의 인스턴스 모두 new를 이용하여 작성하기 때문에 다른 객체
		System.out.println(book1 == book3);
//		equals를 오버라이딩 하여 제목과 저자가 같으면 같은 책으로 출력
		System.out.println(book1.equals(book3));
		
	}

}
