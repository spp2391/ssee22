package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_ExceptionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		에러 : 예외가 아닌 심각한 문제, 코드로는 해결 불가능, 하드웨어나 자바의 설정문제가 있을때
//		컴파일 에러 : 컴파일 할때 일어나는 문제, 이클립스(IDE)
//		in a =40; 빨간색 줄로 알려주는 에러들
//		런타임 에러 : 실행 도중 발생하는 에러, 값을잘못설정하거나 0으로 나눈다거나하는 에러
//		런타임 에러의 종류 : 시스템에러 , 예외
//		시스템에러 : 메모리부족, 운영체제에서 에러가 발생
//		예외(EXCEPTION): 값 잘못설정하거나 0으로나눈다거나 에러
//		예외처리 : try catch문 이용하여 예외발생하더라도 프로그램꺼지지않고 진행되독록 코드를 작성
		
		Scanner sc= new Scanner(System.in);
//		catch : 예외가 발생할 가능성이 있는 코드를 작성
		try {
		int num1= sc.nextInt();
		int num2= 10/num1;// num에 0입력하면 에러
		System.out.println(num2);
		}
//		catch(예외클래스 예외의 데이터가 저장될 변수이름)
//		예외의 내요에 맞게 각각 처리할 내용을  다르게 작성할 수 있음
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력!");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음!");
		}
		catch(Exception e) {
//			예외가 발생하면 실행할 코드 작성
			System.out.println("예외 발생");
		}
		finally {
//			정상실행이던 예외 일어나던 상관없이 무조건 실행되는 코드
			System.out.println("무조건 실행되는 코드");
		}
//		예외처리시 프로그램 계속 실행
		System.out.println("프로그램 종료");
	}

}
