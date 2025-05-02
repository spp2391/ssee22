package practice;

public class MyPoint{
	int w;
	int q;
	public MyPoint(int w, int q){
		this.w = w;
		this.q = q;
		System.out.println(w+","+q);
		
		
		
		
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return w+","+q;
	}





	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a= new MyPoint(3,20);
		System.out.println(a);
	}

}
