package test;

import java.util.Scanner;



class PhoneManager{
	private String s;
	private String i;
	private String s2;
	public PhoneManager(String s, String i, String s2) {
		this.s=s;
		this.i=i;
		this.s2=s2;
	}
	public String gets() {
		return s;
	}
	
	public void sets(String s) {
		this.s=s;
	}
	public String geti() {
		return i;
	}
	
	public void seti(String i) {
		this.i=i;
	}
	public String gets2() {
		return s2;
	}
	
	public void sets2(String s2) {
		this.s2=s2;
	}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return  s+"의 번호와 주소는 "+i+s2+" 입니다";
}
	
//	한원선의 번호와 주소는 333-3333, 경기도 입니다
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		PhoneManager arr[] = new PhoneManager[4];
		for(int i=0;i<4;i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력), 주소 >>");
			String x= sc.next();
			String y= sc.next();
			String z=sc.next();
			arr[i]=new PhoneManager(x,y,z);
		}
			
		System.out.print("저장되었습니다...");
		System.out.println("");
		
		while(true) {
			
			System.out.println("검색할 이름 >>");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			boolean b=false;
			for(PhoneManager p : arr) {
				if(p.gets().equals(name)) {
					System.out.println(p);
					b=true;
					break;
				}
			
		}
			
			if(!b) {
				System.out.println(name +"은(는) 없습니다.");
			}

			}
		
	}
}


