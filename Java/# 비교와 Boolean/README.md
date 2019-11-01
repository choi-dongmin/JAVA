# 비교와 Boolean

## Boolean

Boolean은 참과 거짓을 의미하는 데이터 타입으로 숫자 혹은 문자와 같이 하나의 데이터 타입인데, 참을 의미하는 true와 거짓을 의미하는 false 두 가지의 값을 가지고 있다. 아래는 비교 연산자들에 대한 설명이다.

## 비교 연산자(관계 연산자)

프로그래밍에서 비교란 주어진 값들이 같은지, 다른지를 구분하는 것을 의미한다. 이때 비교 연산자를 사용하는데 비교 연산자의 결과는 true나 false 중의 하나다. true는 비교 결과가 참이라는 의미이고, false는 거짓이라는 뜻이다. 

- ==

좌항과 우항의 값을 비교해서 True와 False로 나타낸다. (이때 == 인것을 주의하자 하나의 = 는 대입 연산자로서 우항의 값을 좌항의 변수에 대입할 때 사용하는 것이다.) 

```
package org.opentutorials.javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {
		System.out.println(1 == 2); //false
		System.out.println(1 == 1); //true 
		System.out.println("one"=="two"); // false
		System.out.println("one"=="one"); //true 
		
	}

}
```

- !=

'!'는 부정을 의미한다. "같다"의 부정은 "같지않다" 임으로 == 과는 반대로 결과값이 출력된다.
```
package org.opentutorials.javatutorials.compare;

public class NotDemo {

	public static void main(String[] args) {
		System.out.println(1!=2); // true
		System.out.println(1!=1); // false
		System.out.println("one"!="two"); // true
		System.out.println("one"!="one"); // false
		

}
}
```

- >

좌항의 값이 우항보다 크면 True 아니면 False이다. (반대의 의미로 > 도 사용된다.)
```
package org.opentutorials.javatutorials.compare;

public class GreaterThanDemo {

	public static void main(String[] args) {
		System.out.println(1 > 2); // false
		System.out.println(2 > 1); //true 
		System.out.println(1 > 1); // false
			

	}

}
```

- >= 

좌항의 값이 우항보다 크거나 같다라는 의미를 가진다 (반대의 의미로 <= 도 사용된다.)
```
package org.opentutorials.javatutorials.compare;

public class GreatThanOrEqualDemo {

	public static void main(String[] args) {
		System.out.println(1 >= 2); // false
		System.out.println(2 >= 1); //true 
		System.out.println(1 >= 1); // true

	}

}
```

- .equals

.equals는 문자열을 비교할 때 사용하는 메소드다. 우리는 아직 메소드를 배우지 않았기 때문에 지금은 그냥 이것을 연산자로 이해해도 무방하다. (string을 비교할때는 == 가아닌 .equals를 사용한다)
```
package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a ="Hello world";
		String b = new String("Hello world");
		
		System.out.println(a == b); //false
		System.out.println(a.contentEquals(b)); //true

	}

}
```

## 참조
[생활코딩](https://opentutorials.org/course/1223/5332)
