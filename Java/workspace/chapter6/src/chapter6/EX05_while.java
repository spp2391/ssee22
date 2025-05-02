package chapter6;

import java.util.Scanner;

public class EX05_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while : 반복횟수가 정해져 있지 않을 경우 사용하는 반복문
//		초기값;
//		while(조건식) {
//			증감식;
//			실행할 코드;
//		}
		int start=0;
		int start2=0;
		while(start<10) {
			start= start+1;//or start++;
			
			System.out.println(start+"번 실행 했습니다.");
//			dowhile : 실행문을 위에 조건식 아래에
//			조건식이 flse더라도 반드시1번은실행
			
			do {
				System.out.println("피곤쓰");
			}while(start2<-1); 
//			사용자입력 받아야하는경우 
//			1.로그인 : 아이디와 비번입력받아 맞으면 반복끝나고 틀리면 계속반복
//			2.가위바위보에서 이길때 까지 해야할 경우
//			무한반복 while 
			Scanner sc= new Scanner(System.in);
			while(true){
				System.out.println("가위바위보중입력");
				System.out.println("종ㅇ료하려면 종료 혹은 q입력");
				String inputStr=sc.next();
				if(inputStr.equals("종료")||inputStr.equals("q")) {
					System.out.println("겜종료");
					break;
				}
				System.out.println("아직 가위바위보로직작성중");
			}
		}
	}

}
