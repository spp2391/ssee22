package chapter5;

public class Print {

	public static void main(String[] args) {
//		println : 문자열 출력 후 엔터를 쳐주는 메서드
		System.out.println("출력하고 싶은 문자열");
		System.out.println("두번째 줄 입니다!");
//		print : 문자열을 출력하고 enter치지않음.
		System.out.print("안녕하세요");
		System.out.print("오늘은 4월 10일입니다!");
		System.out.println();
		String name= "홍길동";
		int age= 20;
		double height = 175.5;
//		더하기 연산자를 이용한 변수 출력
		System.out.println(name+"의 나이는"+age+"이고, 키는"+height+"입니다.");
		
//		printf : 포멧을 이용한 변수 출력방식
		System.out.printf("%s의 나이는%d이고, 키는 %.1f입니다!",name, age,height);
//		%s : 문자열, String
//		%d : 숫자, int
//		%f : 실수
	}

}
