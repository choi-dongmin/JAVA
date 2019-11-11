package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"최진혁","최유빈","한아람"};
		for(String a : members)
			System.out.println(a + ". 이 학생은 상담을 받았습니다.");
		// : 뒤에 따라오는 데이터에 담겨있는 원소들을 반복문이 실행될때마다 a에 하나씩 담도록 되어있다.
	}

}
