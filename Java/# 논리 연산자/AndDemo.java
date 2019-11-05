package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		if (true&&true) {
			System.out.println(1);
		}
		
		if (true&&false) {
			System.out.println(2);
		}
		
		if (false&&true) {
			System.out.println(3);
		}
		
		if (false&&false) {
			System.out.println(4);
		}
		// &&인것은 좌/우항이 모두 true 일때만 출력 됨으로 결과값은 1이다
	}

}
