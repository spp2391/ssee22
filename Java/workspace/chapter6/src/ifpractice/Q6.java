package ifpractice;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("돈 넣으세요");
		int don = sc.nextInt();
		
		int om= don/50000;
		int m= don%50000/10000;
		int chon= don%50000%10000/1000;
		int ob= don%50000%10000%1000/500;
		int back = don%50000%10000%1000%500/100;
		int ship = don%50000%10000%1000%500%100/10;
		int ill= don%50000%10000%1000%500%100%10;
		
		System.out.println("5만원"+om+"개,"+"만원"+m+"개,"+"천원"+chon+"개,"+"오백원"+ob+"개,"+"백원"+back+"개,"+"십원"+ship+"개,"+"일원"+ill+"개");
	}

}
