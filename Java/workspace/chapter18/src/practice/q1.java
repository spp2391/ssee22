package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("입력");
String a = sc.nextLine();
StringTokenizer st = new StringTokenizer(a);
int count= st.countTokens();
if(a.equals("exit")) {
	System.out.println("종료합니다…");
}
else
System.out.println("어절 개수는"+count);
		
	}

}
