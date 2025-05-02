package chapter24;

import java.io.File;
import java.util.Scanner;
//class Student{
//	public void Student(String s,int )
//	}

public class Ex14_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner 장점
//		text데이터를 읽을 때 여러가지 기능사용가능
//		공백,줄단위,숫자,단어단위로 읽고 싶을 때
//		파싱기능이 뛰어나다
		try(Scanner sc = new Scanner(new File("ss.txt"))) {
			while(sc.hasNext()) {
//				파일의 내용을 한줄씩 읽을때
				System.out.println(sc.nextLine());
				String name = sc.next();
				int age = sc.nextInt();
				int tall = sc.nextInt();
				int weight = sc.nextInt();
				String location=sc.next();
			
//			System.out.println(sc.next());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}