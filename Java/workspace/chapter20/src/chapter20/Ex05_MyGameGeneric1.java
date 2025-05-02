package chapter20;

class Npc5{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this is a Npc22";
	}
}
	class Tank5{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "this is a tank22";
		}
	}
//	제네릭 설정
//	1.클래스이름뒤에 <t>작성 , t대신 다른 대문자도 가능
//	보편적으로 ekntv
//	2.어떤 자료형이 들어올지 모르는 부분에 t를 넣어 코드작성
	class Camp5<T>{
//		unit의 자료형 타입을 T로 설정
		private T unit;
//		unit의 데이터 설정시 피요한 매개변수의 타입을 T로 설정
		public void set(T unit) {
			this.unit = unit;
		}
//		unit변수를 반환할 때 사용할 반환타입으로 T를 설정
		public T get() {
			return unit;
		}
	}

public class Ex05_MyGameGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Camp5<Npc5> human = new Camp5<>();
Camp5<Npc5> machine = new Camp5<>();
//	제네릭에는 기초 자료형 사용불가 int double long 등등 사용불가 
//	래퍼클래스는 사용 할 수있음->Integer, Double, Long 은 사용 가능
Camp5<Integer> i = new Camp5<>();//래퍼클래스 사용가능
human.set(new Npc5());
machine.set(new Npc5());
//human.set("나는 문어"); Npc5가 아닌 객체는 저장할 수없도록 설정
//machine.set("난 문어); Tank5가 아닌 객체는 저장 할 수없도록 설정
Npc5 hUnit = human.get();
Npc5 mUnit = machine.get();

System.out.println(hUnit);
System.out.println(mUnit);
	}

}
