# 입/출력 (IO)

이전 시간에 메소드에서 입력(예 : 인자)과 출력(예 : 리턴)외을 알아보았다. 

자바 애플리케이션도 물론 입/출력을 할수 있다. 

```
EX 

- 입력 : 키보드, 마우스, 터치 등
- 출력 : 모니터, 스피커 등
```

## String[] args

지금 껏 미지의 영역이었던 String[] args를 보자.
```
package org.opentutorials.javatutorials.io;

public class InputDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
	}

}
```
이제 우리는 public static void main(String[] args) 를 어느정도 해석 할 수 있다
```
String[] args = 문자열을 담은 배열의 변수 args (파라미터)

main() = main 이라는 이름의 메소드

void = 출력값이 존재 하지 않는다.
 
```
main 메소드는 자바에서 특별한 의미를 가진다. main 메소드에 내용을 구현하고 자바를 실행하면 

자동으로 main메소드가 호출 되는것이다. 이떄 String[] args 값은 매개변수로 작용한다.


만약 프롬프트를 통하여
```
java InputDemo 1 2 3 4 5 6;
```
이라는 값을 InputDemo 뒤에 쓰고 실행하면 출력값은 6이 나온다.

```
package org.opentutorials.javatutorials.io;

public class InputForeach {

	public static void main(String[] args) {
		for (String a : args) {
			System.out.println(a);
		}

	}

}
```
위 구문은 foreach를 사용해서 args값을 하나씩 출력할수 있도록 해준다. 즉 자바는 

main 메소드 통해서 입력한 값을 전달해준다.


## 앱이 실행중에 사용자의 입력을 받기

앱이 실행중 사용자 입력을 받게하는 몇가지의 방법 중 자바에서 기본으로 제공하는 라이브러리

 중 scanner를 사용하는 방법을 알아보자.
```
package org.opentutorials.javatutorials.io;

import java.util.Scanner ;

public class ScannerDemo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
```
라이브러리에 대해 아직 배운 단계가 아님으로 우리가 위 예제에서 주목해야 할 것은

 Scanner sc = new Scanner(System.in);이하의 것인다.

 (System.in);부터 차례로 보자 (System.in) 를 현재로서 사용자가 입력한 값이라고 생각하자

 그 다음 Scanner 란 객체를 

 new 새로 만들때 

 Scanner을 통해 사용자가 입력한 값을 알아내는 객체가 되는것이고 

 그것을 SC 라는 변수로 담아준다.

 그다음 int i = sc.nextInt(); 이다 

sc 라는 변수는 nextInt(); 가 실행이 된다면 콘솔이 정지 되고 입력을 기다린다.

그 정지된 콘솔에 입력할수 있는 값은 next 뒤에오는 문자형태이고 int를 입력한후 엔터키를 누르면

좌변의 int i 부터 실행되어 콘솔에 쓰여진 숫자가 i에 담기고 실행되어 출력한다.

하지만 위의 코드는 실행버튼을 지속적으로 눌러야하기 때문에 실시간으로 사용자와 

피드백을 주고 받을수 없다.

```
package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (sc. hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc .close();
	}
	
}
```
위 예제를 보면 다른게 몇가지 있다

우선 while (sc. hasNextInt()) 이 부분을 보자

While은 true일때 반복하는 것이다. 그 안에 있는 것이 중요한데 sc. hasNextInt() 이다.

sc는 Scanner변수 값이고 . hasNextInt()란 것은 Scanner 객체가 가진 메소드를 호출이다.

우선  . hasNextInt() 란 메소드가 실행되면 전 예제와 같이 정지시키고 엔터를 누르면 시작한다.

그때 콘솔 입력값이 int라면 true가 되고 그 외의 값이라면 False가 되어 정지 된다.

만약 true라면 대기하고 있던 System.out.println(sc.nextInt()*1000); 가 실행되는데

sc.nextInt 값은 sc 곧 (System.in); 입력값이다.


Scanner는 파일 내용을 읽을수도 있는데.
```
package org.opentutorials.javatutorials.io;


import java.util.Scanner;
import java.io.*;

public final class Scanner3Demo {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

```  

이런식으로 파일을 저장해 놓고 그 파일 내용을 가져올수도 있다.

 File file = new File("out.txt"); 이 코드는 new File이란 객체는

 out.txt 라는 파일을 가지고 File 변수 file에 담아 준다. 

 Scanner sc = new Scanner(file); 그리고 Scanner 변수 sc에 

 new Scanner() ()안쪽에 (System.in)하면 사용자가 키보드 등을 통해 입력한 값

 (file)을 넣어주면 위에 만들었던 변수 file을 입력값으로 가져와라.

 while (sc.hasNextInt()) {
	System.out.println(sc.nextInt()*1000);
 }

그리고 sc 변수에 정수가 들어오면 ture이기 때문에 sc.nextInt의 값과 1000을 곱하여라

그리고 try와 catch는 예외라고 하는 것이다.

 catch(FileNotFoundException e) 

위 코드는 만약 out.txt를 찾을수 없다면

e.printStackTrace();

에러를 화면에 출력해라 이다.

그러나 아직 객체지향을 배우지 않았기 때문에 나중에 배우게 된다.

## GUI(Graphic User Interface)

텍스트 적이고 언어적인 입력 CLT(command Line Interface)과 반대가 GUI이다.

시각적으로 버튼, 창 과 같이 그래픽적인 입력이다.

하지만 지금은 JAVA언어 를 배우기 때문에 GUI를 배울 필요가 없다.

## 참조
[생활코딩](https://opentutorials.org/course/1223/5575)












