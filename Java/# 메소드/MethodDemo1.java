package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	public static void numbering() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(); 
	}

}
// 호출 할려는 정의를 쓰고 ();를 써주면 호출이 된 
// 정의와 호출을 구분하는것은 ()다음에 ; 이 들어가면 호출이되고
// ()다음에 {} 가 나오면 정의가 된다.