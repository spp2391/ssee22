package ifpractice;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	연도가 400나누어 나머지가 0이면 윤년
//		연도가 100으로 나누어 나머지가 0이면 윤년이아니다
//		연도가4로 나누어 나머지가 0이면 윤년
//		그외는ㄴ 모두 윤년이아님.
//		
//		if문 switch문
		
		Scanner sc= new Scanner(System.in);
		System.out.println("년도를 입력하시오");
		int year=sc.nextInt();
		int y400 = year%400>0 ? 0 :1;
		int y100 = year%100>0 ? 0 : 1;
		int y4=year%4>0 ? 0 :1 ;
//		switch 문 실행
		String result = ""+400+y100+y4;
		switch(result) {
		case "100" : case "110" : case "111" : case "001" : case "101" : 
			System.out.println(year+"년은 윤년");
		break;
		
		case "010" : case "011" : case "000" :
			System.out.println(year+"윤년이 아닙니다.");
			break;
		}
		
		// if 문 실행
		if(year%400 == 0  
		||(year%4==0 && year%100!=0)) {
			System.out.println("윤년 이에요");
		}
		
		else {
			System.out.println("윤년이 아닙니다.");
		}
		
		
	}

}
