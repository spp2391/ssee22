package chapter15;

public class Ex10_ForInFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int[3][3];
		int num= 1; 
//		int[��]�� �ǹ��ϴ� �ݺ���
		for(int i=0; i<3; i++) {
//		int[��][��] : ���� �ǹ��ϴ� �ݺ���
			for(int j=0; j<3; j++) {
				arr[i][j] =num;
				num++;
			}
		}

		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
//				\t : ��
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
