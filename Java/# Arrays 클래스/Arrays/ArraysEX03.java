package Arrays;

import java.util.Arrays;

public class ArraysEX03 {
	
	public static void main(String[] arg) {
	
		int [] arr = {0,1,2,3,4};
		int [] arr2 = Arrays.copyOf(arr, 2); // {0,1}
		int [] arr3 = Arrays.copyOf(arr, arr.length); // {0,1,2,3,4}
		int [] arr4 = Arrays.copyOf(arr, 6); // {0,1,2,3,4,0} 범위를 벗어난 값은 기본값 처리
		int [] arr5 = Arrays.copyOfRange(arr, 0,5); // {0,1,2,3} [5]값은 불포함
		int [] arr6 = Arrays.copyOfRange(arr, 0,7); // {0,1,2,3,4,0} 범위를 벗어난 값은 기본값 처리 
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
	}
}
