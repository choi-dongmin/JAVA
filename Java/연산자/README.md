# 연산자

특정한 작업을 하기 위해서 사용하는 기호를 의미한다. 작업의 종류에 따라서 대입 연산자, 산술 연산자, 비교 연산자, 논리 연산자 등이 있다. 이번엔 가장 기본적인 연산자에 대해서 알아보았다.

## 산술 연산자

산술 연산자는 수학적인 계산에 사용되는 연산자이다 다만 수학에서 사용되는 연산자와 프로그래밍적 연산자는 기호의 모양이 조금 다르다. 산술 연산자의 기호는 +,-,*,/,% 가 있다.

- +,- 더하기와 빼기의 기호 모양은 수학과 같다.
- *,/ 이 기호는 수학에서 곱하기와 나누기와 같다.
- % 기호는 값을 나누고 난 나머지의 값을 나타낸다.
```
package org.opentutorials.javatutorials.Operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		int result = 1+2; //result 값은 1+2 = 3 
		result = result-1; // result 값은 3-1 = 2
		result = result*2; // result 값은 2x2 = 4
		result = result/2; // result 값은 4/2 = 2 
		result = result+8; // result 값은 2+8 = 10
		result = result%7; // result 값은 10%7 = 3
	}

}
```

산술 연산자 중 가장 접하지 못한 % 대해서 알아보면
```
package org.opentutorials.javatutorials.Operator;

public class RemainerDemo {

	public static void main(String[] args) {
		int a = 3;
	     System.out.println(0%a); //0
	     System.out.println(1%a); //1
	     System.out.println(2%a); //2
	     System.out.println(3%a); //0
	     System.out.println(4%a); //1
	     System.out.println(5%a); //2
	     System.out.println(6%a); //0
	
	}

}
```

위 코드를 설명하면 변수 a는 3이고 그것을 각각의 숫자와 나누었을 떄를 뜻한다.
0을 3으로 나누면 답은 0이고 나머지 또한 없다
1을 3으로 나누면 답은 0이고 나머지는 나누려던 숫자 1이 남아있기 때문에 1이 남는다.
2을 3으로 나누면 답은 0이고 나머지는 나누려던 숫자 2이 남아있기 떄문에 2이 남는다.
3을 3으로 나누면 답은 1이고 나머지는 남아있는 숫자는 0이다. 

또한 + 연산자는 숫자는 물론 문자도 더할수 있다.
```
package org.opentutorials.javatutorials.Operator;

public class ConcatDemo {

	public static void main(String[] args) {
		String friststring = "This is";
		String secondstring = " a concatenated string.";
		String thirdstring = (friststring+secondstring);
		System.out.println(thirdstring);
	}

}
```

결과는 This is a concatenated string 이 된다.



만약 정수와 실수를 계산한다면 어떻게 될까?
```
package org.opentutorials.javatutorials.Operator;

public class DivisonDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0f;
		float d = 3.0f;
		
		System.out.println(a/b);  // int 10/3 = 3
		System.out.println(c/d);  // float 10.0f/3.0f = 3.3
		System.out.println(a/d);  // 10.0/3.0f = 3.3 (int a 의 자동형변환) 
	}

}
```

세번째 결과값이 정수와 실수의 계산인데 이 경우 자바에서 자동형변환이 일어나기 때문에 정수가 실수로 형변환 된다.

## 단항 연산자

단항 연산자는 하나의 항을 중심으로 연산이 이루어지는 연산자 이다. 이때 항은 만약 1+1 이라면 좌항/우항 두개의 항이 존재하는 것이다.

단항 연산자 기호는 +,-,++,-- 가 있다.

- +, -는 단항 연산자에선 양/음수를 표현하는 기호이다. (실제로 양수는 사용할 필요가 없다)
- ++, --는 단항 연산자에선 증/감연산자로서 항의 값을 1씩 증/감시킨다.
```
package org.opentutorials.javatutorials.Operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int a = 3;
		a++;
		System.out.println(a); // 4가 출력된다.
		a++;
		System.out.println(a); // 5가 출력된다.
		System.out.println(++a); // 6이 출력된다.
		System.out.println(a++); /* 6이 출력된다.()안에서의 ++/-- 가 상수보다 뒤에 쓰이면 우선 괄호의 a를 프린트
		그 다음 a를 증감 하라는 뜻이기 떄문에 그 다음 프린트 되는 a */
		System.out.println(a); // 7이 출력된다.
	}

}
```

## 연산의 우선순위

실제로 프로그래밍을 하게 되면 다양한 연산자들을 복합적으로 사용하게 된다. 이럴 때 연산의 선후 관계가 분명하지 않으면 혼란스러울 것이다.[우선순위 표](https://opentutorials.org/course/1223/5331)를 보고 


## 참조
[생활코딩](https://opentutorials.org/course/1223/5331) 




