# Random (확률)

## Random 설정
```
import.java.utill.Random;
class RSP {
	static String [] obj = {"가위","바위","보"};
	static int random_output;

	private void RPS_System() {
		Random RPS = new Random();
		int i = RPS.nextInt(obj.length);
		this.random_output = obj[i];
		System.out.println(obj[i]+"\n");
}

```

확률적인 무언가를 하고 싶을때 설정하는 문법이 바로 "Random" 이다. 위 코드를 함께 보자

나는 {"가위","바위","보"} 이 세가지의 배열 구성원 중 무작위로 하나씩 뽑고 싶다

우선 Random RPS = new Random(); 이처럼 유틸들을 사용할때같이 (Scanner 등) 인스턴스를 시켜주고.

int i = RPS.nextInt(obj.length); 이 로직은 변수 int i 라는 곳에 확율값을 정해주는 곳이다. 

필자는 RPS.nextInt(obj.length); 를 넣음으로 배열의 수만큼 불러왔다. (int i = RPS.nextInt(3); 또한 똑같이 작동한다.)

this.random_output = obj[i]; 그리고 obj의 배열 넘버 [] 안에 변수 int i 를 넣어줌으로 3분의 1의 확율로

배열안의 {"가위","바위","보"} 중 하나가 나오게 된다. 

```
 int i = RPS.nextInt(obj.length); 

만약 확율을 지정해주는 이곳에 배열 구성원의 수보다 더 높은 수를 지정하게 되면

this.random_output = obj[i] 이곳을 통해 예외가 발생하게 된다.
```

## 키워드

Random : 확율을 지정해주는 문법으로 java.utill 중 하나이다.

Scanner : 사용자가 쓴 값을 입력 받도록 하는 문법으로 java.utill 중 하나이다.

예외 : 예외란 흔히 말하는 오류로 많은 개발자의 의도와는 다르게 오류를 발생시키는 것이다. 이떄는 try/catch, thorw  로 해결한다. 

## 참고
[네이버 지식인](https://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040201&docId=312879057&qb=7J6Q67CUIO2ZleuloA==&enc=utf8&section=kin&rank=1&search_sort=0&spq=0)



