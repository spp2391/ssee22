import com.study.Banana;

public class Ex02_PackageUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		apple.showName();
		
//		��Ű������ Ŭ���� �տ� ���� ���� ���
//		com.study.Banana banana  = new com.study.Banana();
//		class ����� ���� import�� ����Ͽ� ��Ű������ ���� ���
		Banana banana  = new Banana();
		banana.showName();
	}

}








