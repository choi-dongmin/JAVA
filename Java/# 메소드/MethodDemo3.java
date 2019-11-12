package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static void numbering(int limit) {
		for (int i = 0; i<limit; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		numbering(5);
	}
}

// 위 예제를 보면 define numbering 에 ()안에 int limit이 있고 call numbering(5)가 있
// 이것은 int limit = 5 변수값을 지정한 것과 같은 것이다.
// 그럼으로 int limit = 5 가 됨으로 i<5 가 된다. 변수값을 다르게하면 달라진다.
// numbering(변수 : 파라미터) {} / numbering(인자 : 아규먼트);