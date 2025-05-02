package chapter15;

import java.util.Arrays;

public class Ex05_ArrayInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�޼����� ����� �迭�� ��ȯ
		int[] arr = makeIntArray(5);
//		�޼����� �Ű������� �迭�� ���
		int sum = sumOfArray(arr);
		System.out.println(sum);
		
		String str = "010-1234-5678";
		String[] strSplit = str.split("-");
		System.out.println(Arrays.toString(strSplit));
	}
	
	public static int[] makeIntArray(int len) {
//		len �Ű������� arr�迭�� ���� ����
		int[] arr = new int[len];
//		0���� len������ �ݺ��� ����
		for(int i=0; i<len; i++) {
//			0���� len������ �迭�� i ������ ����
			arr[i] = i;
		}
//		�ݺ����� ������ �迭�� return���� ������
		return arr;
	}
	public static int sumOfArray(int[] arr) {
		int sum = 0;
//		�Ű����� arr�� �迭 ���̸�ŭ �ݺ����� ����
		for(int i=0; i<arr.length; i++) {
//			sum������ arr�� ù��° ������ ��� ���ϱ�
			sum = sum + arr[i];
		}
//		arr�迭�� ��� ���� ���� �� return
		return sum;
	}

}







