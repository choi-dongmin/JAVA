package Array;

import java.util.Scanner;

public class ArrayEx11 {

	public static void main(String[] args) {
		String input;
		String [][] stuff = {
								{"chair","����"},
								{"computer","��ǻ��"},
								{"integer","����"},
							};
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i < stuff.length; i++ ) {
			System.out.printf("Q%d. %s �� ����?\n", i+1, stuff[i][0]);
			input = scan.nextLine();
			if(input .equals(stuff[i][1])) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.printf("Ʋ�ǽ��ϴ�. ������ %s �Դϴ�.\n",stuff[i][1]);
			}
		}
	}//main
		
//		System.out.println("Q1. chair�� ����? ");
//		input = scan.nextLine();
//		if (input .equals (stuff[0][1])) {
//			System.out.println("�����Դϴ�.");
//		} else {
//			System.out.printf("Ʋ�ǽ��ϴ�. ������ %s �Դϴ�.\n",stuff[0][1]);
//		}
//		System.out.println("\nQ2. computer�� ����? ");
//		input = scan.nextLine();
//		if (input .equals( stuff[1][1])) {
//			System.out.println("�����Դϴ�.");
//		} else {
//			System.out.printf("Ʋ�ǽ��ϴ�. ������ %s �Դϴ�.\n",stuff[1][1]);
//		}
//		System.out.println("\nQ3. integer�� ����? ");
//		input = scan.nextLine();
//		if (input .equals( stuff[2][1])) {
//			System.out.println("�����Դϴ�.");
//		} else {
//			System.out.printf("Ʋ�ǽ��ϴ�. ������ %s �Դϴ�.\n",stuff[2][1]);
//		}
} 
