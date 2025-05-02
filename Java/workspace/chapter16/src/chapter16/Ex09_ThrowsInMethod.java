package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod {

	public static void myMethod1() throws Exception{
//		myMethod2에 throws 가있으면 try catch로 예외처리하거나 myMethod1에 throws를 적어야한다.
		myMethod2();
	}
//	메서드 이름 뒤에 throws작성하여 어떤예외 발생하는지 적어주는방식
	public static void myMethod2() throws ArithmeticException, InputMismatchException,Exception{
		Scanner sc= new Scanner(System.in);
//		글자 입력시 예외
		int num1 = sc.nextInt();
//		0으로나누었을때 예외
		int num2 = 10/num1;
		System.out.println(num2);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			myMethod1();
		}catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("good bye");
	}

}
