# 메소드

지금부터 배우는 메소드나 객체지향은 크고 복잡하고 결함이 적은 애플리케이션을 만들기 위한 기법이다.

## 메소드의 형식
```
public static void main(string[] args){
	return
}
```
위에 익숙한 코드를 보자. 우리는 지금까지 return 부분을 위주로 공부를 해왔다면 드디어 위 코드중 public static void main(string[] args) 부분을 공부 할 것이다.

## 메소드의 정의(define)와 호출(call)
```
package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	public static void numbering() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering();
	}

}
```
위 예문을 보면
```
	public static void numbering() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
```
1번째
```
	public static void main(String[] args) {
		numbering();
	}
```
2번째. 2번째 코드가 1번째의 코드를 불러오고 있다

이것을 더 정확히 말하면 1번째 코드에서 numbering을 정의하였고 2번째 코드에서 그것을 호출 한것이다.

## main

main은 메소드 규칙이다. 프로그램을 만들려면 public static void main(String[] args) 라는 코드로 반듯이 호출해주어야 한다. 한마디로 우리는 main을 작성하고 자바는 main은 실행한다.

## 만약 method가 없다면

define을 해놓았으면 여러번의 반복작업을 줄일수 있고 혹은 코드의 양 자체를 줄일수도 있으며 그러므로 유지보수를 하기가 훨씬 쉬워진다.

## method의 입력과 출력

메소드의 첫 핵심 가치는 바로 자주사용하는 로직을 만들어 간편히 재활용 할수있다는 것이다. 그러리고 두번째는 바로 입력과 출력이다.

## 매개변수와 인자(입력값)
```
package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static void numbering(int limit) {
		for (int i = 0; i<limit; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		numbering(5);
	}
}
```
위 예제를 보면 define numbering 에 ()안에 int limit이 있고 call numbering(5)가 있다 이 둘을 합쳐보면 기능적으로 int limit = 5 변수값을 지정한 것과 같은 것이다. 그럼으로 int limit = 5 가 됨으로 i<5 가 된다. 물론 변수값을 다르게하면 달라진다. 여기서 int limit 을 매개변수 : parameter  (5) 를 인자 : argument 이라고 한다.

### 복수의 인자
만약 여러개의 입력값을 전달하고 싶다면 어떻할까? 만약 5 부터 10 전의 numbering을 출력하고 싶다면?
```
package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

		public static void numbering(int limit, int init) {
			for (int i = init; i<limit; i++) {
				System.out.println(i);
			}
		}
		public static void main(String[] args) {
			numbering(10,5);
	}
}
```  
그럴땐 매개변수를 하나더 입력한후(int init) ,를한다 또 적합한 코드에 넣어준다 여기선 5<10 까지 임으로 int = init로 하고  init < limit 을 반복회수를 지정하고 인자 또한 매개변수와 일치하게 ,를 넣어주면 결국 5< 10 이 된다.

## return(출력)
```
public static String numbering(int limit, int init) {
		int i = init;
		String output = ""; 
		while (i < limit) {
			output = output + i;
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(5,1);
		System.out.println(result);
	}
}
```
위 예제는 문자열 메소드 Numbering 에 int limit 과 int init 2가지의 매개변수가 있다. int i = init이고 변수 String output = "";(리턴값을 담기위한 공백) 이며 i(int init)이 limit(int limit) 보다 작을때 반복하게된다 output + i = output 이고 i는 1씩 증가하는 반복재생을 한다.

 그리고 return output을 받게되는데 그것은 메소드 뒤에 오는 변수 결과값을 메소드의 정의로 출력하고 끝내버린다. 

 그리고 출력 코딩을 보면 void라고 써져 있는데 저것은 모든 return값을 없는 것으로 간주하고
 출력하기 때문에 numbering 메소드를 바로 출력하면 나오지 않고 String result = numbering(5,1); 로 문자열 변수를 주고 그것을 결과값으로 도출합니다.

그럼으로 인수를 대입해 limit = 5 init = 1 로써 결과를 도출하게 됩니다.

그러나 왜 굳이 return 을 써야하나?

우리는 출력뿐 아니라 파일저장, 메일보내기 등등의 일들을 처리하게 되는데 (출력 코딩 예 : System.out.println(i);) 그럴때 마다 새로운 메소드를 만드는것이 아닌 출력코드를 메소드 밖으로 꺼내고 그 밖에서 출력되는 코드의 값을 return으로 메소드의 값을 정해준다. 그것이 위의 예제이다.

뿐만 아니라 return은 위에서 말했듯 메소드를 중단시키는 역할도 같이한다.
```
package org.opentutorials.javatutorials.method;
 
public class ReturnDemo {
    public static int one() {
        return 1;
        return 2;
        return 3;
    }
 
    public static void main(String[] args) {
        System.out.println(one());
    }
}
```
위의 예제는 컴파일 되지 않는다. return이 나온 이후의 구문은 실행이 안된다. 그럴땐 다른문구와 함께써서(if) 중복적으로 실행될 가능성이 없게 주어야 한다.
```
package org.opentutorials.javatutorials.method;

public class ReturnDemo {

	public static String num(int a) {
		if (a == 0) {
			return "0";
		} else if (a == 1) {
			return "1";
		} else if (a == 2) {
			return "2";
		}
		return "none";
	}
	
	public static void main(String[] args) {
		System.out.println(num(1));
	}

}
```
 만약 return "none"을 뺀다면 실행이 되지 않는다.


 ## 복수의 리턴

 메소드는 여러 입력값을 가질수 있다 그러나 자바는 여러개 입력값을의 출력하는 기능을 제공하지 않는다. 각각 하나하나의 메소드를 부여 할 수 있지만 그럴땐 하나의 변수에 여러 값을 담아서 사용하는 배열로 출력 할 수 있다.

 ```
 package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
	
	public static String [] strangerthing () {
		String [] members = {"엘", "더스틴", "윌리엄"};
		return members;
		
	}
	
	public static void main(String[] args) {
		String [] members = strangerthing();
		System.out.println(members[0]+" "+ members[1]+ " " + members[2]);
	}

}
```
