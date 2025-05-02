package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02_Filewrite2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream out = null;
		try{
//			입출력 스트림은 예외처리하지 않으면 예외처리 에러발생
//			프로그램 실행x
			out = new FileOutputStream("data.txt");
			out.write(65);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
//			입출력 스트림이 만들어져 있는지 확인
//			스트림이 null인 상태로 close를 실행하면 에러가 발생.
			if(out != null) {
				try {
					out.close();
				}catch(IOException e2) {
					
				}
			}
		}
		
	}

}
