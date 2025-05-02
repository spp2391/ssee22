package chapter20;

class Npc1{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this is a Npc1";
	}
}
	
	class HumanCapm1{
		private Npc1 unit;
		public void set(Npc1 unit) {
			this.unit=unit;
		}
	
	public Npc1 get() {
		return unit;
	}
}
class Tank1{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this is a tank1";
	}
	
}
class MachineCamp1{
	private Tank1 unit;
	
	public void set(Tank1 unit) {
		this.unit=unit;
	}

public Tank1 get() {
	return unit;
}
}
public class Ex01_MyGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanCapm1 human = new HumanCapm1();
		MachineCamp1 machine = new MachineCamp1();
//		npc1이외 객체는 추가 할 수없음.
		human.set(new Npc1());
		machine.set(new Tank1());
		Npc1 hUnit = human.get();
		Tank1 mUnit = machine.get();
		
		System.out.println(hUnit);
		System.out.println(mUnit);
	}

}
