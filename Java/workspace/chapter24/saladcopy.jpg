package chapter24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex04_FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(InputStream in = new FileInputStream("data.txt")){
			int dat = in.read();
//			read(): 글자하나읽어 int갑으로 돌려주는 메서드
			System.out.println(dat);
			System.out.printf("%c\n",dat);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
