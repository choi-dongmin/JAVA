package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {
	int num;
	
	public static void main(String[] args) {
		Random dom = new Random();
		
		
		// int [] arr = new int[]; �� ������� 1~10 ���� ����� ���ƶ�
		int [] arr = new int[10];
		
		for(int i = 0; i < 10; i ++){
		int	num = i + 1;
			System.out.print(num+" ");
			
		}
		System.out.println();
		// ���� ������ �̶� �������� arr�� ���̸�ŭ ���ڸ� �����Ͷ�.
		for(int i = 0; i < arr.length; i++) {
		int num = dom.nextInt(arr.length);
			System.out.print(num + 1 +" ");
		}
		System.out.println();
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr1));

	}

}
