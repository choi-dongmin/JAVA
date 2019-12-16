# final	

만약 abstract 가 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제이다.

## final 필드

```
package org.opentutorials.javatutorials.finalexam;

class Calculator {
	static final double PI = 3.14;
	int L,R;

	public void setOprands (int L, int R){
		this.L =L; this.R=R;
		// calculator.PI =10; 오류 발생
	}

	public void sum(){
		System.out.println(this.L+this.R);
	}

	public void avg(){
		System.out.println((this.L+this.R)/2);
	}
}

public class FinalExam1{

	public static void main(String[] args){

		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		// Calculator.Pi = 10; 오류발생
	}
}


```

우리가 주목해야 할 곳은 final이 있는 부분이다 PI = 3.14 라고 파이를 정의 시키고 있다 코드를 보면

ststic final double PI = 3.14; 인데 전연 변수로 선언하고 어디서 PI라는 값을 수정할 수 없도록

하고있다 static 이 전역에서 사용할수 있도록 해주는 것이고 그다음에 오는 final이 바로 수정을 불가하게

하는 로직인 것이다. 그래서 주석부분을 보면 같은 클래스의 메소드 혹은 다른 클래스에서 PI를 수정하려고 하지만

PI 의 final로 인하여 오류가 발생한다. 지정한 값을 변경하지 못하도록 하는것, 이것이 필드에서의 final이다  


## fianl 메소드

final 메소드는 final 변수만큼 사용빈도가 높지 않다. 아래코드는 final 메소드 b를 상속하려하기 때문에

오류가 발생한다. final을 붙인 method는 상속을(overriding) 받을수 없다.

```
class A{
	final void b(){}
}
class B extends A{
	void b(){}
}
```


## final 클래스

마찬가지로 class에 final을 붙인다면 상속을 할수 없게 된다.

```

final class a {
	final b(){}
}

class C extends a{}
```

오류가 발생한다.

## 키워드

final

## 참고
[생활코딩](https://opentutorials.org/course/1223/6145)



