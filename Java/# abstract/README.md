# abstract

abstract 는 추상으로 번역된다. abstract class, method는 직접 사용이아닌 반듯이 그것을 상속한 

클래스를 만들어서 그 클래스를 사용하도록 강제해야 한다.

## 추상 메소드

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

위 예제를 보면 abstract class A 가 있지만 abstract 는 상속을 받아 사용해야 하기 때문에 B 에서 

상속하고 있다 또한 public abstract int b(); 라는 이 method 또한 abstract method 이기 때문에

overriding 을 통해 하위클래스에서 재정의해 오류를 해결 하였다. 

abstract class 와 method 는 구체적인 키워드를 가질 수 없다 
(ex : System.out.println("Succees");)  

abstract method 같은 경우에는 상속을 받은 클래스에서 구체적인 키워드를 overriding 해주어야 한다. 

abstract class 는 상속을 하여서 사용하여야 하고 abstract class내에 abstract method 말고 다른

method 도 가질수 있다. (단, class 내의 맴버중 하나라도 abstract 라면 abstract class
가 된다.) 


## 추상 클래스를 사용하는 이유
```
abstract class Calculator {
	int L,R;
	
	public void SetOprands(int L, int R) {
		this.L = L; this.R = R;
	}
	
	abstract void sum();
	abstract void avg();
	public void Run(){
		sum();
		avg();
	}
}

class PlusCalculator extends Calculator {

	public void sum() {
		System.out.println("+ sum " + (this.L+this.R));
	}
	public void  avg() {
		System.out.println("+ avg "+(this.L+this.R)/2);
	}
}

class MinusCalculator extends Calculator{

	public void sum() {
		System.out.println("- sum " + (this.L+this.R));
	}
	public void  avg() {
		System.out.println("- avg "+(this.L+this.R)/2);
	}
}



public class AbstractDemo2 {
	
	public static void main(String[] args) {
		PlusCalculator plus = new PlusCalculator();
		plus.SetOprands(10, 20);
		plus.Run();
		
		
		MinusCalculator minus = new MinusCalculator();
		minus.SetOprands(10,10);
		minus.Run();
	}
}
```

여전히 우리가 사용했던 calculator 예제이다 먼저 말하면 abstract 는 사용자 즉 상속받은 사람에게 

권한을 위임한다고 볼수도 있다. 우선은 abstract 가장 큰 틀인 SetOprand와 sum,avg 두가지가 Run이라는

method를 쓰게 된다면 사용할수있는 형식을 지정해주면 사용자가 그 형식에 어떻게 대입하여 사용할것인지 

정의하는 시스템이다. 

그러나 보면 또 중복이 존재한다 그 중복을 제거해주면
```
package org.opentutorials.javatutorials.abstractclass;

abstract class Calculator {
	int L,R;
	
	public void SetOprands(int L, int R) {
		this.L = L; this.R = R;
	}
	
	int Sum() {  				// int 앞에 아무것도 없기에 저것은 default 이다.
		return this.L+this.R;
	}
	
	int Avg() {
		return (this.L+this.R)/2;
	}
	
	abstract void sum();
	abstract void avg();
	public void Run(){
		sum();
		avg();
	}
}

class PlusCalculator extends Calculator {

	public void sum() {
		System.out.println("+ sum " + Sum());
	}
	public void  avg() {
		System.out.println("+ avg "+Avg());
	}
}

class MinusCalculator extends Calculator{

	public void sum() {
		System.out.println("- sum " + Sum());
	}
	public void  avg() {
		System.out.println("- avg "+Avg());
	}
}



public class AbstractDemo2 {
	
	public static void main(String[] args) {
		PlusCalculator plus = new PlusCalculator();
		plus.SetOprands(10, 20);
		plus.Run();
		
		
		MinusCalculator minus = new MinusCalculator();
		minus.SetOprands(10,10);
		minus.Run();
	}
}
```
이런식으로 중복을 제거 할수 있다.


## 디자인 패턴

프로그램 디자인 매우 창조적인 활동이지만 그 안에서도 패턴이 존재한다. 예를 들어 다리를 건축하는 공법,

건물을 만드는 공법 등 또 그 안에서도 여러가지 형태로 설계하고 하는 방법이 있을것이다 프로그래밍도 똑같다

그것이 디자인 패턴이다.

어떠한 방법 및 구조를 하나하나 설명하지 않고 그 공법을 말하면 모두가 알수 있는 것이 장점이다.

우리가 했던 calculator는 template pattern 이라고 한다. 자주사용하는 도형이 도형자 안쪽에 구멍으로

뚫어져 있어 사용하는 것처럼, 큰 모양은 개발자가 만들어 주고 그안에 어떤 색칠(프로그래밍에선 재정의)을 할

것인가는 사용자에 의해 달려있다.


## 키워드

- abstract : 추상이라는 뜻으로 직접 그 클래스에서 method 혹은 class 사용할 수 없게하여 상속을 	

	강제하는 시스템이다. (class 맴버중 abstract 있으면 abstract class가 되고 abstract 메소드

	뿐 아니라 다른 메소드도 가질수 있다.)

- overriding : 하위 클래스에서 상위 클래스에 있는 같은 메소드를 재정의해 그 재정의 한것을 우선순위로

	하는것. 

- Template Pattern : 작동하는 시스템을 구조를 사용자에게 주고 사용자 즉 상속받은 사람에게 권한을 

	위임해 사용자가 직접 구체적인 로직을 정의 할 수 있도록 만드는것. 

- desgin pattern : 프로그램밍에서 자주 사용되어 통용되는 설계나 기법, 방법

## 참고
[생활코딩](https://opentutorials.org/course/1223/6062)

