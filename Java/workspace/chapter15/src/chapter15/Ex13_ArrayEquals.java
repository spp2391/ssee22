package chapter15;

import java.util.Arrays;

public class Ex13_ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= Arrays.copyOf(arr1, arr1.length);
//		equals : �����Ͱ� ������ Ȯ���ϴ� �޼���
//		�迭�� ��� �迭�� ���� �� �����Ͱ� ������ Ȯ��
//		
		boolean bCheck = Arrays.equals(arr1, arr2);
		System.out.println(bCheck);
		int[] arr3= {1,2,3,4,5};
		int[] arr4= {1,2,3,4,5};
		bCheck = Arrays.equals(arr1, arr2);
//		==���� ���ϸ� �޸��ּҸ� ���ϱ� ������ false�� ���
//		== �޸��ּ� ��
//		equals �����Ϳ� ���� ��
		System.out.println(arr3==arr4);
	}

}
