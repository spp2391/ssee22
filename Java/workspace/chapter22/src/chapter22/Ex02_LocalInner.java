package chapter22;

class HumanCamp2{
	private int speed=10;
	public void getMarine() {
//		지역내부 클래스 : getMarine 메서드 안에서 선언했기 때문에
		class Marine2 {
			public void move() {
				System.out.println("인간형 유닛이"+speed+"이동합니다");
			}
		}
		Marine2 inner = new Marine2();
		inner.move();
	}
}
public class Ex02_LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanCamp2 hc= new HumanCamp2();
		hc.getMarine();
	}

}
