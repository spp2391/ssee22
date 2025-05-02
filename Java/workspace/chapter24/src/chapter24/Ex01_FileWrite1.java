package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_FileWrite1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		data.tex파일생성
		OutputStream out= new FileOutputStream("data.txt");
//		data.txt파일에 65라는 데이터를 저장
		out.write(66);
//		file을 닫는 메서드
		out.close();
		
	}

}
