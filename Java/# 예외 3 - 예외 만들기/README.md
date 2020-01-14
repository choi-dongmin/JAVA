# 예외 3 - 예외 만들기

## 소비자에서 생산자로

이제는 API 생산자의 입장으로 API 소비자에게 전달을 해보자. 

```
class Calculator {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide(){
		try{
			System.out.println("계산 결과는 ");
			System.out.println(this.L/this.R);
			System.out.println("입니다.");
			}
		catch(Exception e){
			System.out.println("\n\ne.getmessage()\n"+e.getmessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}	
	}
}

public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		c1.divide();
	}
}
```
위 예제의 결과는 
``` 
e.getmessage()
/ by zero


e.toString()
java.lang.ArithmeticException: / by zero


e.printStackTrace()
java.lang.ArithmeticException: / by zero
	at Java_tutorials/org.opentutorials.javatutorials.exception3.Calculator.divide(CalculatorDemo.java:11)
	at Java_tutorials/org.opentutorials.javatutorials.exception3.CalculatorDemo.main(CalculatorDemo.java:31)
```
위와같이 나온다.

왜냐하면 10을 0으로 나눌때 불가능하니 결과 값에서 0이 결과로 나오고 있어서 자바에서 오류로 간주하고 있다.

만약 이 예외를 던지고 싶다면 2가지 선택 방법이 있다.

1. setOprands 값이 0일때 나오는 illegalArgumentException

2. 계산하는 곳에서 나오는 ArithmeticException.



1번째 방법은
```
int L, R;
	public void setOprands(int L, int R){
		if(R == 0){
			throw new  IllegalArgumentException("두번째 인자값으로 0을 줄 수 없습니다.");
		}
		this.L=L; this.R=R;
	}
```

2번째 방법도 마찬가지로 조건문을 넣는데.

```
	public void divide(){
		if(R==0){
			throw new ArithmeticException("0 으로는 나누기가 불가능 합니다.");
		}
		try{
			System.out.println("계산 결과는 ");
			System.out.println(this.L/this.R);
			System.out.println("입니다.");
			}
		catch(Exception e){
			System.out.println("\n\ne.getmessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}	
	}
```

처럼 할수도 있다.

여기서 중요한건 바로 throw new ArithmaticException("0으로는 나누기가 불가능 합니다."); 인데

우리는 이 예외의 생성자(()다음에 오는 내용)로 그 문제의 이유를 입력하게 되면 결과값으로 나오게 된다

만약 우리가 이 상태에서 c1.divide 에 try/catch를 한다고 하면..

```
public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		  }
	}
}
```
이 상태로 결과를 보면 프린트된 값에 아까 입력했던 "0 으로는 나누기가 불가능 합니다." 가 출력된다.

완성된 코드
```
package org.opentutorials.javatutorials.exception3;

class Calculator {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide(){
		if(R == 0){
			throw new ArithmeticException("0 으로는 나누기가 불가능 합니다.");
		}
		try{
			System.out.println("계산 결과는 ");
			System.out.println(this.L/this.R);
			System.out.println("입니다.");
			}
		catch(Exception e){
			System.out.println("\n\ne.getmessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}	
	}
}


public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		  }
	}
}
```
완성된 코드의 흐름을 보면 divide 가 실행될때 절차지향으로 Throw를 먼저 생각한다 그 안의 Exception이

예상된 값(if) 와 같다면 그곳에서 메소드 divide 를 멈추고 divide 를 사용하는 곳으로 Throw 한다

그곳은 main의 c1.divide 이고 거기엔 try가 있다 그래서 catch와 타입(ArithmeticException)이

일치하는 곳에서 변수(e)에 ArithmeticException 생성자가 들어가게 되고 

System.out.println(e.getMessage()); 를 통해 0 으로는 나누기가 불가능 합니다. 가 나오게 된다.


## 여러 예외들

			예외						사용해야 할 상황
IllegalArgumentException  :	매개변수가 의도하지 않은 상황을 유발시킬 때

IllegalStateException	  :	메소드를 호출하기 위한 상태가 아닐 때

NullPointerException	  :	매개 변수 값이 null 일 때

IndexOutOfBoundsException :	인덱스 매개 변수 값이 범위를 벗어날 때

ArithmeticException		  : 산술적인  연산에 오류가 있을 때


## 여러 예외들 

```
class E{
	void throwArithmeticException(){
		throw new ArithmeticException();
	}
	void throwIOException(){
		throw new  IOException();
	}
}
```
를 보면 밑에 throw new IOException(); 이 부분에서 오류가 생기고 있다.(Unhandled Exception)

이상한것이있다 왜 throw new ArithmeticException(); 과 throw new IOException(); 은

다르게 왜 throw new IOException(); 에서만 오류가 발생할까? 그것은 일단 궁금증으로 가지고 있자.

우선 throw new IOException(); 의 오류를 해결해 보면 2가지 방법이 있다.

```
	void throwIOException1(){
		try{
			throw new  IOException();
		} catch(IOException e) {
			e.printStackTrace();
		  }
	}
// 1번 우리가 흔히 아는 Try/Catch

	void throwIOException2() throws IOException{
		throw new  IOException();
	}

// 2은 Throws를 통해 API 사용자에게 Throw 하는것이다.

```

