package chapter15;

class BoxA4{
	public String name;
	public int age;
	BoxA4(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class Ex04_BoxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxA4[] ar = new BoxA4[4];
		
//		������ ����� �ݵ�� new�� �̿��Ͽ� ����
		ar[0] = new BoxA4("ȫ�浿",20);
		ar[1] = new BoxA4("����ġ",25);
		ar[2] = new BoxA4("�տ���",30);
//		new�� �̿��Ͽ� �ν��Ͻ��� �������� ������ ������ �߻�
//		������ �ڵ� �����δ� ������ ������ ����
//		ar[3].name = "�̼���";
//		ar[3].age = 35;
		
		System.out.println(ar[0].name+","+ar[0].age);
		System.out.println(ar[1].name+","+ar[1].age);
		System.out.println(ar[2].name+","+ar[2].age);
//		System.out.println(ar[3].name+","+ar[3].age);
	}

}









