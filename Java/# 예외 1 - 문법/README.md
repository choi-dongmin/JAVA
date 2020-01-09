# 예외 1 - 문법

## 예외란??

우리가 프로그래밍에서 예외(오류)를 직면하게 된다 시스템이 커지면 커질수록 그 확율은 기하급수적으로 증가하고

그래서 자연스럽게 오류를 잘 처리하기 위한 방법들이 필요하게 된다. 

```
package org.opentutorials.javatutorials.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
    }
} 
public class ExceptionCal1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
```

위 예제를 보자 기존의 Calculator 에서 sum과 avg를 제외하고 나누기를 집어넣었다. 하지만 인자값을 보면

10을 0으로 나누고 있다 그러면 이 다음은 수학적으로 의미가 없기때문에 예외로 간주하고 개발자에게 자바는 

이를 알린다. 자바가 알린 내용을 보면
```
계산결과는 Exception in thread "main" java.lang.ArithmeticException: / by zero
    at org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:10)
    at org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:18)
```

at 중에 마지막이 오류의 시작점이고 가장 위쪽의 at 에 있는 코드가 문제의 근원이 되는 코드이다. 만약 

위의 내용처럼 2번째 코드에서 오류가 발생할 시 메소드내의 뒤에 오는 모든 코드는 무시되고 실행되지 않는다.  

한번 이 오류를 해결해보자.

## try to catch
```
package org.opentutorials.javatutorials.exception;
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
      try{
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
      } catch(Exception e){
      	System.out.print("오류가 발생했습니다."+ e.getMessage());
       }
	} 
}
public class ExceptionCal1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
```

중요한건 이부분인데.


```
   public void divide(){
      try{
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
      } catch(Exception e){
      	System.out.print("오류가 발생했습니다."+ e.getMessage());
       }
	} 
}
``` 

에러가 발생할 것 같은 로직을 try로 감싸주면 try에서 실행하다 오류가 발생하면 catch를 실행한다.

catch는 마치 method 처럼 생겼는데 Exception e 라는 매개변수에 오류를 담는다는 뜻이라고 보자

그 데이터 타입은 Exception인데 이것은 클래스이다 이 클래스 안에는 getMessage();라는 메소드가 있다.

getMessage();는 Exception 메소드들중 하나를 호출하는 코드인데 오류의 원인을 사람이 이해하기 쉬운

형태로 리턴하도록 약속되어 있다.

```
try{
	예외가 예상되는 로직
} catch(예외 클래스의 인스턴스) {
	예외가 발생했을 때 실행되는 로직
}
```

## 뒷수습

예외의 중요한 부분은 후처리이다. 하지만 제대로된 뒷처리는 너무나도 어려운 문제인데 여기서는 자바에서

기본적으로 제공하는 방법을 알아보자.


```
package org.opentutorials.javatutorials.exception;
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
      try{
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
      } catch(Exception e){
      	System.out.print("\n\ne.getMessage"+ e.getMessage());
      	System.out.print("\n\ne.toString()\n"+e.toString());
        System.out.print("\n\ne.printStackTrace()");
        e.printStackTrace();
      
       }
	} 
}
public class ExceptionCal1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
```
이번에도 중요한 부분만 가져오자

```
public void divide(){
      try{
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
      } catch(Exception e){
      	System.out.print("\n\ne.getMessage()\n"+ e.getMessage());
      	System.out.print("\n\ne.toString()\n"+e.toString());
        System.out.print("\n\ne.printStackTrace()");
        e.printStackTrace();
      
       }
	} 
}
```

System.out.print("\n\ne.getMessage()\n"+ e.getMessage());

	e.getMessage() 
  	/ by zero

라는 결과값을 도출하는데 \n은 줄 바꿈이고 "e.getMessage()"를 호출하고 뒤에있는

e.getMessage() 이것이 / by zero 를 나타낸다 위에서 말했든 e.getMessage() 는

개발자가 가장 쉽게 문제를 알수 있도록 해주는 것이다.


System.out.print("\n\ne.toString()\n"+e.toString());

이 분은 e.toString(); 을 한다면 좀 e(오류) 에대한 자세한 정보가 나오게 된다.


e.printStackTrace();

이것은 아주 구체적인 어디에서 오류가 발생했는지에 대한 정보를 알려줄수 있다.

```
e.getMessage(); : 가장 간단한 오류 표현
e.toString(); 	: 조금더 자세한 오류 표현
e.printStackTrace(); : 구체적으로 어디에서 오류가 발생했는지 알려주는 표현.

위에 3가지중 어떤것을 사용할지는 개발자 마음이다.
```

만약 catch 다음에 우리가 어떠한 로직을 작성한다면
```

public void divide(){
      try{
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
      } catch(Exception e){
      	System.out.print("\n\ne.getMessage()\n"+ e.getMessage());
      	System.out.print("\n\ne.toString()\n"+e.toString());
        System.out.print("\n\ne.printStackTrace()");
        e.printStackTrace();
       }
       System.out.print("나는 실행된다.");
	} 
}

```

