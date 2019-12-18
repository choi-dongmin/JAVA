# 인터페이스

인터페이스는 final,abstract 과 함께 대표적인 '규제'이다. 인터페이스는 어떤 클래스가 있고 그 클래스가

특정한 인터페이스를 사용한다면 반듯이 그 인터페이스를 사용하는 메소드를 구현해야 한다.

```
interface I{
	public void z();
} 

class A implements I{
	public void z(){}
}

```
calss 가 아닌 interface 로 시작한다 즉, I는 클래스가 아닌 인터페이스이다 그안에 method z가 있지만 

보면 실직적인 본체가 없다({}) 추상클래스 안에있는 추상메소드 처럼.

그리고 class A는 implements(구현하다) I 를 하지만 만약 구현하는 클래스에서 interface의 

메소드 ( public void z(){} ) 을 쓰지 않는다면 오류가 발생한다. 즉 ineterface 에서 정의한 

메소드를 클래스에서 가져와 본체까지 구현해야 한다.

```
즉, class가 특정한 interface 를 implemennts(구현) 하고 있다면 그 interface의 메소드를 강제하고

있는것이다. 
```


## 실질적인 쓰임

만약 계산기 예제가 여러사람이 참여하는 프로젝트이고 그것이 기한이 얼마 안남았다고 치자 그리고 이 계산기 

클래스를 만드는 개발자가 있고 그것을 사용하는 것을 구현하는 개발자가 있다고 하고 두가지 측면으로 보자

먼저 사용개발자

```
class CalculatorDummy{
	
	public void setOprands(int F, int S, int T){}

	public int sum(){
		return 20;
	}
	public int avg(){
		return 60;
	}

}

public class CalculatorConsumer{
	public static void main(String[] args){

	CalculatorDummy c1 = new CalculatorDummy();
	c1.setOprands(10,20,30);
	System.out.println(c1.sum() + c1.avg());
	}
}

```
이 사용개발자는 실질적인 계산코드를 개발하는 사람이 잘 만들어서 보내줄것을 기대하고 모조클래스(Dummy) 를 

만들었다 그리고 그 메소드의 값은 자신이 원하는 대로 설정하고있다. 그리고 호출하는 클래스에 자신이 해야할 

로직을 다 적었다고 하자. 이런식으로 진행해야 병목현상을 해결할수 있다. 그리고 시간이 지난 뒤에 개발자가

클래스를 인계해 주었다.

```
class Calculator{
	int L,R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}

	public void sum(){
		System.out.println(this.L + this.R);
	}
	public void avg(){
		System.out.println((this.L+this.R)/2)
	}
}
```
위 클래스를 완성해서 주었다, 그렇다면 문제가 발생한다 사용개발자는 3개의 인자갑을 받을수 있도록 지정해 

두었는데 받은 클래스는 2가지의 인자값을 받도록 되어잇다. 이건 의사소통의 문제이다 하지만 서면이나 구두로

주먹구구식으로 합의를 보아서 진행을 할수도 있지만 자바안에서의 약속, 룰을 정해놓으면 훨씬 효율적일 것이다.

그래서 두 개발자의 합의하에 interface를 만들었다.

```
public interface CalculatorRule{
	public void setOprands(int F, int S, int T);
	public int sum();
	public int avg(); 
}
```
그래서 두 개발자는 다시 코드를 수정한다 사용개발자는 비교적 적은 수정을 하였다.

```
class CalculatorDummy implements CalculatorRule{
	
	public void setOprands(int F, int S, int T){}

	public int sum(){
		return 20;
	}
	public int avg(){
		return 60;
	}

}

public class CalculatorConsumer{
	public static void main(String[] args){

	CalculatorDummy c1 = new CalculatorDummy();
	c1.setOprands(10,20,30);
	System.out.println(c1.sum() + c1.avg());
	}
}
```
이렇게 되면 사용개발자는 저 interface에 의해 CalculatorDummy 에 추가하더라도 CalculatorRule

에 의해 오류가 발생하지 않는다면 계산개발자와 오류가 발생할 확률이 CalculatorRule의해 적어질것이다.

계산개발자를 보면.
```
class Calculator implements CalculatorRule{
	int F,S,T;
	public void setOprands(int F, int S, int T){
		this.F=F; this.S=S; this.T=T;
	}

	public int sum(){
		return this.F+this.S+this.T;
	}
	public int avg(){
		return (this.F+this.S+this.T)/3;
	}

}
```
자신이 CalculatorRule 에 의해 잘 역할을 수행하고 있다고 믿을수 있다. 


## 인터페이스의 규칙

결국 인터페이스는 대상의 시스템을 제어하기 위해 사용하는 장치들이다,

1. 인터페이스는 안의 맴버는 언제나 public 이다. 

2. 인터페이스는 하나의 클래스 안에 여러개를 가질수 있다. (classs A implements 1,2)

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

3. 인터페이스 또한 상속이 가능하다.()

```
interface 1{
	public void a();
}
interface 2 extends 1{
	public void b();
}

class A implements 2{
	public void a(){};
	public void b(){};
}
```

## abstract vs interface

추상클래스는 추상클래스에 있는 메소드를 하위 클래스에 강제 overriding을 해야한다는것이 인터페이스와 

비슷하지만 추상클래스에는 구체적인 로직이나 코드가 존재한다.

그에 반해 interface는 강제하는 것은 같지만 구체적인 로직을 interface 주면 오류가 발생한다.

## 키워드

interface : 큰 그림(매개변수타입, 수)를 자신을 구현하는 클래스에 강제하고 자신이 구체적인 로직을 

가질순 없다.

abstract : 자신이 가진 메소드를 상속하는 클래스에 강제하고 자신이 구체적인 로직을 가질순 있다.

implements : 구현

## 생활코딩 
[생활코딩](https://opentutorials.org/course/1223/6063)





