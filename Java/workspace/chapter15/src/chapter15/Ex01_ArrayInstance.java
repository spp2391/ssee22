package chapter15;

public class Ex01_ArrayInstance {
	public static void main(String[] args) {
//		�ڹ��� �迭 : �ڷ����� ������ �����Ͱ� ���� �����̸����� ����Ǵ� �ڷᱸ��
//		�迭�� ����
//		�ڷ���[] �����̸� = new �ڷ���[�迭�Ǳ���];
		int[] intArr = new int[3]; // int���� 3�� ������ �� �ִ� �迭 ����
		double[] doubleArr = new double[4];// double���� 3�� �����ϴ� �迭
		String[] strArr = new String[5]; //String���� 3�� �����ϴ� �迭
		
//		length : �迭�� ���̸� ���, �������� ������ �ƴѰ��� ���
		System.out.println(intArr.length);
		System.out.println(doubleArr.length);
		System.out.println(strArr.length);
//		�迭�� ������ �����ϱ�
//		�迭�̸�[��ġ] = ��;
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		
//		�迭�� ������ ����ϱ�
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
//		System.out.println(intArr[3]); �迭�� ���̿��� ����� �����ʹ� ���� �߻�
		System.out.println(doubleArr[3]); // �⺻ �ڷ����� ��� 0 �����
		System.out.println(strArr[3]); // Ŭ���� �ڷ����� ��� null�� �����
		
//		�迭�� ����� ������ ������ �ѹ��� �ϴ� ���
		int[] intArr2 = {90,50,70,30};
		String[] strArr2 = {"����","����","����","����"};
		System.out.println(intArr2[0]);
		System.out.println(intArr2[1]);
		System.out.println(strArr2[0]);
		System.out.println(strArr2[1]);
	}
}









