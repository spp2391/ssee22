package chapter15;

import java.util.Arrays;

public class Ex12_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
//		arr1의 모든 데이터를 3으로 설정
		Arrays.fill(arr1,3);
//		arr1의 0번째 데이터부터 복사하여 arr2의 3번째 데이터에서 4개의 데이터 붙여넣기
		System.arraycopy(arr1,0,arr2,3,4);
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
	}
		System.out.println();
//		copyofrange : arr2의 2번째부터 5번째위치까지 복사하여 저장
		int[] arr3= Arrays.copyOfRange(arr2, 2, 5);
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
//		배열 복사시 메서드가 필요한 이유
//		배열은 객체이기 때문에 그냥 대입하면 메모리주소만 저장하고 데이터는 둘다 똑같이 사용하게된다.
//		새로운 배열 생성
		int[] arr4 = {1,2,3,4};
//		배열을 다른 배열에 대입
		int[] arr5 = arr4;
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
//		각각의 배열에 데이터를 변경
		arr4[0]=1000;
		arr5[3]=2000;
//		1000,2,3,4
		
		System.out.println(Arrays.toString(arr4));
//		1,2,3,2000
		System.out.println(Arrays.toString(arr5));
		
//		string 경우 메모리주소복사가아닌 데이터복사
		
	}
}
