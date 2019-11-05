package org.opentutorials.javatutorials.Condition;

public class ElseDemo {

	public static void main(String[] args) {
		if (false) {
			System.out.println(1);
		} else if(true) { System.out.println(2);
		} else if(true) { System.out.println(3);
			} else {System.out.println(4);
		}
	}
}
//else if는 복수로 등장 할수 있으며 값이 true가 나오면 바로 그 값의 코딩을 출력하고 나머지는 true나 eles라도 무시한다.  