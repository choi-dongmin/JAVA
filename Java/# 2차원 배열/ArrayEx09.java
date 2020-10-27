package Array;

public class ArrayEx09 {
	public static void main(String[] args) {
		int sum = 0;
		int score [][] = {
				{100,100,100}, 
				{20,20,20},
				{30,30,30},
				{40,40,40}
			};
		

		
		for(int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
			}
		}
		System.out.println(sum);
	
				
	}
}
