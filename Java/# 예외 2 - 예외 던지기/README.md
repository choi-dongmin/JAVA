# 예외 2 - 예외 던지기

예외란 마치 폭탄과 같은것이다 이 폭탄을 다른사람에게 던질수도 있고 자신이 해결할 수도 있다

## 예외의 강제

```
package org.opentutorials.javatutorials.exception2;

import java.io.*;
public class CheckedExceptionDemo{
	public static void main(String[] args){
		BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
		String input = bReader.readLine();
		System.out.println(input);
	}
}
```

위 코드는 new FileReader 의 인자값으로 out.txt 파일을 넣어주고 BufferedReader 라는

객체에 전달을 해서 BufferedReader 데이터타입의 bReader 라는 변수에 넣어주고 

bReader.readline(); 이 명령으로 out.txt 내용을 읽어 다시 String input에 넣어주고

그 결과값을 프린트하고 있다. 그러나 이렇게 실행하면 결과는 오류갈 발생한다.

```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException

	at Java_tutorials/org.opentutorials.javatutorials.exception2.CheckedExceptionDemo.main(CheckedExceptionDemo.java:6)
```

위와 같은 오류의 원인 중 우리가 봐야할 것은 Unhandled exception type FileNotFoundException,

Unhandled exception type IOException 이 두 부분이다. 

FileNotFoundException, IOException 이 두부분을 처리해 주고 있지 않다라는 뜻이다.

이 오류를 해결해 동작을 시키보자 그럼 첫번째로 해야할일은 오류가 발생한 그 이유를 알아야 할것이다. 

API에서 그이유를 살펴보면 [FileReader API](https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html#FileReader%28java.io.File%29)

(이클립스 에디터를 기준으로 그 문제가 되는(현재는 FileReader)라는 곳에 마우스를 더블클릭하면

그 문장이 선택되고 그때 F1키를 누르면 help를 볼수 있다.)

그곳에 FileNotFoundException 라는 예외는, FileReader 를 String 형태의 파일의 이름을 가져올때

그 파일이 존재하지 않거나 파일이 아닐경우 FileNotFoundException 이 발생한다. 그래서 이 Throws 란 것은

사용하는 입장에서 반듯이 FileNotFoundException 이란 오류에 예외처리를 해주어야 한다는 뜻이다.

이클립스로 돌아와 추천 예외해결을 사용해보면


```
package org.opentutorials.javatutorials.exception2;

import java.io.*;
public class CheckedExceptionDemo{
	public static void main(String[] args){
		BufferedReader bReader;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String input = bReader.readLine();
		System.out.println(input);
	}
}
```

이런식으로 try/Catch를 통해 FileNotFoundException 이란 오류를 해결할 수 있다. 우리에겐 또 

해결해야할 문제가 하나더 있다. String input = bReader.readLine(); 이 부분또한 오류가 발생하는데

똑같은 방식으로 API에 들어가 확인을 해서 Catch/try로 고칠수 있다.

```
package org.opentutorials.javatutorials.exception2;

import java.io.*;
public class CheckedExceptionDemo{
	public static void main(String[] args){
		BufferedReader bReader=null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String input=null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
```
## 예외사슬

자바는 우리에게 new FileReader("out.txt") 일떄 out.txt 라는 인자를 읽으려 할때 문제가 있거나 

읽어올 수 없을시 우리에게 그 예외를 강제 처리하도록 던지고(Throws) 있다. 그래서 우리는 try/Catch 

를 통해 해결했다 근데 잡는것(Catch) 하는것 말고 다른 사람에게 다시 우리가 던질수 있다.

```
class B{
	void run(){

	}
}
class C{
	void run(){
		B.b =new B();
		b.run();
	}
}
public class ThrowException {
	public static void main(String[] args){
		C.c = new C();
		C.run();
	}
}

```

위 예제를 보면 class ThrowException 메소드 에선 Class C 를 사용하고 Class C 에선 Class B 

를 사용하고 있다. 이 말은 결국 C는 B의 사용자이고 ThrowException는 C의 사용자이다 그리고 마지막에는

EndUser가 그 사용자이다. 

그런데 만약 B에서 예외가 발생했다고 가정하면 바로 B에서 try/Catch할수 있겠지만 C에게 Throw 할수 있다

그럼 C도 다음 사용자에게 Throw 하고 그렇게 EndUser 에게 Throw 할수 있다.(만약 일반사용자에게

Throw 하게 된다면 그뜻은 그냥 이 전체적인 기능을 종료한다는 뜻이다.)

그렇다면 자신이 try/catch 하는것과 Throw의 차이점은 무엇인가?

```
class B{
	void run() {

		BufferedReader bReader=null;
		String input=null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}

}

class C{
	void run(){
		B.b =new B();
		b.run();
	}
}
public class ThrowException {
	public static void main(String[] args){
		C.c = new C();
		C.run();
	}
}

```

이전 예제들을 합친것이다. Class B 에서 우리는 Try/Catch를 사용하고 있다 그러나 우리는 B를 사용하는 

다른 곳에 Throw 할 수 있다. Class B 의 메소드 void run() { 이곳에 void run() throws {

라고 쓰고 강제하고 싶은 오류 만약 FileNotFoundException면 이면 

void run() throws FileNotFoundException {

이런식으로 바꾸어 줘야 한다. 그럼 C 의 b.run(); 에서 오류를 발생 시킬 것 이다. 그럼 C 도 Try/catch를

이용해서 바꾸어준다. (1개 이상의 오류를 Throws 하고 싶으면 void run() throws 1, 2) 이런식으로
쓴다.


## 키워드

API = Application Program Interface 의 약자로 Java 프로그래밍의 언어 및 사용법 등을 알려주는 프로그램

try/Catch = 예외를 해결하는 문법중 하나로 Try{} 안에 예외가 예상되는 코드를 집어 넣고 만약 예외가

발생할 시에는 뒤에오는 구문 Catch(______){} 안쪽에 코드를 로직을 실행시키는 것, 단 이것은 자신이 

예외를 처리 하는것을 뜻한다

Throw = 예외를 다음 사용자에게 해결하도록 강제 하는것

## 참고
[생활코딩](https://opentutorials.org/course/1223/6227)



