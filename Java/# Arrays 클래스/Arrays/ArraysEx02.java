package Arrays;

import java.util.Arrays;

public class ArraysEx02 {
	public static void main(String[] arg) {
		String [][] arr2D = {
								{"AAA"},
								{"BBB"},
								{"CCC"}
					  		};

		String [][] arr2dee = {
								{"AAA"},
								{"BBB"},
								{"CCC"}
							 };
		
		System.out.println(Arrays.equals(arr2D, arr2dee)); //false(2차원 배열이라서)
		System.out.println(Arrays.deepEquals(arr2D, arr2dee)); 
		// ture
	}
}
