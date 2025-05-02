package chapter2;

public class EX01_variableType {

	public static void main(String[] args) {
//		자바스크립트의 경우 모든 변수앞에 let사용
//		자바의 경우 변수선언 시 자료형에 맞춰 다 다른 자료형 타입을 사용해야함.
//		정수숫자자료형
//		byte : -128 ~ +127
//		short : -32,768 ~ +32,767 
//		int : -2,147,483,648 ~ +2,147,483,647
//		long : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
		byte b = 127;
		short s = 32764;
		int i = 1455456564;
		long l = 14444444844464554L;// long자료형의 경우 뒤에 L을 붙여야 에러가 발생하지 않음.
//		byte, short 거의 쓰지 않음, 기본은 int로 사용 21억보다 큰 값은 저장하는 경우 long사용
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
//		문자자료형
//		char : 한 글자만 저장할 수있는 자료형, 작은 따옴표로 감싸서 사용
		char c = 'A';
		c= 6644;//아스키 코드, 유니코드로 저장 가능
		System.out.println(c);
//		String: 여러 글자를 저장할 수있는 자료형
//		첫글자가 대문자인 이유 : 위에 사용한 소문자 자료형들은 기본자료형 
//		첫글자가 대문자인 경우 클래스 자료형이라고 한다.
		String str ="안녕해요";
//		클래스 자료형인 경우 .을 이용하여 여러가지 기능 사용 가능
		System.out.println(str);
		System.out.println(str.length()); //글자 수 출력
//		클래스 자료형의 경우 기본 자료형에 해당하는 클래스자료형이 모두 있음
		Byte by = 'a';
		Short sh = 2;
		Integer in =21;// int만 클래스 자료형의 이름이 다르다
		Long lo = 98L;
		Float f1 =3.14F;
		Double dou =3.14;
		
//		실수 자료형 : 소수점 저장하는 자료형
		float f= 3.14F;// 소수점 아래 7자리까지
		double d = 3.14;// 소수점아래 15자리
		
//		컴퓨터는 소수점 계산이 정확하지 않음.
		double num1=1.0000001;
		System.out.println(num1);
		
		double num2=2.0000001;
		System.out.println(num2);
		
		double result=num1+num2;
		System.out.println(result);
		
		
	}

}
