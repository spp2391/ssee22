package ifpractice;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int win=0;
int lose=0;
int draw=0;
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<=100;i++) {
			
		System.out.print("가위, 바위, 보중 입력하시오>>>");
		String player=sc.next();
		//0~2 사이 랜덤 숫자를 저장
		int computer = (int)(Math.random()*3);
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
		}
	}
}
