package org.opentutorials.javatutorials.Operator;

public class DivisonDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0f;
		float d = 3.0f;
		
		System.out.println(a/b);  // int 10/3 = 3
		System.out.println(c/d);  // float 10.0f/3.0f = 3.3
		System.out.println(a/d);  // 10.0/3.0f = 3.3 (int a 의 자동형변환) 
	}

}
