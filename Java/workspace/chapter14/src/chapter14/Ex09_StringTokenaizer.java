package chapter14;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex09_StringTokenaizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringTokenizer(���� ���ڿ�) : ������ �������� ���ڿ��� �и���(�������)
//		StringTokenizer(���� ���ڿ�,���й���) : ���й��ڸ� �������� �и���(���й��� ����)
//		StringTokenizer(���� ���ڿ�,���й���,true):���й��ڵ� �Բ� �и�
		StringTokenizer st1 = new StringTokenizer("a,b,c",",",true);
//		hasMoreTokens() : ���� ���ڰ� �ִ� Ȯ���ϰ� ������ true ������ false�� ���
		while(st1.hasMoreTokens()) {
//			nextToken() : ���� ���ڸ� ���
			System.out.println(st1.nextToken());
		}
//		iterater Ŭ����
//		has�޼���� Ȯ���ϰ� next�޼���� �����͸� ������ Ŭ����
		
//		split(���й���) : StringTokenizeró�� ���ڿ��� �и��ϴ� �޼���
		String str = "010-1234-5678";
//		split�� �����ڸ� �����ϴ� ����� ����
//		��� ����ǥ������ ����Ͽ� ���� �����ϰ� ���� ����
		String[] parts = str.split("-");
		System.out.println(Arrays.toString(parts));
		for(int i=0; i<parts.length; i++) {
			System.out.println(parts[i]);
		}
	}

}








