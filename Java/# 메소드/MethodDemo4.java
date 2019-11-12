package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

		public static void numbering(int limit, int init) {
			for (int i = init; i<limit; i++) {
				System.out.println(i);
			}
		}
		public static void main(String[] args) {
			numbering(10,5);
	}
}
// 여러 매개변수를 붙이고 콤마를 붙여주면 밑의 인자값도 똑같이 간다.
// 그리고 