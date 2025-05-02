package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_CatchConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		try {
			int num1= sc.nextInt();
			int num2 =10/num1;
			System.out.println(num2);
//			or을 사용하여 여러가지 예외를 동시에 처리가능
		}catch(ArithmeticException | InputMismatchException e) {
//			e 변수의내용 : 어떤예외가 발생되었는지의 정보
			System.out.println("예외 발생");
//			예외이름메시지,어디서발생했는지 
			
			e.printStackTrace();
//			예외발생시 메시지만 반환
			System.out.println(e.getMessage());
//			Exception e : 모든 예외를 의미
		}catch(Exception e) {
			System.out.println("위에서 작성하지 않은 모든 예외를 처리");
		}
	System.out.println("good bye");
	}

}
