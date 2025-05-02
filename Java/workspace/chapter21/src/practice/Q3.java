package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int count = 1;
		int sum2=0;
		for(;;) {
			System.out.println("강수량 입력(0 입력시 종료)>>");
			
		
			int s= sc.nextInt();
			list.add(s);
			if(s==0) {
				System.out.println("END");
				break;
			}
			System.out.println(list);
			 sum += s;
			 sum2=sum/count;
			System.out.println(sum2);
			count++;
			
		}
	}

}
