package test;
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class ColorPoint extends Point{
	private String s;
	private int b;
	private int a;
	public ColorPoint(int x, int y,String s) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		this.s=s;
		
	}
	
	public void setPoint(int a, int b) {
		this.a=a;
		this.b=b;
		move(a,b);
		
		
		
	}
	public void setColor(String z) {
		s=z;
	}
	public void show() {
		System.out.println(s+"색으로("+a+","+b+")");
	}
}

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
	    cp.setPoint(10, 20);
	    cp.setColor("GREEN");
	    cp.show();
		
	}

}
//REEN색으로 (10, 20)

