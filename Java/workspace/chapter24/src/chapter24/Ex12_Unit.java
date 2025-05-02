package chapter24;
public class Ex12_Unit implements java.io.Serializable {
	private static final long serialVersionUID=1L;
	private String name;
	public Ex12_Unit(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
// Serializable : 인스턴스를 파일에 저장하거나 네트워크로 전송하는 경우 설정하는 인터페이스
//	serialVersionUID : 인스턴스의 설정되는 고유한 식별자,클래스의 버전정보
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		
	}

}
