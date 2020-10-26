package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {
	int num;
	
	public static void main(String[] args) {
		Random dom = new Random();
		
		
		// int [] arr = new int[]; 이 방식으로 1~10 까지 출력해 보아라
		int [] arr = new int[10];
		
		for(int i = 0; i < 10; i ++){
		int	num = i + 1;
			System.out.print(num+" ");
			
		}
		System.out.println();
		// 위와 같을때 이때 랜덤으로 arr의 길이만큼 숫자를 가져와라.
		for(int i = 0; i < arr.length; i++) {
		int num = dom.nextInt(arr.length);
			System.out.print(num + 1 +" ");
		}
		System.out.println();
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr1));

	}

}
