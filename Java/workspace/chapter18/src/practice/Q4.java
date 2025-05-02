package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer st = new StringTokenizer(a,"+");
		int sum=0;
		while(st.hasMoreTokens()) {
			String numStr = st.nextToken().trim();
			int num =Integer.parseInt(numStr);
			sum += num;
			
		}
//		System.out.print(st);
//		int count = st.countTokens();
//		int total = 0;
//		for (int i = 0; i < count; i++) {
//			String sum = st.nextToken();
//			System.out.println(sum);
//			total += Integer.parseInt(sum);
//		}
		System.out.println(sum);
	}

}
