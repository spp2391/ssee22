package chapter15;

import java.util.Arrays;
import java.util.Collections;

public class Ex14_AraaySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1= {1,3,2,4};
		Double[] arr2 = {4.4, 3.3, 2.2, 1.1};
		String[] arr3= {"ȫ�浿","����ġ","�տ���","�ָ�"};
//		int �迭�� ��� ���������ۿ� ������ �� ����.
//		Integer�迭�� ��� ��������,�������� �Ѵ� ����
//		Integer�迭�� Collections.reverseOrder()�� ����Ͽ� ��������
		Arrays.sort(arr1,Collections.reverseOrder());
		
		Arrays.sort(arr2,Collections.reverseOrder());
//		doble�� �������� �Ұ�, Double�� �������� ����
		Arrays.sort(arr3,Collections.reverseOrder());
		for(int n:arr1) {
			System.out.print(n+"\t");
		}
		System.out.println();
		for(String s:arr3) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(double d:arr2) {
			System.out.print(d+"\t");
		}
	}

}
