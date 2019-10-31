package org.opentutorials.javatutorials.Operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int a = 3;
		a++;
		System.out.println(a); // 4가 출력된다.
		a++;
		System.out.println(a); // 5가 출력된다.
		System.out.println(++a); // 6이 출력된다.
		System.out.println(a++); // 6이 출력된다.()안에서의 ++/-- 가 상수보다 뒤에 쓰이면 우선 괄호의 a를 프린트
								 // 그 다음 a를 증감 하라는 뜻이기 떄문에 그 다음 프린트 되는 a
		System.out.println(a); // 7이 출력된다.
	}

}
