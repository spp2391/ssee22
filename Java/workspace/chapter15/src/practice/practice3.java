package practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
//		�������� Ȯ���� �� �ֵ��� ���ڿ��� �Է¹ޱ�
		String a= sc.next();
//		���ڿ��� ������ŭ �ݺ��� ����
		for(int i=0; i<a.length();i++) {
//		charAt()�� �̿��Ͽ� �� ���ھ� char�� ����
			char c=a.charAt(i);
//		���ڰ� �������� �������� Ȯ���ϴ� if��	
			if(c<'0'||c>'9') {
				System.out.println("���� �Է����� �ʾ� ���α׷��� �����մϴ�.");
				return;
			}
		}
//		��� ���ڰ� ���ڶ�� int�� ���� 
		int num= Integer.parseInt(a);
//		¦������ Ȧ������ Ȯ���ϴ� if��
		if(num%2==0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}

}
