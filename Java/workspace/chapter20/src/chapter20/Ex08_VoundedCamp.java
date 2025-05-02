package chapter20;

// 제네릭 매개변수 타입 제한하기
//T extends Number : Number를 상속받는 클래스만 제네릭으로 사용 가능
class Camp8<T extends Number>{
	private T ob;
	
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
public class Ex08_VoundedCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camp8<Integer> ibox = new Camp8<>();
		ibox.set(24);
		Camp8<Double> dbox= new Camp8<>();
		dbox.set(5.97);
		
		System.out.println(ibox.get());
		System.out.println(dbox.get());
		
//		String의 경우 Number를 상속받지 않기 때문에 에러 발생
//		Camp8<String> sBox = new Camp8<>();
		
	}

}
