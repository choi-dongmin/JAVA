# overloding(오버로딩)

```

class calculator {
	int L,R;

	public void setOprands(int L, int R){
		this.L = L; this.R = R;
	}

	public void sum(){
		System.out.println(this.L+this.R);
	}

	public void avg() {
		System.out.println((this.L+this.R)/2);
	}
}

public class exam {
	
	public static void main(String[] args){

		calculator c1 = new calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();

		calculator c2 = new calculator();
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();
	}
}
```

위에 계속 우리가 했던 예제가 있다 그러나 이 예제의 클래스는 2개의 인자값을 대상으로만 연산을 할 수 있다.

만약 우리가 3개의 값을 대상으로 계산을 할수있게 하고싶다면? 무슨 방법이 있을까?

가장 쉬운 방법은 calculator class와 setOprands method를 변경 시키는 것이다.

```
class calculator {
	int F,S,T;

	public void setOprands(int F, int S, int T){
		this.F = F; this.S = S; this.T = T;
	}
```

이런식으로 변경하고 연산메소드 또한 바꾸면 된다 그러나 만약 3개 매개변수 중 2개의 매개변수를 계산하려 하면 

우리는 c1.setOrands(10,20); 이런식으로 작성 할 수 있을것이다. 그러나 3번째 인자값을 주지 않았기 

때문에 오류가 발생한다. 그럼 우리는 어떻게 할수 있을까? 한번 메소드를 늘려보자.

```
class calculator {
	int F,S,T;

	public void setOprands1(int F, int S, int T){
		this.F = F; this.S = S; this.T = T;
	}
	public void setOprands2(int F, int S){
		this.F = F; this.S = S;
	}
```
이런식으로 setOprands method를 늘려줌으로 오류를 해결했다.

그러나 우리는 'overloding' 을 통해 좀 더 효율적으로 해결할수 있다. 

```
class calculator {
	int F,S,T;

	public void setOprands(int F, int S){
		this.F = F; this.S = S; 
	}
	public void setOprands(int F, int S, int T){
		this.F = F; this.S = S; this.T = T;
	}

	public void sum(){
		System.out.println(this.F+this.S+this.T);
	}

	public void avg() {
		System.out.println((this.F+this.S+this.T)/2);
	}
}

public class exam {
	
	public static void main(String[] args){

		calculator c1 = new calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.setOprands(10,20,30);
		c1.sum();
		c1.avg();

	}
}
```

우리는 여기서 2개의 setOprands method를 볼수 있다 원래는 같은 이름의 메소드를 쓰는것은 오류를 

발생시키지만 overloding을 통해 오류를 차단할수 있다 

```
한마디로 같은 이름의 메소드이지만 다른 매개변수의 수 , 데이터 타입에 의해서 구분을 지어주는 것이 바로 

'overloding'
```

만약 우리가 인자값을 2개를 준다면 그에 맞는 setOprands를 3개라면 또 그에맞는 setOprands를 불러온다.

또 자세히 보면 2개의 메소드 사이엔 중복이 존재한다 그것을 바꾸저보자

```
	public void setOprands(int F, int S){
		this.F = F; this.S = S; 
	}
	public void setOprands(int F, int S, int T){
		this.F = F; this.S = S; this.T = T;
	}
```

위와 같은 코드를

```
	public void setOprands(int F, int S){
		this.F = F; this.S = S; 
	}
	public void setOprands(int F, int S, int T){
		this.setOprands(F, S)
		this.T = T;
	}
```

이런식으로 바꾸어 줄수 있다.

## overloding의 규칙

method overloding은 매개변수를 사용한다. 즉 이름이 같더라도 서로 다른 매개변수를 가졌다면 서로 다른 

메소드인 것이다. 만약 같은 매개변수와 값을 같는 2개의 메소드가 있는데 그 메소드가 return값이 다르다고 해도

overloding을 할수는 없다.(또한 메소드의 매개변수의 이름이 다르다 해도 오류가 발생한다. 즉 overloding 

은 매개변수의 수와 데이터타입에 의존한다.)

```
public class OverlodingDemo {
	
	void a() {System.out.println("void a()");}
	void a(int arg1){System.out.println("void a(int args1)");}
	void a(String args1){System.out.println("void a(String arg1");}
	// int a(){ System.out.println(int a();)}

	public static void main(String[] args){
		OverlodingDemo OD = new OverlodingDemo();
		OD.a();
		OD.a(1);
		OD.a("Coding");
	}
}
```

위 코드는 overloding은 데이터 타입에는 의존하지만 return값에는 의존하지 않는것을 보여준다.

(주석을 풀면 이름은 같아도 return값이 다르기 때문에 오류발생)

그럼 이젠 밑의 예제가 위의 예제에 자식클래스라고 생각해보자.
``` 
public class OverlodingDemo2 extends OverlodingDemo {
	
	void a (String arg1, String arg2){System.out.println("sub class : void a (	String arg1, String arg2)");}

	void a(){System.out.println("sub class : void a()");}

	public static void main(String[] args){
		OverlodingDemo2 OD = new OverlodingDemo2();
		OD.a();
		OD.a(1);
		OD.a("Coding");
		OD.a("Hi","Coding")
	}

}
```
위 예제는 overriding 과 oveloding을 비교하기 위해서 있는 예제이다 상속받는 클래스의 a()를 실행하면 

위쪽의 매개변수가 없는 같은이름의 메소드가 있다하더라도 overriding에 의해서 하위클래스의 같은 시그니처를 

가진 메소드가 우선순위에서 앞서 실행시 하위클래스의 메소드가 실행된다.




## overriding vs overloding

- overriding : 부모와 같은 이름을 가진 메소드를 자식에서 만들면 자식의 클래스가 먼저 우선순위에서 앞서 자식 클래스의 메소드

	연산을 실행한다.

- overloding : 같은 이름의 메소드이지만 다른 매개변수의 수 , 데이터 타입에 의해서 구분하여 그에 맞는 호출 신호가 왔을시 해당

	메소드를 호출 시키는것.


## 참고

[생활코딩](https://opentutorials.org/course/1223/6088)






