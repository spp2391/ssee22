package chapter17;

import java.util.Random;

public class Ex14_RandomUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand1= new Random();
		for(int i= 0 ; i<10; i++) 
//			0~9까지 랜덤한 int값을 반환
			System.out.print(rand1.nextInt(10)+" ");
			System.out.println();
			
			Random rand2 = new Random(13);
			for(int i=0; i<10;i++ )
				System.out.print(rand2.nextInt(10)+" ");
			System.out.println();
		}
	

}
