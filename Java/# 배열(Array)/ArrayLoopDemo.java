package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] Members = {"최진혁","최유빈","한아람"};
		for(int a=0; a<Members.length; a++) {
			String Member = Members[a];
			System.out.println(Member+". 이 학생은 상담을 받았습니다.");
		}
	}

}
