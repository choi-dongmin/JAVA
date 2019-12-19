# 접근 제어자

## 접근과 제어자  

```
 class A {

 	public Stirng y(){                 			// 1번
 		return "public void y()";
 	}
 	private String z(){					// 2번
 		return "public void z();"
 	}
 	public String x(){					// 3번
 		return z();
 	}
 }

 public class AccessDemo1{

 	public static void main(String[] args){

 	A a = new A();
 	System.out.println(a.y());

 	//System.out.println(a.z());
 	// 위 코드는 오류
 	
 	System.out.println(a.x());
 	
 	}
 }
 ```

 위 코드를 보자 우리가 주목해야 할 것은 바로 public 과 private 이다. 말 그대로 public method는

 자신 외의 클래스에서(여기선 호출) 호출 또는 사용 하더라도 문제를 일으키지 않는다. 반대로 private은

 다른 클래스에서 사용하려고 한다면 오류가 발생한다 private 은 자신의 클래스 내에서만 사용이 가능하다. 

 차근차근 보면 main method에서 A클래스를 인스턴스화 시켜 a로 만들고 먼저 1번을 호출하고 있다 1번은 

 public 이기 때문에 다른 클래스에서 호출 하더라도 영향을 받지 않는다. 

 2번은 private이기 때문에 main method에서 호출하더라도 실행 되지 않는다 왜냐면 같은 클래스 내에서 만

 사용이 가능하기 때문에다.

 3번을 보자 3번은 public 이지만 return 값으로 2번(private)을 나타낸다 이럴경우 main method에서 

 호출을 하더라도 문제가 되지 않는다, 왜냐면 3번과 2번은 같은 클래스 내에 존재해 2번이 private이라도 

 3번이 public 이기 때문에 우회에서 호출을 할수가 있다. 이 public, private 같은것을 접근제어자라고

 한다.

 ## 접근제어자의 사용 이유

이 경우를 은행을 예제로 들어본다면 main 메소드가 고객이라고 생각해 보자 그리고 클래스는 은행직원이다

은행에는 은행건물, 창구, ATM 등 고객이 접근 가능한 곳이 있지만 금고 같이 중요한 곳은 일반인의 접근이

불가하다 고객이 은행을 이용하려 창구, ATM 등은 이용할수 있지만 직접 금고로 들어가지 못하는 것과 같은

것이다

아래 예제를 보면
```
class Calculator {
	private L,R;

	public void setOprands (int L, int R){
		this.L = L; this.R = R;
	}

	private int sum(){
		return this.L+this.R;
	}

	public void sumDecoPlus(){
		System.out.println("+++"+sum()+"+++");
	}

	public void sumDecoMinus(){
		System.out.println("---"+sum()+"---");
	}
}

public class CalculatorDemo {
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();


		}
	}
}
```
위 코드는 c1으로 인스턴스화 시키면서 calculator class를 가져오고 있다 전역변수로 10,20 을 주었고

계산하는 method sum은 private 으로 주었다 만약 위의 코드처럼 결과값과 함께 어떤 장식되어 있는 어떤 

것을 함께 제공해야 하는 경우 이렇게 계산 로직은 private으로 줄수 있다 또 전역 변수에 private을 

주었는데 이는 만약 private이 없다면 호출 메소드에서 c1.left = 100; 변경한다면 바뀔수 있다 그러나 

변수를 바꾼다는것은 오류를 발생 시킬수 있기 떄문에 private으로 지정해 준다면 다른 클래스에서 바꿀수 

없다. 이렇게 되면 사용자는 private에는 신경을 쓰지 않고 public만 신경쓰게 할수 있 효율적이다.


## 세밀한 제어 

- private : 같은 클래스 내에서만 사용이 가능하다.

- default : 같은 패키지, 같은 클래스, 같은 패키지의 하위클래스에서 사용이 가능하다.

- Protected : 같은 패키지, 같은 클래스, 다른 패키지, 다른 패키지의 하위 클래스에서도 사용이 가능하다(단,
	상속을 하고 있 경우에만) . 
	
- public : 언제나 어디서나 무엇이든 어떻게 사용하더라도 오류가 발생하지 않는다.


## 클래스의 접근 제어자

맴버뿐만이 아니라 클래스도 접근 제어자를 가지는데 클래스의 접근제어자는 2가지이다.

```
- public : 다른 패키지의 클래스에서 사용이 가능하다.

- default : 같은 패키지 내에서만 가능하다.
```

한가지 중요한 제약사항이 있다 public class 의 이름과 소스코드의 파일 이름(이클립스의 class 파일이름)

같아야 한다는 것이다. 즉, 그말은 하나의 소스코드 안에는 하나의 public class 만이 있어야 한다는 

소리이다. 

```
package org.opentutorials.javatutorials.accessmodifier.inner;

public class ClassAccessModifierInnerPackage {

    PublicClass publicClass = new PublicClass();

    DefaultClass defaultClass = new DefaultClass();
}
```
위의 예제는 같은 패키지 안에서 두가지의 클래스 접근제어자가 작동한다는것을 알수 있다.


```
package org.opentutorials.javatutorials.accessmodifier.outter;

import org.opentutorials.javatutorials.accessmodifier.inner.*;

public class ClassAccessModifierOuterPackage {
  
    PublicClass publicClass = new PublicClass();
  
    //DefaultClass defaultClass = new DefaultClass();
}
```
이 예제는 다른 패키지의 클래스에서 다른 패키지를 import해서 사용할 경우 default를 사용 할수 없다는걸 

알수있다.

## 키워드
public, pravate, default,protected

## 참고

[생활코딩](https://opentutorials.org/course/1223/6061)






