# 클래스 맴버와 인스턴스 맴버

## 맴버(Member)

맴버는 영어로 구성원이라는 뜻이다.

```
Member : 구성원 

예) 객체의 구성원 : 변수, 메소드
``` 

객체를 만들기 위해선 우선 클래스를 정의하고 클래스에 대한 인스턴스를 만든다. 

```
class calculator {
			int L, R;

			public void setoprands(int L, int R){
				this.L = L;
				this.R = R;
			}
			public void sum(){
				System.out.println(this.L+this.R);
			}
			public void avg(){
				System.out.println((this.L+this.R)/2);	
			}
		
			public static class ClaculatorDemo3{
	
				public static void main(String[] args) {
					calculator c1 = new calculator();
					c1.setoprands(10,40);
					c1.sum();
					c1.avg();
				
				
					calculator c2 = new calculator();
					c2.setoprands(50,50);
					c2.sum();
					c2.avg();
				}
			}
```
위 예제의 L,R 는 "인스턴스의 변수로 지정된다." 그말은 곧 L,R은 인스턴스의 맴버이다.

인스턴스를 만들어야 사용할 수 있고, 각각 인스턴스 마다 서로 다른 값을 가지고 있기 때문이다.

그럼 인스턴스 말고 클래스도 맴버를 가질수 있을까? 답은 그렇다.

```
Class - 변수 - 메소드

Instance - 변수 - 메소드
```


## 클래스 변수

- instance의 맴버 변수는 인스턴스 마다 값이 다르다 그렇기 때문에 인스턴스의 소유이다.

- class의 맴버 변수는 모든 인스턴스에게 같은 값을 가지며  직접 class에 접근해 instance 없이

	 그 값을 사용 가능하다.

```
class claculator {
	static double pi = 3.14;
	int L,R;

	public void setoprands (int L, int R){
		this.L = L;
		this.R = R;
	}

	public void sum(){
		System.out.println(this.L+this.R);
	}

	public void avg(){
		System.out.println((this.L+this.R)/2);
	}
}

public class calculatorDemo4 {
	
	public static void main(String[] args){

		calculator c1 = new calculator();
		System.out.println(c1.pi);


		calculator c2 = new calculator();
		System.out.println(c2.pi);

	System.out.println(calculator.pi);
	}
}
```

위와 같이 class 에서 static 으로 값을 지정해주면 그 값은 class의 맴버가 되어

인스턴스 값의 영향을 받지 않고 System.out.println(calculator.pi)과 같이 인스턴스의

활용없이 바로 사용가능 하다.

```

class claculator {
	static double pi = 3.14;
	int L,R;
	static int base = 0;

	public void setoprands (int L, int R){
		this.L = L;
		this.R = R;
	}

	public void sum(){
		System.out.println(this.L+this.R + base);
	}

	public void avg(){
		System.out.println((this.L+this.R)/2);
	}
}

public class calculatorDemo5 {
	
	public static void main(String[] args){
		calculator base = 10;

		calculator c1 = new calculator();
		c1.setoprands(10,20);
		c1.sum();

		calculator c2 = new calculator();
		c2.setoprands(20,40);
		c2.sum();

	}
}

```

위에는 static int base = 0으로 class 변수를 지정하고 sum메소드에 + base 를 추가시키고 

호출코드에서 calculator base = 10; 이라고 class base 변수의 값을 주었다.

그 결과 후에 나오는 모든 인스턴스의 sum의 결과값에 10을 더 할수 있게 되었다.  



이처럼 변수를 class의 맴버로 지정할땐 static 을 앞에붙여 class의 맴버임을 선언시킨다.

class 변수의 용도
- 인스턴스의 따라서 값이 변하지 않는 경우.
- 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우.
- 값의 변경사항을 모든 인스턴스가 공유해야 하는 경우. 

## 클래스 메소드

```
package org.opentutorials.javatutorials.classinstance;

class calculator3 {
	
	public static void sum(int L, int R) {
		System.out.println(L +  R);
	}	
	// int L,R이 바로 매개변수로 들어간다.	
	
	public static void avg (int L, int R) {
		System.out.println((L+R)/2);
	}
}

public class CalculatorDemo3 {

	public static void main (String[] args) {
		calculator3.sum(10,10);
		calculator3.avg(10,20);
	}
}

```

메소드 또한 static 을 붙여주게 되면 클래스 맴버가 된다 하지만 인스턴스와 다르게 

바로 메소드에 매개변수를 주어야 하고 호출에서도 바로 직접 접근해서 인자값을 주어야한다

이 클래스 메소드는 다른 메소드들과 다르게 개인적인 다른상태를 가져야 할때이다


## 클래스 메소드와 인스턴스 메소드의 차이점
 t
 우선 두 메소드 간에는 규칙이 있다.

 1. 인스턴스 메소드는 클래스 맴버에 접근할 수 '있다'.
 2. 클래스 메소드는 인스턴스 맴버에 접근할 수 '없다'. 


```

class c1{
	static int sv = 1;
	int iv = 2;

	static void static_static(){
		System.out.println(sv);
	}	
	static void static_instance(){
		// System.out.println(iv); 불가능
	} 
	void instance_static(){
		System.out.println(sv);
	}		
	void instance_instance(){
		System.out.println(iv);
	}
}
	
public class classmemberdemo {
	
	public static void main(String[] args) {
		c1 c = new c1();
		c.static_static();
		c.static_instance();
		c.instance_static();
		c.instance_instance();
		c1.static_static();
		c1.static_instance();
		c1.instance_static();
		c1.instance_instance();
	}	
}

```
용어

- 인스턴스 변수 : non-stiatic field
- 클래스 변수 : stiatic field

## 참고

[생활코딩](https://opentutorials.org/course/1223/5440)
