package practice;

import java.util.Arrays;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		선택정렬
//		int a[]= { 5,3,8,2,1,7};
//		int tempValue, tempJ=0;
//		for(int i=0;i<a.length;i++) {
////			int에 저장할 수 있는 가장 큰 값
//			int min = Integer.MAX_VALUE;//임시로 가장 큰 값을 저장하고 첫번째 반복 이후에 배열에서 가장 작은 값이 저장됨.
////			j~i까지 반복
//			for(int j=i;j<a.length;j++) {
//				if(a[j]<min) {
////				a[j]가 min에있는 값보다 작으면 min에 a[j]를 저장
//					min = a[j];
////					tempJ에 가장 작은 값이 있는 배열의 위치값을 저장
//					tempJ = j;
//				}
//			}
////			반복시작될때 값을 tempValue에 저장
//			tempValue=a[i];
////			반복이 시작될때의 배열에 가장 작은 값을 저장
//			a[i]=a[tempJ];
////			가장작은 값이 있던 배열에 반복이 시작될때의 값을 저장
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
			tempValue = a[i];//값 3
			target= i-1;//위치값 0
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
