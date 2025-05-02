package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_FileWrite3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try-with-resource : try(close()해야하는 클래스 선언)
//		try문 쓸때 자동으로 close()사용
		try(OutputStream out=new FileOutputStream("data.txt"))
		{
//			입출력 스트림은 예외처리하지 않으면 예외처리 에러발생
//			프로그램 실행x
			out.write(65);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
