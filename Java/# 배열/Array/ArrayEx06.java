package Array;

public class ArrayEx06 {

	public static void main(String[] args) {
		int [] score = {79,88,91,33,100,55,95};
		
		int max = score [0];
		int min = score [0];
		
		for(int i : score) {
			if (min > i) {
				min = i;
			}else if (i > max) {
				max = i;
			}else {
				System.out.print("");
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}	
}
