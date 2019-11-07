# 반복문(loop)

반복문은 사람이라면 어쩔수 없이 실수할 수 밖에 없는 반복적인 작업을 대신 하도록 해주는 하는것이다. 그래서 사용빈도가 높으며 중요하다고 할 수 있다. 

우리가 배울 반복문은 크게 while 과 for이다. 그리고 이 2 가지는 서로 대체가 가능하다. 

## while
```
		wille(조건) {
			반복 실행 영역	
		}
```

조건은 언제까지 반복한다이며 그 조건까지 반복 실행 영역을 반복한다.

```
		while(true) {
			System.out.println("Coding Everybody");
		}
```

위 코딩을 보면 while(true)이기 때문에 계속 Coding Everybody를 반복해서 출력한다. true에 False가 들어가면 오류가 발생한다.

```
 		int i = 0 
  		while (i < 10) {
  			System.out.println("Coding Everybody"+i);
  		i++;	
  		}
```

위의 예제는 

변수 i(0)의 값이 10보다 작을때 반복해라 Coding Everybody + a를

a를 1씩 증가시키면서. 라는 뜻이다

## for

while은 코드가 복잡해 짐에 따라서 서로 영향을 주는 예컨데 위 예제에서 int와 while과 ++ 가 멀리 떨어지게 된다.

for문은 초기 변수값이 있고 조건 반복 되고 변수값이 반복 될 떄 마다 변동한다면 while보단 for문이 더 사용하기 바람직 하다.

```
		for (초기화; 종료조건; 반복실행) {
			실행 될 구문
		}
```

예제를 보면
```
		for (int a = 0; a < 10; a++) {
			System.out.println("Coding Everybody" + a);
		}
```

for이 실행하는 방식은 

우선 시작 할 때 처음 한번만 변수 a 의 값을 0으로 만들고 

그 다음 종료 조건을 체크한다, 변수 a값이 0이고 10보다 작음으로 true가 되어 실행이 되고

Coding Everybody + a 를 출력하면 반복 실행해야 할 i++을 실행 시키고 

다시 종료조건을 체크한다. 

## 반복문의 제어

- break
	
반복 작업을 중간에 중단시키고 싶다면 break를 사용한다.
```
		for (int a = 0; a < 10; a++) {
			if (a == 5) 
				break;
			System.out.println("Coding World"+a);
		}
```
그 전과 같은 코드이지만 중간에 if가 있는데 만약 변수 a가 5와 같다면 그 밑에 break가 실행되면서 끝난다.

- continue

```
		for (int a = 0; a < 10; a++) {
			if (a == 5) 
				continue;
			System.out.println("Coding World"+a);
		}
```

if then절에 continue가 들어간다면 그 숫자를 제외시키고 다시 진행시키다.

이 경우엔 a가 5면 다시 for문을 실행한다 그럼 다음 coding world 6부터 결과출력을 한다. 

## 반복문의 중첩
```
		for (int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				System.out.println(a+""+ b);
			}
		}
```

반복문 중첩은 반복문안에 또 하나의 반복문을 넣는 것이다.

위 예시를 해석하면

처음 for문의 변수 a가 0이고 10이될때까지 반복하며 1씩 증가한다 그러면 a는 0이다

그 다음 중괄호 안의 for문을 실행하는데 b또한 위와 같은 형태로 0으로 시작한다.

그렇게 되면   (a+""+ b) 에서 a=0 b=0 으로 나타나게 된다.

그러면 다시 b의 for문으로 올라가서 1을 증가시킨다 이때 아직 a는 0이다

이런식으로 b가 9까지 올라가면 다시 a로 올라가 1을 증가시키고 다시 b는 0부터 시작한다.

## 참조
[생활코딩](https://opentutorials.org/course/1223/5366)
