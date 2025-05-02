package chapter6;

public class EX01_if {

	public static void main(String[] args) {
		
//		if(조건식) {
//			실행할 코드;
//			실행할 코드;
//		}else if{
//			실행할 코드;
//		}else {
//			실행할 코드;
//		}

		int money=900;
		if(money>=3800) {
			System.out.println("택시타유");
		}
		else if(money>=1500){
			System.out.println("버스타유");
		}
		else if(money>=1000) {
			System.out.println("전동킥보드");
		}
		else {
			System.out.println("걸어가세요");
		}
	}

}
