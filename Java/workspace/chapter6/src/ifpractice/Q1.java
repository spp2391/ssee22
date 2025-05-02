package ifpractice;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int result = a+b;
		System.out.println(a+"+"+b+"은"+ result);
	}

}
//두정수 입력받아 합구하기
// 키보드 입력은 스캐너 클래스 사용
//두정수를 입력하세요 >>10 20
//10+20은 30