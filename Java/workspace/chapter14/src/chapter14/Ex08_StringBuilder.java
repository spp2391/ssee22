package chapter14;

public class Ex08_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String�� ����
//		��ü�� �����ϴ� Ŭ���� �ڷ����̰� String���� ������ �����Ҷ����� ��ü�� �����Ǿ�
//		�޸𸮸� ��ȿ�������� ����ϰԵ� => ���� ����� ����ӵ��� ����
//		StringBuilder�� ���� �������� �ذ��Ͽ� ����ӵ��� ����
		StringBuilder buf = new StringBuilder("���ع���");
		
//		append : ���ڿ��� ���Ҷ� ����ϴ� �޼���
		buf.append("��λ���");
		System.out.println(buf);
		buf.append(12345);
		System.out.println(buf.toString());
//		delete(0, 4) : 0����ġ���� 4�� ��ġ���� �����ϴ� �޼���
		buf.delete(0, 4);
		System.out.println(buf.toString());
//		buf.replace(������ġ, ������ġ, ������ ���ڿ�)
		buf.replace(4, 8, "ABC");
		System.out.println(buf.toString());
//		���ڿ��� �Ųٷ� �����ϴ� �޼���
		buf.reverse();
		System.out.println(buf.toString());
		
//		1970�� 1��1�Ϻ��� ��������� �и������� ����� ��
		long startTime = System.currentTimeMillis();
		String str = "";
		for(int i=0; i<100; i++) {
			str+="apple";//str������ apple�� õ�� ����
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String ����ð�:"+(endTime-startTime));
		
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("");
		for(int i=0; i<100; i++) {
			str2.append("apple");//str2������ apple�� õ�� ����
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder ����ð�:"+(endTime-startTime));
		
//		StringBuilder�� StringBuffer
//		�ΰ��� Ŭ������ �����ϴ� ������ ����
//		�������� ������ ���� 
//		StringBuffer�� ��� ������ ���������� ���= ������ ����ȭ ������� �ӵ� �ø�
//		StringBuilder�� ��� ������ ������ ���= ������ ����ȭ�� ���� �ʱ� ������ �ӵ� ����
	}

}











