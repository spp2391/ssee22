package chapter24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex08_FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Writer out = new FileWriter("text.txt")) {
//			대문자 알파벳을 int로저장하면 알파벳이 저장
			for(int ch=(int)'A'; ch<(int)('Z'+1);ch++) {
				out.write(ch);
			}
//			13,10을 저장하면 저장
			out.write(13);
			out.write(10);
//			문자열 직접저장
			out.write("동해무로가");
//			\r\n : 엔터가 저장됨
			out.write("\r\n");
			out.write("하느님이");
			out.write("\r\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
