package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. guguan.txt 파일에 1~9단까지의 구구단을 출력
//		2.year.txt1900~2025년까지의 윤년 을 추력해보자
//		3.가위바위보 게임 결과를 log.txt파일에 저장
//		저장예시 : 가위vs바위 0/5,패배:1,비김:0
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("year.txt"))){
			for(int i=1900;i<=2025;i++) {
				if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				 bw.write(i+"\n");
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
