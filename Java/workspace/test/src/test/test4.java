package test;
class StudentScore{
	
}
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = {
			    {80,60,70}, {90,95,80}, {75,80,100}, {80,70,95}, {100,65,80}
			};
//		int count=0;
//		int sum=0;
//		for(int i=0; i<scores.length;i++) {
//			for(int j=0; j<scores[i].length;j++) {
//				sum += scores[i][j];
//				count++;
//			}
//		}
//		double avg= sum/count;
//		
//		System.out.println("학생번호   국어   영어   수학    총점    평균");
//		System.out.println("=============================================");
//		for(int i=0; i<scores.length;i++) {
//			for(int j=0; j<scores[i].length;j++) {
//				System.out.print(scores[i][j] +" ");
//				System.out.print(sum);
//				
//			}
//			System.out.println("");
//		}
		System.out.println("학생번호   국어   영어   수학    총점    평균");
		System.out.println("=============================================");
		for(int i= 0; i<scores.length;i++) {
			int sum=0;
			System.out.print(" "+i+1+"  ");
			for(int j=0;j<scores[i].length;j++) {
				System.out.print("    "+scores[i][j]);
				sum+=scores[i][j];
			}
			double avg=sum/3;
			System.out.println("    "+sum+"    "+avg);
		}
	}

}
