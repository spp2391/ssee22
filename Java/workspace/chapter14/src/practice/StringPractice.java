package practice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 1
//		�ֹε�Ϲ�ȣ�� �������� ������ ������ �����ϼ���.
		String str = "990417-1234567";
		String year = str.substring(0,2);
//		Integer.parseInt("���ڿ�") : ���ڿ��� int�ڷ������� ��ȯ
		int intYear = Integer.parseInt(year);
//		50���� ũ�� 19�� ���ϰ� ������ 20�� ���ϴ� if��
		if(intYear>50) {
			year = "19"+year;
		}else {
			year = "20"+year;
		}
		String month = str.substring(2,4);
		String day = str.substring(4,6);
		System.out.println(year+"��"+month+"��"+day+"�� �� �����Դϴ�.");
		
//		����2
//		a/b/c/d�� a:b:c:d �� �ٲپ� �����ϼ���.
		String str2 = "a/b/c/d";
		String[] strArr = str2.split("/");
		String str3 = "";
		for(int i=0; i<strArr.length; i++) {
			str3+=strArr[i];
			if(i<strArr.length-1) {
				str3+=":";
			}
		}
		System.out.println(str3);
		
//		replace(���������ڿ�, �����Ĺ��ڿ�) : Ư�� ���ڿ��� �����ϴ� �޼���
		System.out.println(str2.replace("/", ":"));
	}

}







