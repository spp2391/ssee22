package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. guguan.txt 파일에 1~9단까지의 구구단을 출력
//		2.year.txt1900~2025년까지의 윤년 을 추력해보자
//		3.가위바위보 게임 결과를 log.txt파일에 저장
//		저장예시 : 가위vs바위 0/5,패배:1,비김:0
		Scanner sc = new Scanner(System.in);
		int count=0;
		int draw=0;
		int win=0;
		int lose=0;
		for(int i=0; i<=10;i++) {
			
			System.out.print("가위, 바위, 보중 입력하시오>>>");
			String player=sc.next();
			//0~2 사이 랜덤 숫자를 저장
			Random rd = new Random();
			int computer = (int)(Math.random()*3);
//			Random클래스 사용
//			int computer=rd.nextInt(3);
			// 가위 0 바위 1 보 2
			if(computer ==0) {
			if(player.equals("가위")) {
				System.out.println("무승부");
				draw++;
			}
			else if(player.equals("바위")) {
				System.out.println("이김");
				win++;
			}
			else if(player.equals("보")) {
				System.out.println("짐");
				lose++;
			}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          }
			
			else if(computer==1) {
					if(player.equals("가위")) {
						System.out.println("짐");
						lose++;
					}
					else if(player.equals("바위")) {
						System.out.println("무승부");
						draw++;
					}
					else if(player.equals("보")) {
						System.out.println("이김");
						win++;
					}
			}
			
			else if(computer==2) {
					
						if(player.equals("가위")) {
							System.out.println("이김");
							win++;
						}
						else if(player.equals("바위")) {
							System.out.println("짐");
							lose++;
						}
						else if(player.equals("보")) {
							System.out.println("무승부");
							draw++;
					}
				}
			System.out.println(i+"번째\n"+win+"win\n"+lose+"lose\n"+draw+"draw");
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt"))){
//				가위vs바위 0/5,패배:1,비김:0
				bw.write("이김:"+win);
				bw.write("패배:"+lose);
				bw.write("비김:"+draw);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			}
		
	}

}
