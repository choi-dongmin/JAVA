# interface vs abstract

abstract 와 interface 두가지 모두 상속을 강제해 상속받는 클래스에서 overriding 을 통해 사용 해야한다.

이 비슷한 두가지의 문법을 한번 비교하여 보자.

## abstract

우선 abstract 와 interface 가 처음으로 다른것은 바로 abstract 는 class 라는 것이다 그렇기 떄문에 

extends 로 상속을 하며 클래스 뿐 아니라 method 에도 마찬가지로 abstract 를 구현할수 있다.

```
package org.opentutorials.javatutorials.abstractclass;


abstract class A {
	
	public abstract int b();
	
	public void c() {
		System.out.println("Succees");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {
	
	public static void main(String[] args) {
		B obj = new B();

		
		
	}

}
```

위와 같이 abstract class A 를 통해 선언하고 class B extends A 로 자식클래스에서 구현하고 있다, 마찬가지로

public abstract int b(); 메소드에 abstract 를 선언하고  class B 에서 그 메소드를 overriding 을 해주고 있다.

위 예제에서 볼수 있는 interface 와 또 하나 다른점은 추상클래스 안에서 추상메소드 뿐 아니라 일반 메소드 또한 가질수 있다는 것인데,

위 경우엔 메소드 c 가 그것을 증명해주고 있다.


## interface 

interface 는 앞서 말한바와 같이 class 가 아니다, 또한 interface 는 자신안에 일반 메소드는 있을수 없으며 내용이 없는

실질적 본체가 없는 메소드만 가질수 있다. 그리고 만약 interface 를 사용하고 싶은 class 는 implements 를 통해

interface 를 사용하며 interface 안 메소드를 구현하지 않으면 오류가 발생한다.

즉, class가 특정한 interface 를 implemennts(구현) 하고 있다면 그 interface의 메소드를 강제하고

있는것이다. 

```
interface 1{
	public void a();
}
interface 2{
	public void b();
}

class A implements 1,2{
	public void a(){};
	public void b(){};
}
```

abstract 에서 설명했듯 interface 안에는 다른 추상메소드 외에 다른 메소드를 가져선 안된다

그리고 이 둘의 가장 다른점을 이야기 하자면 바로 위에서 보다싶이 interface는 다중 상속이 가능하다 

class A implements 1,2 로 복수의 interface 를 받고 있다.


## 차이점 정리

1. abstract 보다 interface 가 조금 더 극단적이다 (일반 메소드를 가질수 조차 없다.)

2. abstract 는 class, method 앞에 붙임으로 선언 해주고, interface 는 그 자체로 선언해준다. 

3. abstract 는 class 이기 때문에 extends 로 상속하고 interface 는 implements 로 구현한다.

4. 가장 큰 특징은 바로 interface 는 여러개를 통해 "다중상속"이 가능하다는 것이다.  


## 키워드

abstract : 본체가 없는 추상적 메소드(abstract method 가 하나라도 있으면 abstract class 이다) 를 만들어 자기를 상속하는

class 에서 overriding 을 통해 재정의 하게 만드는것 (기본적인 큰 방법과 틀을 제공한다)

interface : interface는 본체가 없는 추상적 메소드를 가지지만 일반적 메소드를 가질수 없고, 복수의 interface를 하난의 class 가 구현이 가능하다는 장점이 있다. 

## 참고
[티딩의 하루살이 : 네이버 블로그](https://blog.naver.com/youngchanmm/221278838240)

