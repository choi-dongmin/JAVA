# 다중루프(multiloop)

다중루프란 중첩되어 있는 반복문이다. 코드중 가장 많이 사용한다고 할 수 있는 반복문을 중첩하게 함으로 새로운 결과를 얻어낼수 있다.

```
for (int a=0; a<10; a++) {
	for(int b=0; b<10; b++) {
		System.out.println(a+""+ b);
	}
}
```

위와 같은 반복문이 있고 반복문에는 2번의 for 가 존재한다 각각의 반복문은 0 ~ 9 까지의 숫자를 각각 나타내고 있으며 그 값을 각각 합치고 있다.

결과 값은 00 ~ 99 까지의 숫자가 반복되어 나올것이다.

## 활용

### 곱셈표
그렇다면 우리는 이 방법으로 덧셈표를 만들수 있을것이다.

```

for(int i = 1; i < 10; i++) {
	for(int o = 1; o<10; o++) {
		System.out.print(i*o+" " );
	}
	System.out.println();
}

* 결과값
1 2 3 4 5 6 7 8 9 
2 4 6 8 10 12 14 16 18 
3 6 9 12 15 18 21 24 27 
4 8 12 16 20 24 28 32 36 
5 10 15 20 25 30 35 40 45 
6 12 18 24 30 36 42 48 54 
7 14 21 28 35 42 49 56 63 
8 16 24 32 40 48 56 64 72 
9 18 27 36 45 54 63 72 81 

```

우리는 위과 같은 곱셈표를 만들수 있을것이다 조금 더 이 표를 읽기 쉽게 바꾸고 싶다면 이렇게 만들수 있을것이다.

```
System.out.print("  | ");
	for(int i=1; i<10; i++) {
		System.out.print(+ i+" ");
	}
	System.out.println();
	System.out.println("- + - - - - - - - - -");
	for(int i = 1; i < 10; i++) {
		System.out.print(i+" | ");
		for(int o = 1; o<10; o++) {
				System.out.print(i*o+" ");
		}
		System.out.println();
	}

*결과값
  | 1 2 3 4 5 6 7 8 9 
- + - - - - - - - - -
1 | 1 2 3 4 5 6 7 8 9 
2 | 2 4 6 8 10 12 14 16 18 
3 | 3 6 9 12 15 18 21 24 27 
4 | 4 8 12 16 20 24 28 32 36 
5 | 5 10 15 20 25 30 35 40 45 
6 | 6 12 18 24 30 36 42 48 54 
7 | 7 14 21 28 35 42 49 56 63 
8 | 8 16 24 32 40 48 56 64 72 
9 | 9 18 27 36 45 54 63 72 81 
```

### 덧셈표
```
System.out.print("  | ");
	for(int i=1; i<10; i++) {
		System.out.print(+ i+" ");
	}
	System.out.println();
	System.out.println("- + - - - - - - - - -");

	for(int i = 1; i < 10; i++) {
		System.out.print(i+" | ");
		for(int o = 1; o<10; o++) {
			System.out.print(i+o+" ");
		}
		System.out.println();
	}

*결과값
  | 1 2 3 4 5 6 7 8 9 
- + - - - - - - - - -
1 | 2 3 4 5 6 7 8 9 10 
2 | 3 4 5 6 7 8 9 10 11 
3 | 4 5 6 7 8 9 10 11 12 
4 | 5 6 7 8 9 10 11 12 13 
5 | 6 7 8 9 10 11 12 13 14 
6 | 7 8 9 10 11 12 13 14 15 
7 | 8 9 10 11 12 13 14 15 16 
8 | 9 10 11 12 13 14 15 16 17 
9 | 10 11 12 13 14 15 16 17 18 
```

## 직각 삼각형 출력

이번엔 "*" 을 이용해 사용자가 입력한 만큼의 단을 가진 직각 삼격형을 출력하는 시스템을 할 수있다.

```
public class IsoscelesRightTriangle {
	static int input;
	
	private void welcom () {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.println("몇 단으로 하시겠습니까? : ");
	}
	
	private void running () {
		for(int i=0; i <= this.input; i++) {
			for(int o = 0; o<i; o++) {       
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	
	public void go () {
		welcom();
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		runing();
	}

* 결과값
왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.
몇 단으로 하시겠습니까? : 5

*
**
***
****
*****

```

위 경우를 보면 실직적으로 작동하는 곳은 running method 이다.

```
	private void running () {
		for(int i=0; i <= this.input; i++) {
			for(int o = 0; o<i; o++) {       
			System.out.print("*");
			}
		System.out.println("");
		}
	}
}	

*public class 에서 input 이라는 int 전역변수를 선언하였다.
* 입력값은 Scanner 를 통해 input 에 입력된다. 
```
이렇게 본다면 우선 input 이라는 입력값을 맏고 변수 i 는 입력값과 값이 작거나 동일 할때까지 1씩 증가 시키며 반복을 하게된다.

그리고 그 안에 다중루프를 적용해 마찬가지로 o 변수가 i 변수보다 작을때 1씩 증가시키며 반복을 하며 "*"을 출력한다.

i : 1 / o : 0("*") , i : 2 / o : 0,1("**")... 이러한 방식으로 다중루프를 이용해 사용자가 입력한 값만큼의 "*" 을 출력해 낼수 있다.

## 키워드

다중루프(multiloop) : 반복문 안쪽에 또 다른 반복문을 배치하는것.

   

