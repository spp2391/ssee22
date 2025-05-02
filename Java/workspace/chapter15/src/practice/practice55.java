package practice;

import java.util.Arrays;

public class practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[10];
		int count= 0;
		while(count<10) {
			int num = (int) (Math.random() * 100) + 1;
			if(num %3 != 0) {
				continue;
			}
			boolean flag= false;
			for(int i=0;i<ar.length;i++) {
				if(num==ar[i]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				ar[count]= num;
				
			}
		}
		System.out.println(Arrays.toString(ar));

//		for (int i = 0; i < ar.length; i++) {
//			int num = (int) (Math.random() * 100) + 1;
//			if (num % 3 == 0) {
////				중복값을 확인하는 boolean 변수
//				boolean flag = false;
//				for(int j=0;j<=i;j++) {
//					if(num == ar[j]) {
//						flag = true;
//						
//					}
//					
//				}
//				ar[i] = num;
//				System.out.print(ar[i]+" ");
////				중복이 없는 경우 num을 저장
//				if(!flag) {
//					ar[i]=num;
//				}
//				else {
//					i--;
//				}
//
//			} else {
//				i = i - 1;
//			}
//
//		}
	}
}
