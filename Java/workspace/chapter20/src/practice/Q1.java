package practice;

class DeskTop{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "데스크탑을 실행합니다.";
	}
}
class NoteBook{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "노트북을 실행합니다.";
	}
}

class Phone{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "폰을 실행합니다.";
	}
}

class Tablet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "테블릿을 실행합니다.";
	}
}


class Computer<T>{
private T ob;
public void set(T ob) {
	this.ob=ob;
}
public T get() {
	return ob;
}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		제네릭 사용하여 위에 작성한 클래스를 3개저장 할 수있느느 배열을 가진 클래스를 작성
		Computer<NoteBook> noteBook = new Computer<>();
		Computer<Phone> phone = new Computer<>();
		Computer<DeskTop> desktop = new Computer<>();
		Computer<Tablet> tablet = new Computer<>();
		noteBook.set(new NoteBook());
		System.out.println(noteBook.get());
		}

}