## Thorwalbe

모든 클래스에 Throw 가 가능한것은 아니다 바로 Throwable 이라는 클래스에 포함되어진 맴버들에게만

throw가 가능한 것이다.

예를 들면 java.lang.ArithmeticException 부모 클래스중에는 java.lang.Exception 이 있고 

그 부모 클래스는 java.lang.Thorwalbe 이 있는 것이다.

우리가 배운 개념과 그 관계를 정리하면


(조상)        Error (자바 버츄얼 머신에 발생한 예외 : 하드웨더 등)
Throwalbe <-				IOException
			  Exception <- 
			  				RuntimeException <- ArithmeticException 


여기서 중요한 것은 ArithmeticException, IOException 둘 다  Exception 의 자식이지만

ArithmeticException 은 "RuntimeException" 이란 직부모클래스가 있다.

* 이 둘이 어떠한 차이를 보이냐면 부모중에 "RuntimeException" 이 있으면 "unchacked", 없으면 chacked Exception 이라고 한다

1. chacked Exception 은 반듯이 Try/catch or Throws 를 통해 예외를 처리해야함

2. unchacked Exception 은 사용하지 않아도 된다.

다시 이전 예제로 돌아가 보자
```
class E{
	void throwArithmeticException(){
		throw new ArithmeticException();
	}
	void throwIOException(){
		throw new  IOException();
	}
}
```

위의 ArithmeticException 은 unchacked Exception 이기 떄문에 컴파일 하는것에 문제가 없지만

throwIOException 같은 경우에는 try/catch 혹은 throws 를 하지 않는 이상 컴파일조차 되지 않는 문제가 발생한다.



## 나만의 예외 만들기

자바에는 여러가지 Exception 들이있다(약 100여가지) 그것이 표준예외 라고 한다 그리고 우리는 이것을 이용하는

것이 바람직 하다, 왜냐하면 그것이 많은 이들이 그것으로 쓰고 있기 떄문이다 하지만 항상 표준클래스에 맞는 예외만

있는것이 아님으로 예외 클래스로 만들어 보자.

먼저 내가 만들고자 하는 클래스가 chacked 인지 unchacked 인지 정해야 한다.

```
chacked 를 쓸 떄는 예외가 발생할때 API 사용자가 그 상황을 개선할수 있는 경우에 사용한다.

unchacked 를 쓸 떄는 예외가 발생할때 API 사용자가 그 상황을 개선하지 못하거나 혹은 그냥 종료하는게

	더 나은 판단일때 사용한다.
```

그럼 우리가 했었다 Calculator 로 한번 알아보자.

```
class DivideException extends RuntimeException{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}
// 기본생성자 말고 다른 생성자를 말들어 주고 싶으면 직접 생성자를 만들어 주어야 한다.

class Calculator {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide(){
		if(R==0){
			throw new DivideException ("0 으로는 나누기가 불가능 합니다.");
		}
			System.out.println(this.L/this.R);
	}
		
		
}


public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		  }
	}
}
```

위의 예제는 class DivideException extends RuntimeException 하고 있음으로 예외가 발생하면

throw new DivideException ("0 으로는 나누기가 불가능 합니다."); 로 해주면 checkedException

이 된다.()

만약 위 예제를 chacked 로 바꾸고 싶다면 extends Exception 으로 바꾸어 주고 divide 메소드를

try/catch 혹은 Throws 를 적용해주면 가능하다.

* try / catch

```
class DivideException extends Exception{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}
// 기본생성자 말고 다른 생성자를 말들어 주고 싶으면 직접 생성자를 만들어 주어야 한다.

class Calculator {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide(){
		try{
			if(R==0){
				throw new DivideException ("0 으로는 나누기가 불가능 합니다.");
			}
				System.out.println(this.L/this.R);
		}catch(DivideException e){
			e.printStackTrace();
		}
	}	
		
}


public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		  }
	}
}
```

* throws
```
class DivideException extends Exception{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}
// 기본생성자 말고 다른 생성자를 말들어 주고 싶으면 직접 생성자를 만들어 주어야 한다.

class Calculator {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide() throws DivideException{
		if(R==0){
			throw new DivideException ("0 으로는 나누기가 불가능 합니다.");
		}
		System.out.println(this.L/this.R);
	}	
		
}


public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		try{
			c1.divide();
		} catch(DivideException e) {
			System.out.println(e.getMessage());
		  }
	}
}
```


## 키워드

throw : 다음 사용자에게 예외를 하도록 강제시키는 것.

Try/Catch : 예외가 발생 예상되는 코드에 적용하여 예외 발생시 작성된 코드를 실행시키는것. 

chacked Exception : RuntimeException 의 하위클래스가 아닌 클래스로 Try/catch or Throws 를 통해 예외를 처리해야함 (체크를 해주어야 함.)

unchacked Exception : RuntimeException 의 하위클래스로 예외를 할때 Try/catch or Throws
를 사용하지 않아도 됨 ("언" 체크 해도 됨.)

## 참고
[생활코딩](https://opentutorials.org/course/1223/6228)







