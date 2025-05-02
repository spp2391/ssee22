package chapter17;

public class Ex11_AutoBoxingUnboxing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		오토 박싱 : 자동으로 박싱이 일어남
		Integer iobj = 10;
		Double dobj=3.14;
		
//		오토 언박싱이 일어남.
		int num1= iobj;
		double num2= dobj;
		
		System.out.println(num1+":"+iobj);
		System.out.println(num2+":"+dobj);
		
		iobj = iobj+10;
		dobj = dobj+1.2;
		
		System.out.println(iobj+" "+dobj);
	}

}