이런식으로 작성을 하면 catch의 로직이 다 실행 된 후에 뒤에오는 로직을 무시하는것이 아니라 

나는 실행된다가 실행이 된다.

## 다양한 예외들

```

class A{
	private int[] arr = new int[3];
	A(){
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int f, int s){
		System.out.println(arr[f] / arr[s]);
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args){
	A a =new A();
	a.z(10, 1);
	}
}
```

A라는 클래스를 인스턴스화 시키고 있다. class A를 보면 arr라는 [](배열)에 3개의 배열 있다.

메소드 z를 보면 매개변수의 f,s 이 있는데 인자값으로 10,1 을 각각 주고 있고 그것을 (arr[f] / arr[s])

에서 받고있다. 그러나 오류가 발생하는데 이유는 arr 값은 0,1,2까지만 받을수 있지만 z의 arr[f]는 

값은 10 임으로 오류가 발생한다.

그리고 우리는 이걸 "ArrayIndexoutOfBoundsException" 이라고 부른다.

만약 두 인자의 값을 1,0으로 바꾸준다면? 그럼 z 메소드에서 10/0을 해야할것이다 그러면 다시 또 예외가

발생하는데 아까와 같은 문제이다 10을 0으로 나눌수 없기 떄문에 "ArithmeticException"이 발생한다.

그럼 어떻게 문제를 알고 해결할까?

ArithmeticException 를 해결하기 위해 try, catch를 이용하자 (1,0)
```
class A{

	public void z(int f, int s){
		try{
			System.out.println(arr[f] / arr[s]);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	 }
}
```
위와 같이 할수 있다.


 ArrayIndexoutOfBoundsException 오류를 보자 (10,1)
```
class A{

	public void z(int f, int s){
		try{
			System.out.println(arr[f] / arr[s]);
		} catch(Exception e) {
			System.out.println(e.(printStackTrace));
		}
	 }
}
```
만약 .getMessage(); 를 쓴다면 그냥 10 이라고만 나올것이다. 더 자세하게 .printStackTrace();

을 쓴다면 더 자세하게 나온다.

하지만 항상 비슷한 예외가 생긴다면 우리는 catch를 여러개 사용해서 예방할수 있다.

```
 public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        }
        
}
```

이런식으로 ArrayIndexOutOfBoundsException 일땐 그에 맞게 ArithmeticException 일땐

그에 맞게 그리고 다른 상황이 발생한다면 Exception 으로 할수 있게. 마치 else if 처럼 사용한다.

(만약 Exception 이 catch 중 맨 위에 존재한다면 Exception 뒤쪽의 catch들은 무소용이다. 왜냐면

Exception이 가장 포괄적인 것으로 catch가 실행하고 다른 catch는 실행되지 않고 오류가 발생한다.)


##finally

finally는 try와 catch 후에만 올수 있는다. finally는 try에서 예외가 발생해 catch가 실행 하던지

안하던지 무조건 실행한다 한마디로 예외여부와 관계없이 실행되는 로직이다.

그럼 종합해서 지금까지의 예제를 종합한 코드를 보자. 
```
class A{
	private int[] arr = new int[3];
	A(){
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}

	public void z(int first, int second){
	        try {
	            System.out.println(arr[first] / arr[second]);
	        } catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("ArrayIndexOutOfBoundsException");
	        } catch(ArithmeticException e){
	            System.out.println("ArithmeticException");
	        } catch(Exception e){
	            System.out.println("Exception");
	        } finally{
	        	System.out.println("finally");
	        }
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args){
	A a =new A();
	a.z(10,1);
	a.z(1.0);
	a.z(2.1);
	}
}
```
결과값은 다음과 같다.

```
ArrayIndexOutOfBoundsException
finally
ArithmeticException
finally
2
finally
```

## 키워드

예외 : 우리가 흔히 말하는 오류로 개발자가 예상치 못한 코드간의 충돌이나 상황을 말한다.

try : 예외가 예상되는 로직을 검사하는 것으로 만약 오류가 발생한다면 catch를 호출한다. 

catch : 예외가 발생하면 실행되는 메소드와 같은것

finally : 언제나 try catch 후에 오는 것으로 try에서 예외가 되던지 안되던지 무조건 실행시킨다.

Exception : 하나의 클래스로 java.lang에 속해있어 여러가지 오류문제를 표현해준다.

e.getMessage(); : 가장 간단한 오류 표현

e.toString(); 	: 조금 더 자세한 오류 표현

e.printStackTrace(); : 구체적으로 어디에서 오류가 발생했는지 알려주는 표현.

ArrayIndexoutOfBoundsException : 배열의 값이 배열의 최대값에서 벗어난 예외

ArithmeticException : 계산값이 수학적으로 효용이 없다고 생각할때.

## 참고 

[생활코딩](https://opentutorials.org/course/1223/6226)
