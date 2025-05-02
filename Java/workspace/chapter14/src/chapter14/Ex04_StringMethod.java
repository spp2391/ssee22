package chapter14;

import java.util.Scanner;

public class Ex04_StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		indexOf("ã����� ���ڿ�") : ���ڿ��� ��ġ�� ã�Ƽ� �����ִ� �޼���
		String str = "AppleBananaOrange";
		System.out.println(str.indexOf("a")); // 6
		System.out.println(str.indexOf("Banana")); // 5
		System.out.println(str.indexOf("na")); // 7
//		indexOf("���ڿ�",������ġ) : ������ġ���� ���ڿ��� ã�Ƽ� �����ִ� �޼���
		System.out.println(str.indexOf("na",7)); // 7
		System.out.println(str.indexOf("na",8)); // 9
		if(str.indexOf("Berry")>0) {
			System.out.println("���ڿ��� �ȿ� Berry�� �ֽ��ϴ�.");
		}else {
			System.out.println("���ڿ��� Berry�� �����ϴ�.");
		}
//		substring(������ġ, ������ġ): ������ġ���� ������ġ ������ ���ڿ��� �����ִ� �޼���
		System.out.println(str.substring(0,5)); // Apple
//		substring(������ġ) : ������ġ���� ���ڿ��� ������ �����ִ� �޼���
		System.out.println(str.substring(5)); // BananaOrange

//		length() : ���ڿ��� �ȿ� �ִ� ���� ������ �����ִ� �޼���
		System.out.println(str.length());
//		charAt(������ġ) : ������ġ�� �´� ���ڸ� �����ִ� �޼���
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(3));
//		String.valueOf(��) : �ٸ� Ÿ���� �ڷ����� String�� �ٲ��ִ� �޼��� 
		double e = 2.718281;
//		�ٸ� Ÿ���� ������ String�� �����ϴ� ��쿡 ����ϴ� �޼���
		String se = String.valueOf(e);
		Double e2 = 2.718281;
		String se2 = e2.toString();
		System.out.println(se);
		System.out.println(se2);
//		toLowerCase() : �빮�ڸ� �ҹ��ڷ�
		System.out.println(str.toLowerCase());
//		toUpperCase() : �ҹ��ڸ� �빮�ڷ�
		System.out.println(str.toUpperCase());
//		trim() : ���� ���� ������ �����Ͽ� �����ִ� �޼���
		System.out.println("  tr  im  ".trim());
		
//		���ڿ� �����ϱ�
//		concat(���ϰ� ���� ���ڿ�):���ڿ��� �����ִ� �޼���
		System.out.println(str.concat("Berry"));
//		���ڿ��� +, += �� ����ϸ� �ڵ����� concat�޼��带 �����Ѵ�.
		System.out.println(str + "Melon");
		str += "Melon";
		
	}

}









