package org.opentutorials.javatutorials.classinstance;

	//class Calculator {
	//	int L,R;
	//	
	//	public void setoprands (int L, int R) {
	//		this.L = L;
	//		this.R = R;
	//	}
	//	public void sum() {
	//		System.out.println(this.L + this.R);
	//	}
	//	public void avg ( ) {
	//		System.out.println((this.L + this.R)/2);
	//	}
	//}
	// 위 예제는 인스턴스를 사용할때에 클래스이다.

	class calculator3 {
		
		public static void sum(int L, int R) {
			System.out.println(L +  R);
		}	
		// int L,R이 바로 매개변수로 들어간다.	
		
		public static void avg (int L, int R) {
			System.out.println((L+R)/2);
		}
	}
	
	public class CalculatorDemo3 {
	
		public static void main (String[] args) {
			calculator3.sum(10,10);
			calculator3.avg(10,20);
		}
	}
