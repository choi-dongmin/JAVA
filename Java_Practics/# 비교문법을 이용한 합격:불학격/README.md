# 비교문법을 이용한 합격/불학격

## 합격 불합격 출력 프로그램

1. 입력값 : 학년, 점수

2. 조건

1~3학년은 점수가 60점 이상이어야 "합격입니다." 출력

4학년은 70점 이상이어야 "합격입니다." 출력


##
```
package org.opentutorials.javatutorials.note;

import java.util.Scanner;

public class passè {
	int input_int;
	String input_string ;
	String [] grade = {"1학년","2학년","3학년","4학년"};
	
	public void scan_int () {
		Scanner scan = new Scanner(System.in);
		input_int = scan.nextInt() ;
	}
	// Scanner 유틸을 이용하여 사용자가 입력하는 Int값을 읽어내고 그 값을 input_int 에 넣는다.


	public void scan_string () {
		Scanner scan = new Scanner(System.in);
		input_string = scan.nextLine() ;
	}
	// 마찬가지로 Scanner 유틸을 이용하여 사용자가 입력하는 문자를 읽어내고 그 값을 input_string 에 넣는다.
	

	public void grade() {
		System.out.println("학년을 입력하세요. ");
		System.out.println(grade[0] + ": 1");
		System.out.println(grade[1] + ": 2");
		System.out.println(grade[2] + ": 3");
		System.out.println(grade[3] + ": 4");			
	}
	// 배열 grade 를 이용하여 학년마다 1,2,3,4 코드를 쓰도록 보기를 보여주고 있다. 


	public void ask_point() {
		System.out.println("성적을 기입해 주세요.");
	}
	
	public void judge () {
		
		if (input_string .equals("1") || input_string .equals("2") || input_string .equals("3"))  {
			ask_point();
			scan_int();
			if(input_int >= 60) {
				System.out.println("합격입니다.");
			} else if (input_int < 60) {
				System.out.println("불합격입니다.");
			  }	
			
		} else if (input_string .equals("4")){
			ask_point();
			scan_int();
			if(input_int >= 70) {
				System.out.println("합격입니다.");
			} else if (input_int < 70) {
				System.out.println("불합격입니다.");
			  }	
		} else {
			System.out.println("알수없는 입력값입니다. 다시 입력하세요.");
			scan_string();
			judge();
		}
	}
	// input_string에 들어온 값이 1,2,3 이라면 ask_point 메소드를 실행시키고 scan_int 메소드를 실행시킨다
	// 만약 input_int 의 값이 60 보다 크거나 같다면 합격 그 보다 작다면 불합격을 출력하고 있다.
	// 똑같은 방식으로 input_string 이 4 라면 70점 이상이면 합격 미만이면 불합격을 출력해낸다.
	// 또한 input_string 값을 받을때 다른 문자라면 다시 입력하도록 유도하고 있다.  


	public static void main(String[] args) {
		passè pass = new passè();
		pass.grade();
		pass.scan_string();
		pass.judge();
	}

}
```

## 출처
[연습문제 출처](https://blog.naver.com/rlagus834/221727940928)