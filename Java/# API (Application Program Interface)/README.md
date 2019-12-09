# API (Application Program Interface)

## 기본패키지와 사용자 정의 로직
```
System.out.println(1);
```
지금까지 무수히 많은 예제에서 사용한 코드이다, 끝쪽의 println() 이 부분은 메소드의 형식이다 그리고 맨 앞의

System은 클래스이다 out은 필드(클래식)변수이다.

```
public class Test1 {
	
	public static void main(String[] args){
		System.out.println(1);
	}
}
```
```
import java.leng.*;
public class Test1 {
	
	public static void main(String[] args){
		System.out.println(1);
	}
}
```

위의 두 코드는 완벽하게 일치한다, 왜냐면 import java.leng.* 는 leng안의 모든 class를 import 해서 

쓴다는 뜻 이다. 그러나 저것을 안쓰더라도 자바는 기본적으로 System.out.println(); 를 저절로 찾아올 수 

있게 설정되어있다 바로 저런 자바에서 기본적으로 제공하는 명령어를 API이다.

## API

API란 자바에서 제공하는 명령어들을 의미한다, 우리는 자바의 문법에 맞게 필요한 API를 이렇게 저렇게 

조합함으로 프로그래밍을 한다.

## API 문서

그렇다면 우리는 이 방대한 API 중에 우리가 필요한 API를 어떻게 찾을수 있을까?

(http://docs.oracle.com/javase/) 의 API Documentation 로 들어가서 찾는다.

그 중에 좌상측에 패키지의 형태가 있는걸 볼수 있다 그 곳에서 패키지를 선택하면 바로 그 밑에 그 패키지에 

포함된 클래스들이 나온다, 그렇게 하면 본문에는 그 클래스의 맴버들이 나오게 된다.

## 참고

[생활코딩](https://opentutorials.org/course/1223/6222)  




