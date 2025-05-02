package practice;

import java.util.Arrays;
import java.util.Scanner;



class BoxA3{
	public String don;
	public int don1;
	BoxA3(String don,int don1){
		this.don = don;
		this.don1 = don1;
	}
}



public class arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈 주세요");
		int x= sc.nextInt();
		
		BoxA3[] ar = new BoxA3[10];
		ar[0] = new BoxA3("5만원",x/50000);
		ar[1] = new BoxA3("만원",x%50000/10000);
		ar[2] = new BoxA3("5천원",x%50000%10000/5000);
		ar[3] = new BoxA3("천원",x%50000%10000%5000/1000);
		ar[4] = new BoxA3("5백원",x%50000%10000%5000%1000/500);
		ar[5] = new BoxA3("백원",x%50000%10000%5000%1000%500/100);
		ar[6] = new BoxA3("5십원",x%50000%10000%5000%1000%500%100/50);
		ar[7] = new BoxA3("십원",x%50000%10000%5000%1000%500%100%50/10);
		ar[8] = new BoxA3("5원",x%50000%10000%5000%1000%500%100%50%10/5);
		ar[9] = new BoxA3("일원",x%50000%10000%5000%1000%500%100%50%10%5/1);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i].don+":"+ar[i].don1+"매");
		}
	}
}
