package Array;

import java.util.Scanner;

public class ArrayEx11 {

	public static void main(String[] args) {
		String input;
		String [][] stuff = {
								{"chair","의자"},
								{"computer","컴퓨터"},
								{"integer","정수"},
							};
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i < stuff.length; i++ ) {
			System.out.printf("Q%d. %s 의 뜻은?\n", i+1, stuff[i][0]);
			input = scan.nextLine();
			if(input .equals(stuff[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렷습니다. 정답은 %s 입니다.\n",stuff[i][1]);
			}
		}
	}//main
		
//		System.out.println("Q1. chair의 뜻은? ");
//		input = scan.nextLine();
//		if (input .equals (stuff[0][1])) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.printf("틀렷습니다. 정답은 %s 입니다.\n",stuff[0][1]);
//		}
//		System.out.println("\nQ2. computer의 뜻은? ");
//		input = scan.nextLine();
//		if (input .equals( stuff[1][1])) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.printf("틀렷습니다. 정답은 %s 입니다.\n",stuff[1][1]);
//		}
//		System.out.println("\nQ3. integer의 뜻은? ");
//		input = scan.nextLine();
//		if (input .equals( stuff[2][1])) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.printf("틀렷습니다. 정답은 %s 입니다.\n",stuff[2][1]);
//		}
} 
