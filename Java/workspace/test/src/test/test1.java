package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		for(;;) {
			int x = (int)(Math.random()*100);
			int count = 0;
			System.out.println(x);//컴퓨터가 생각하는 숫자
			System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
			System.out.println("컴퓨터가 숫자를 생각했습니다.");
			if(x%2!=0) {
				System.out.println("힌트는 홀수입니다");
			}
			else {
				System.out.println("힌트는 짝수입니다");
			}
			for(;;) {
				System.out.println("1~100 사이의 값을 입력 >>");
				int num= sc.nextInt();
				if(num>x) {
					System.out.println("더 작은 수입니다.");
					count++;
				}
				else if(num<x) {
					System.out.println("더 큰 수입니다.");
					count++;
				}
				else if(num==x) {
					System.out.println(count+"회 만에 맞췄습니다.");
					break;
				}
			}
			break;
				
		}
		
	}

}
