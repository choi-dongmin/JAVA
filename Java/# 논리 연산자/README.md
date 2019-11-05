# 논리 연산자

## && (and)

&&는 좌항과 우항의 값이 모두 true일때 참이 된다.
```
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

```
위 예문에서 양항이 다 true인것은 첫번째 코드이기 때문에 결과값에는 1이 출력된다.

더 심화시켜서 조건문의 LoginDemo2
```
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
```
 && 연산자로 더 효율적이게 바꾸면
```
		String id = args[0];
		String pw = args[1];
		if (id.equals("dongmin") && pw.equals("123456")) {	
			System.out.print("Correct");
		} else {
			System.out.print("Wrong");
		}
```
이러한 코드로 더욱 보기 편하고 효율적이게 바꿔줄수 있다.

## ||(or)

||는 양쪽 항중에 하나라도 true일 경우 전체가 true가 되는 논리 연산자이다.
```
		if (true || true) {
			System.out.print(1);
		}
		if (true || false) {
			System.out.print(2);
		}
		if (false || true) {
			System.out.print(3);
		}
		if (false || false) {
			System.out.print(4);
		}
```
||는  한쪽 항이라도 true일시에 출력 됨으로 1,2,3이 출력 된다.


```
		String id = args[0];
		String pw = args[1];
		if (id.equals("dongmin")) { //
			if (pw.equals("123456") || pw.equals("111111")) { //	
			System.out.print("Correct");
		} else {
			System.out.print("Wrong");
		}
	  } 
```
만약 pw를 123456 이거나 111111 둘중에 하나라도 입력할시에 dongmin이라는 id는 로그인을 할 수 있다.



## !(not)

!는 부정의 의미로 not이라는 뜻이다. boolean의 값을 역전 시키는 역할이다. 
```
		if(!true) {
			System.out.print(1);
		}
		if(!false) {
			System.out.print(2);
		}
```
true,false 앞에 !을 붙임으로 서로 역전하게 만들어 !true가아닌 !false의 결과값이 출력된다.

## 참조

[생활코딩](https://opentutorials.org/course/1223/5365)
