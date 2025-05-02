
package chapter20;

class Npc2{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this is a Npc22";
	}
}
	
	class Capm2{
		private Object unit;
		public void set(Object unit) {
			this.unit=unit;
		}
	
	public Object get() {
		return unit;
	}
}
class Tank2{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this is a tank22";
	}
}


public class Ex02Mygame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capm2 human = new Capm2();
		Capm2 machine = new Capm2();
//		npc1이외 객체는 추가 할 수없음.
		human.set(new Npc2());
		machine.set(new Tank2());
//		Npc2 hUnit = (Npc2)human.get();
//		Tank2 mUnit = (Tank2)machine.get();
		System.out.println(human.get());
		System.out.println(machine.get());
//		System.out.println(hUnit);
//		System.out.println(mUnit);
	}

}
