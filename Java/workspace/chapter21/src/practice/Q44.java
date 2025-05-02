package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	String name;
	String className;
	int classNumber;
	double grade;
	public Student (String name,String className,int c,double d){
		this.name=name;
		this.className=className;
		this.classNumber=c;
		this.grade=d;

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("이름 :"+name);
		System.out.println("학과 : "+className);
	System.out.println("학번 : "+classNumber);
		System.out.println("학점 :"+grade);
		System.out.println("----------------------------------------");
		return name;
	}
}
public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<Student>();
		Scanner sc= new Scanner(System.in);

		for(int i=0; i<5;i++) {
			System.out.println("이름");
			
	
			String a = sc.next();
			
			String b = sc.next();
			int c = sc.nextInt();
			double d = sc.nextDouble();
			
			Student j = new Student(a, b,c,d);
			list.add(j);
			
		
		
		}
//		for(Student s : list) {
//			s.toString();
//		}
//		
//		while(true) {
//			String input = sc.next();
//			if(input.equals("그만")) {
//				System.out.println("End");
//				break;
//			}
//			for(String stu : list) {
//				if(stu.name.equls(stu.name+","+stu.dept+","+stu.dno+","+stu.score))
//			}
//		}
//		
		System.out.println("학생 이름 >>");
		String g= sc.next();
		switch(g) {
		case "최찬미" :
			System.out.println(list.get(3));
		}
		
	}

}
