import com.company.area.Circle;

public class Ex03_CircleUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(3.5);
		System.out.println("������ 3.5�� ���� ���� " + c1.getArea());
		
		com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
		System.out.println("������ 3.5�� �� �ѷ� "+c2.getCircumference());
	}

}
