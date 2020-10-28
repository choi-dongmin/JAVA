package Arrays;

import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {

		int [] arr = {0,1,2,3,4};
		int [][] arr2D = {
							{11,11,11},
							{22,22,22},
							{33,33,33}
						 };
		System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4]
		System.out.println(Arrays.deepToString(arr2D)); // [[11,11,11], ...]
	}

}
