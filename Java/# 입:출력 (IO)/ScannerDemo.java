package org.opentutorials.javatutorials.io;
//
//public class ScannerDemo {

import java.util.Scanner ;

public class ScannerDemo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 현재로서 (System.in) 는 사용자가 키보드를 통해 입력한 
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
