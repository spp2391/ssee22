package testtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;





class Circle {
	private int radius;
	
	public Circle(int radius) { 
		this.radius = radius;
	}
	
	public double getArea() { 
		return radius*radius*3.14; 
	}
}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<5;i++) {
			System.out.println(i+"반지름 >>");
			int x= sc.nextInt();
			list.add(x);
		}
			System.out.println("저장하였습니다.");
			List<Circle> circle = new ArrayList<>();
			for(int z : list) {
				circle.add(new Circle(z));
			}
			System.out.println("원의 면적 전체 합은");
			double sum=0.0;
			for(int i=0;i<circle.size();i++) {
				double area =circle.get(i).getArea();
				sum+=area;
				
			}
			System.out.println(sum);
		}
		
		
		
				}



