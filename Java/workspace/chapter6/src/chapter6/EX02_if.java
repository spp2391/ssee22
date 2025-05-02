package chapter6;

public class EX02_if {

	public static void main(String[] args) {
		
		int x=10;
		if(x>=90) {
			System.out.println("A");
		}
		else if(x>=80) {
			System.out.println("B");
		}
		
		else if(x>=70) {
			System.out.println("C");
		}
		
		else if(x>=60) {
			System.out.println("D");
		}
		
		else {
			System.out.println("F");
		}
		
		int hol=11;
		if(hol%2==0) {
			System.out.println("짝수요");
		}
		else {
			System.out.println("홀스네");
		}
		
		int num = -10;
		int result = num+20;

		if(result>255) {
			System.out.println("255");
		}
		else if(result<0) {
		System.out.println("0");
		}
		else {
			System.out.println(result);
		}
	}

}
