package practice;

import java.util.Arrays;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		��������
//		int a[]= { 5,3,8,2,1,7};
//		int tempValue, tempJ=0;
//		for(int i=0;i<a.length;i++) {
////			int�� ������ �� �ִ� ���� ū ��
//			int min = Integer.MAX_VALUE;//�ӽ÷� ���� ū ���� �����ϰ� ù��° �ݺ� ���Ŀ� �迭���� ���� ���� ���� �����.
////			j~i���� �ݺ�
//			for(int j=i;j<a.length;j++) {
//				if(a[j]<min) {
////				a[j]�� min���ִ� ������ ������ min�� a[j]�� ����
//					min = a[j];
////					tempJ�� ���� ���� ���� �ִ� �迭�� ��ġ���� ����
//					tempJ = j;
//				}
//			}
////			�ݺ����۵ɶ� ���� tempValue�� ����
//			tempValue=a[i];
////			�ݺ��� ���۵ɶ��� �迭�� ���� ���� ���� ����
//			a[i]=a[tempJ];
////			�������� ���� �ִ� �迭�� �ݺ��� ���۵ɶ��� ���� ����
//			a[tempJ]=tempValue;
//		}
//		System.out.print(Arrays.toString(a));
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//		System.out.print(a[i]+" ");
//		}
		
		int a[]= { 5,3,8,2,1,7};
		int target,tempValue =0;
		for(int i=1; i<a.length;i++) {
			tempValue = a[i];//�� 3
			target= i-1;//��ġ�� 0
//			         0               5         3
			while(target >=0 && a[target]>tempValue) {
//				a[1]=5
				a[target+1]=a[target];
				
				target--;
			}
			a[target+1]=tempValue;
		}
		System.out.print(Arrays.toString(a));
	}

}
