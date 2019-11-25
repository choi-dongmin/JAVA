# 유효범위

## 유효범위

변수와 메소드같은 것들을 사용할 수 있는 이유는 이름이 있기 때문이다 그러나 프로그램이 커지면 

여러 이유로 충돌하여 오류를 발생 시킨다. 이를 해결하기 위해서 고안된 것이 바로 '유효범위'

라는 개념이다. 흔히 스코프(Scope)라고도 부른다.



```

public class ScopeDemo1 {

	static void a () {
		int i =0;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}

	}
}
```

위의 메인 호출 메소드를 보면 for 문을 통해 i 변수를 5 보다 작을 경우 1씩 증가시키며 반복하고 있으며

for문 안에 a(); 로 메소드 a 를 불러오고 있다 그럼 다시 변수 i 는 0 이되고 이 for문은 무한 반복

되어야 할까? 저 로직의 결과값을 보면 답은 0,1,2,3,4 이다.

그렇다면 답은 그렇지 않다라는 뜻인데 이유가 무엇일까? 바로 스코프(scope) 유효범위 때문이다.


내부 변수의 값은 그 외부에 영향을 미치지 않는다는 뜻이다 다시말해 메소드 a 의 안에 존재하는 변수값  

int i =0; 은 a의 외부에 있는 메인 메소드에 있는 i 의 값에는 '유효범위'가 미치지 못한다는 뜻이다.


## 다양한 유효범위들 

```
public class ScopeDemo2 {
	static int i ;

	static void a () {
				
		 i = 0;
	}

	public static void main(String[] args) {
		for(i=0; i<5; i++) {
			a();
			System.out.println(i);
		}

	}
}
```

위 예제를 보자 기본적으로 이 전의 예제와 같지만 이 예제의 결과값은 0을 무한히 반복 시킨다. 

코드에 호출 버튼을 누르면 전 코드와 똑같이 변수 i 의 값이 5 보다 작을때 1 씩 증가시키며 반복된다.

그러나 다른게 몇가지 있는데 처음으로 봐야 할것은 

```
public class ScopeDemo2 {
	static int i ;
```
이 부분이다. 

위 코드는 제일 큰 범주에 속하는 클래스에서 클래스 변수로 i 를 지정 하고 있다 이렇게 되면

이 클래스안의 변수 i 가 있는곳 어디에나 유효한 범위이다 그래서 for문은 계속반복하게 된다.


그러나 만약 다른 변수 i 를 생성하거나 지정한다면 

```
//1번

static void a () {
				
		int i = 0;
	}

//2번

for(int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}

```

위의 코드가 각각 이전의 코드에 있다고 가정을 해보자

클래스 변수 i 는 있지만 다른 변수 i 를 생성하거나 지정한다면 결과값은 이 전 예제와 같아진다.

1번을 본다면 a 라는 메소드 안에서 유효한 변수 int i 를 지정해주었기 때문에 메인 메소드의

a(); 를 불러와도 int i는 {}안쪽에서만 유효안 범위를 가지기 때문에 영향을 미치지 않는다.

2번또한 마찬가지의 이유로 for(int i ~~~ ){} for문 {}안에서 유효한 변수 int i를 지정해주었기

때문에 다른곳에 영향을 미치지 않는다.


- 일정한 지역에서만 유효범위를 갖는 함수를 '지역함수(local variable)'

- static 으로 클래스 내의 전 메소드에 유효범위를 갖는 것을 '전역함수(global variable)'  


```
public class ScopeDemo3 {
	 static int i = 5;
	
	static void a () {
		int i = 1;
		b();
	}
	
	static void b () {
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i = 20;
		a();

	}

}
```

위 코드는 정적인 유효범위, 동적인 유효범위를 설명하기 위한 코드이다.

코드를 살펴보면 메인 메소드에서 자신의 지역변수 i 를 10으로 만들고 메소드 a를 불러온다

그럼 메소드 a 에서도 자신의 지역변수 i 를 1로 설정하고 b 메소드를 호출한다.

그럼 b 메소드는 i 를 출력하는데 이 i는 다른 지역변수들이 아닌 전역변수 i를 받고 있다.

그렇담 b 메소드에 같은 i 라는 이름의 지역변수를 지정하면 어떻게 될까?
```
	static void b () {
		int i = 100;
		System.out.println(i);
	}
```
b 메소드를 이렇게 바꾼다면 당연하게 결과값은 100이 출력된다. 

- 이렇게 b처럼 오직 자신의 지역변수와 전역변수에 접근 할 수 있는것이 '정적인 유효범위(static scope)'

- 만약 반대로 b를 호출한 a의 지역변수 1이 출력이 된다면 그것은 '동적인 유효범위(dynamic scope)'


## 참고
[생활코딩](https://opentutorials.org/course/1223/5447)





