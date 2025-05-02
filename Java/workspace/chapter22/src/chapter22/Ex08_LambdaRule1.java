package chapter22;

interface Unit8{
	void move(String s);
}

interface Unit9{
	int calc(int x, int y);
}
public class Ex08_LambdaRule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit8 unit;
		unit = (String s)-> {System.out.println(s);};
		unit.move("Lamda: 줄임없는 표현 : 앞 예제ㅗ아 동일");
		
		unit = (String s) -> System.out.println(s);
		unit.move("Lambda : 중괄호 생략");
		
//		실행코드가 한줄만 있기 때문에 중괄호 생략 가능
		
		
//		매개변수하나이기때문에 자료형 생략
		unit = (s)-> System.out.println(s);
		unit.move("Lambda : 매개변수 형 생략");
//		매개변수하나이기때문에 소괄호 생략
		unit = s -> System.out.println(s);
		unit.move("매개변수 소괄호생략");
		
//		매개변수가 두개 이상이면 소괄호를 생략할 수없음.
		Unit9 unit2 = (a,b)->{return a+b;};
//		unit2 = a,b -> {return a+b;};
//		실행 코드가 한줄이고 return값설정하면 중괄호와 return생량가능
		unit2 = (a,b)-> a+b;
	}

}
