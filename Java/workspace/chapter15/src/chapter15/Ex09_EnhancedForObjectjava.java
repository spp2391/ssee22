package chapter15;

public class Ex09_EnhancedForObjectjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class House{
			private int houseNum;
			private String name;
			
			House(int houseNum, String name){
				this.houseNum= houseNum;
				this.name=name;
			}
				
			
			public int getHouseNum() {
				return houseNum;
			}
			public String getName() {
				return name;
			}
	}
	
		House[] arr = new House[5];
		arr[0] = new House(101,"홍길동");
		arr[1] = new House(102,"전우치");
		arr[2] = new House(103,"손오공");
		arr[3] = new House(104,"해리포터");
		arr[4] = new House(105,"멀린");
		for(House e : arr ) {
			if(e.getHouseNum()==102 || e.getHouseNum()==105 ) {
				System.out.println(e.getName());
			}
		}
	}
}
