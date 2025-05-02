package chapter18;

public class Ex03_varargs {
//	string 가변 인수 설정
	public static void helloEveryBody(String...vargs) {
		for(String s : vargs) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		helloEveryBody("홍길동");
		helloEveryBody("홍길동","전우치");
		helloEveryBody("홍길동","전우치","손오공");
		
		String [] strArr= {"홍길동","전우치","손오공","홍길동","전우치","손오공"};
		helloEveryBody(strArr);
	}

}
