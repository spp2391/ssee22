package chapter21;

import java.util.HashSet;



class Student{
	private String name;
	private int age;
	
	public Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":"+age;
	}
	
	public int hashCode() {
		int num = age%3;
		System.out.println(num);
		return num;
	}
	
	public int hashCode1() {
		int num = java.util.Objects.hash(name,age);
		System.out.println(num);
		return num;
	}
//	hashcode를 비교하도록 변경 
	@Override
	public boolean equals(Object obj) {
		System.out.println("비교를 합니다.");
		if(age==((Student)obj).age)
			return true;
		else 
		return	false;
	}
}

public class Ex07_HashSetEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> set = new HashSet<>();
//		equals를 오버라이드 하여 나이 기준으로 나이 같으면 같은 데이터, 나이 다르면 다른데이터로 설정
		set.add(new Student("홍길동",20));
//		new로 만들어진 객체는 전부 다른 객체로 인식-> 객체는 메모리주소를 각자 가지고있음
//		객체를 같은 내용으로 인식하게 바꾸려면 hash 코드 사용
//		나이가 같기때문에 전우치는 저장x
		set.add(new Student("전우치",20));
//		나이가 달라 저장
		set.add(new Student("홍길동",25));
		
		System.out.println("객체 수 :"+set.size());
		
		for(Student s : set)
			System.out.println(s.toString()+'\t');
		System.out.println();
		
	}

}
