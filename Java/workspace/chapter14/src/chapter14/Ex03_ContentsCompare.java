package chapter14;

public class Ex03_ContentsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("apple");
		String str2 = new String("APPLE");
		String str3 = new String("Banana");
		int cmp;
		
//		equals : ��ü�� ��ü�� ���ϴ� �޼���
//		String�� ��� �ȿ� ����Ǿ��ִ� ���ڿ��� ������ Ȯ���մϴ�.
		if(str1.equals(str2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
//		compareTo : ������ ������ �°� str1�� �տ� �ִ��� �ڿ��ִ����� ����ϴ� �޼���
//		������ ������ �����ڵ��� ���ڿ� ������ ������
//		compareTo�� ��� ������
//		���� : str1�� str2 ���� ���� ������ �տ� ���� 
//		0 : str1�� str2�� ����
//		��� : str1�� str2���� ���� ������ �ڿ� ����
		cmp = str1.compareTo(str2);
		System.out.println("compareTo�� ���: "+cmp);
		if(cmp==0) {
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		}else if(cmp < 0) {
			System.out.println("������ �տ� ��ġ�ϴ� ����: "+str1);
		}else {
			System.out.println("������ �տ� ��ġ�ϴ� ����: "+str2);
		}
//		compareToIgnoreCase() : ��ҹ��� ������ ���� �ʰ� ���ϴ� �޼���
		System.out.println("compareToIgnoreCase�ǰ�� : "+str1.compareToIgnoreCase(str2));
		if(str1.compareToIgnoreCase(str2)==0) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
	}

}









