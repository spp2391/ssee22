package practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력하시오");
//		숫자인지 확인할 수 있도록 문자열로 입력받기
		String a= sc.next();
//		문자열의 개수만큼 반복문 실행
		for(int i=0; i<a.length();i++) {
//		charAt()을 이용하여 한 글자씩 char에 저장
			char c=a.charAt(i);
//		글자가 숫자인지 문자인지 확인하는 if문	
			if(c<'0'||c>'9') {
				System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
				return;
			}
		}
//		모든 문자가 숫자라면 int로 변경 
		int num= Integer.parseInt(a);
//		짝수인지 홀수인지 확인하는 if문
		if(num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
