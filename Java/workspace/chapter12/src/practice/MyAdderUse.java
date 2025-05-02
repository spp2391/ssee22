package practice;

interface AdderInterface{
	int add(int x, int y); //x와 y의 합을 리턴
	int add(int n); // 1~n까지의 정수의 합을 리턴, n은 0보다 큰 수로 가정
}
class MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int n) {
		int result = 0;
		for(int i=1; i<=n; i++) {
			result += i;
		}
		return result;
	}
	
}
public class MyAdderUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}





