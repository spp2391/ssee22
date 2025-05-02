package chapter17;

public class Ex10_BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		박싱 : 기초자료형을 래퍼클래스로 변경
		Integer iobj = Integer.valueOf(10);
		Double dobj = Double.valueOf(3.14);
//		언박싱 : 래퍼클래스를 기초자료형으로 변경
		int num1 = iobj.intValue();
		double num2 = dobj.doubleValue();
//		출력되는 내용은 같음
		System.out.println(num1+":"+iobj);
		System.out.println(num2+":"+dobj);
		System.out.println();
		
//		intValue()으로 기초자료형으로 변경 -> iobj+10 -> integer.valueof()로 래퍼클래스로 변경
//		-> iobj 변수에 저장
		iobj=Integer.valueOf(iobj.intValue()+10);
		dobj=Double.valueOf(dobj.doubleValue()+1.2);
		
		System.out.println(iobj);
		System.out.println(dobj);
		
	}

}
