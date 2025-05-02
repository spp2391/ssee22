package chapter15;

import java.util.Arrays;

public class Ex12_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
//		arr1�� ��� �����͸� 3���� ����
		Arrays.fill(arr1,3);
//		arr1�� 0��° �����ͺ��� �����Ͽ� arr2�� 3��° �����Ϳ��� 4���� ������ �ٿ��ֱ�
		System.arraycopy(arr1,0,arr2,3,4);
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
	}
		System.out.println();
//		copyofrange : arr2�� 2��°���� 5��°��ġ���� �����Ͽ� ����
		int[] arr3= Arrays.copyOfRange(arr2, 2, 5);
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
//		�迭 ����� �޼��尡 �ʿ��� ����
//		�迭�� ��ü�̱� ������ �׳� �����ϸ� �޸��ּҸ� �����ϰ� �����ʹ� �Ѵ� �Ȱ��� ����ϰԵȴ�.
//		���ο� �迭 ����
		int[] arr4 = {1,2,3,4};
//		�迭�� �ٸ� �迭�� ����
		int[] arr5 = arr4;
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
//		������ �迭�� �����͸� ����
		arr4[0]=1000;
		arr5[3]=2000;
//		1000,2,3,4
		
		System.out.println(Arrays.toString(arr4));
//		1,2,3,2000
		System.out.println(Arrays.toString(arr5));
		
//		string ��� �޸��ּҺ��簡�ƴ� �����ͺ���
		
	}
}
