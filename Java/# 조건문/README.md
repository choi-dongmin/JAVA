# 조건문

비교 연산자, Boolean을 기반으로 주어진 조건에 따라 애플리케이션을 다르게 동자작하도록 하는 것 으로 프로그래밍의 핵심중 하나이다.
- if

if 조건문은 if 뒤에 오는 괄호 안에 true,false 두가지만 올 수 있고 true 라면 뒤에 있는 중괄호 안쪽의  코드를 실행 시키고, false라면 바로 뒤의 중괄호가 끝나는 지점으로 가서 코드를 실행 시킨다. 
```
		if (false) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
	}
```

- else

if 만으로는 좀 더 복잡한 상활을 처리하는데 부족함으로 if-else 절은 if값이 true일때  then 절이 실행되고 false일땐 else절이 실행 된다.
```
if (false) {
			System.out.println(1);
		}else{
			System.out.println(2);
		}
```

- else if

else if절을 이용하면 조건문의 흐름을 좀 더 자유롭게 제어할 수 있다. if절 값이 true라면 then절 false라면 else if 절로 넘어간다. else if 절의 값이 true 라면 else if then절이 실행되고 false라면 else 절이 실행된다
else if 절은 복수로 쓸수 있고 else절은 생략이 가능하다. 
```
		if (false) {
			System.out.println(1);
		} else if(true) { System.out.println(2);
		} else if(true) { System.out.println(3);
			} else {System.out.println(4);
		}
	}
}
```
else if 절에서 true가 나오면 바로 그곳에서의 값만 출력되고 나머지는 어떠한 Boolean이든 무시한다.

## 변수와 비교연산자 그리고 조건문

지금까지 배운 것을 조합해 보면
```
		String id = args[0];
		if (id.equals("dongmin")){
			System.out.print("Correct");
		} else {
			System.out.print("Wrong");
		}
```
string 은 문자열 변수의 데이터 형태이고 if 절과 .equals else 절 등 사용해 보았다. 

## 조건문 중첩

다음은 아이디와 패스워드 까지 프로그램 내부로 연결하는 방법이다.
```
package org.opentutorials.javatutorials.Condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if (id.equals("dongmin")) {
			if(pw.equals("123456")) {
				System.out.print("Correct");
		}   else {
				System.out.print("Wrong");
		}
		
		} else {
			System.out.println("wrong");
		}
	}
}

```

이 예제는 입력 값 두개를 받는데 id와 pw를 프로그램 내부로 전달하려면
```
java LoginDemo2 dongmin 12345
```

## 스위치 문

조건문의 대표적인 문법은 if이다. 사용빈도는 적지만 switch문이 보다 로직을 보다 명료하게 보여줄수 있다.
```
		System.out.println("switch(1)");
		switch(1) { 
		case 1:
			System.out.println("one");  
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		 default :
			 System.out.println("default");
		}
		// switch(2) 라면 케이스2 부터뒤로 순차적으로 출력된다.
		// 만약 일치하는 그 값만 출력시키고 싶다면 break; 를 사용한다. 
		// 부여한 조건이 케이스에 표현되지 않고 default를 정해놓았다면 default값이 출력된다. 
		
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two"); 

			// switch(2) 라면 케이스2 부터뒤로 순차적으로 출력된다.  
			// 만약 일치하는 그 값만 출력시키고 싶다면 break; 를 사용한다. 
		
		case 3:
			System.out.println("three");
			
		}
		
		System.out.println("switch(3)");
		switch(3) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
			
		}
		``` 

## 참조
[생활코딩](https://opentutorials.org/course/1223/5365)




