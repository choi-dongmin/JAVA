package org.opentutorials.javatutorials.multiloop;
import java.util.Scanner;

public class IsoscelesRightTriangle {
	static int input;
	
	private void welcom () {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단으로 하시겠습니까? : ");
	}
	
	private void runing () {
		for(int i=0; i <= this.input; i++) {
			for(int o = 0; o<i; o++) {       
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	
	public void go () {
		welcom();
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		runing();
	}
	
	public static void main(String[] args) {
		
		IsoscelesRightTriangle run = new IsoscelesRightTriangle();
		run.go();
	}

}




// 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.
// 몇 단으로 하시겠습니다? : n
// 결과값.
