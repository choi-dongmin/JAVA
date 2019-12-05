# 클래스 패스(class path)

## 클래스 패스

클래스가 위치하는 경로를 지정해 자바가 필요로하는 클래스를 불러 올 수있는 기능이다. 
```
class Item {
	
}
class ClassPathDemo{
	
}
```

우리가 위와 같은 코드를 작성을 하고 컴파일(javac ClasspathDemo.java) 한다면

- Item.class

- ClassPathDemo.class

위 두가지의 파일이 생성된다 즉, 각 class 하나가 하나의 class 파일을 같는다고 알 수 있다.

```
class Item2 {
	public void print(){
		System.out.println("Hello World");
	}
}

class ClassPathDemo2{
	public static void main(String[] args){
		Item2 it = new Item2();
		it.print();
	}
}
```

만약 위 두깨의 클래스와 컴파일(javac ClasspathDemo2.java) 시킨 파일이 같은 폴더에

있다고 하면 별 문제없이 실행될것이다. 그러나 만약 컴파일된 class 파일 Item2.class 가

다른 폴더에 있다고 한다면 오류가 발생한다. 

그럴때 우리는 '-classpath'를 통해 강제로 컴퓨터가 파일을 찾을수 있게 지정해주어야 한다.

- java -classpath ".:lb" ClassPathDemo2 (osx용)
- java -classpath ".;lb" ClasspathDemo2 (ms용)
```
위의 코드를 통해 실행할수 있는데 -classpath 하여라 ClasspathDemo2 실행시키는데 필요한 

파일을 ".;lb"(. = 현재폴더, ;,: = 폴더구분 lb = .안의 lb폴더)
```
이런식으로 classpath를 한다면 실행이 가능하다.


## 환경변수

우리는 java를 실행할 때 class를 사용하게 되는데 그 class가 어디에 위치하는가를 지정하는 것이 

환경변수이다. 이것이 필요한 이유는 우리가 프로그램을 모든것을 다 혼자 만들수 없다 그렇기 때문에

다른이가 만든 로직(class)을 자신의 코드에 접목시켜야 할때 경로지정을 해주는 등 여러가지 상황이 있다.

그럴때마다 -classpath를 이용하면 불편한데 환경변수를 이용해 운영체제에서 classpath를 지정해 줄수도 있다.


## 참고
[생활코딩](https://opentutorials.org/course/1223/5527)


