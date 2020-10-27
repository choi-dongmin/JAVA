package Array;

public class ArrayEx10 {

	public static void main(String[] args) {
		int sum = 0, kortotal = 0, engtotal=0, mathtotal = 0, avg = 0;
		
		int score [][] = {
				{100,100,100}, 
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};

		System.out.println("¹øÈ£ ±¹¾î ¿µ¾î ¼öÇÐ ÃÑÁ¡ Æò±Õ");
		System.out.println("==========================");
		for(int o = 0; o < score.length; o++) {
			kortotal += score[o][0];
			engtotal += score[o][1];
			mathtotal += score[o][2];
		}
		
		
		for(int i=0; i < score.length; i++) {
			sum = 0;
			System.out.print(i+1);
			for(int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
				avg = sum / score[i].length;
			}
			
			for(int k = 0; k < score[i].length; k++) {
				System.out.printf("%5d", score[i][k]);
			}
			System.out.printf("%5d", sum);
			System.out.printf("%5d", avg);
			System.out.println();
		}
		System.out.println("==========================");
		System.out.printf("ÃÑÁ¡: %d %d %d", kortotal, engtotal, mathtotal );
			
	}

}
