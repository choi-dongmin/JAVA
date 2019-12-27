# 다형성(Polymorphism)

 다형성이란 하나의 메소드나 클래스가 있을때 그것을 다양한 방법으로 동작하는 것을 의미한다. 

 키보드를 예로 들면 여러개의 키가 있지만 '누른다'라는 동작은 똑같지만 각각 키마다 실행되는것이 다르다.

 ## overloding과 다형성

 ```
 class O {

 	public void a(int param){
 		System.out.println("숫자출력");
 		System.out.println(param);
 	}
 	public void a (String param){
 		System.out.println("문자출력");
 		System.out.println("param");
 	}
 }

 public class PolymorphismDemo {

 	public static void main(String[] args){
 	O o = new O();
 	o.a(1);
 	o.a("one");
 	}
 }
 ```

 위 코드는 overloding 이다. overloding 또한 다형성 중 하나라고 말할수 있다. 같은 이름이지만 다른

 다른 객체를 불러올수 있다.


## 클래스와 다형성

```
class A{
	public String X(){
		return "x";
	}
}
class B extends A{
	public String Y(){
		return "y";
	}
}

public class PolymorphismDemo2{
	public static void main(String[] args){
	A obj = new B();
	obj.X();
	//obj.Y(); 오류
	}
}
```

위 예제를 보면 인스턴스화 시키는 과정에서 B를 객체로 만드는데 그 객체를 담는 데이터타입이 A이다. 

위 예제는 오류를 발생시키는데 이유를 보자 A obj = new B(); B가 A의 처럼 행동하는것 이다.

예제를 보면 호출에서 X,Y메소드를 호출하고 있다. 이 과정에서 X는 클래스 A에 정의되어 있어 실행이

가능하지만 Y는 B클래스에 있어서 실행이 되질 않는것이다. 여기서 우리가 알아야 되는것은 인스턴스 과정에서

우리는 평범하게 클래스와 그 클래스의 데이터타입을 일치시켜도 되지만, 그 데이터 타입을 인스턴스화 시키는

클래스의 부모클래스로 하여도 된다. 

하지만 우리는 굳이 왜 이렇게 쓸까? 다음의 코드를 보자

```
class A{
	public String X(){
		return "A.x";
	}
}
class B extends A{
	public String X(){
		return "B.X;"
	}
	public String Y(){
		return "y";
	}
}

public class polymorphismDemo2{
	public static void main(String[] args){
	A obj = new B();
	System.out.println(obj.X());
	}
}
```
위의 예제를 보면 자식클래스에 X메소드를 overriding을 하고 있다 그렇다면 과연 A와 B클래스중 어떤 값이 

도출이 될까? 정답은 자식클래스의 B이다. 비록 B클래스가 A클래스 인것처럼 행동하고 있지만 B의 

overriding된 값을 출력한다. 다시말해 A의 처럼 행동하기 때문에 A에 있는것만을 가져오지만 만약 B에서 

overriding이 되었다면 B의 정의된 메소드를 출력한다는 것이다.

```
class A{
	public String X(){
		return "A.X";
	}
}
class B extends A{
	public String X(){
		return "B.X";
	}
	public String Y(){
		return "y";
	}
}
class B2 extends A{
	public String X(){
		return "B2.X";
	}
}

public class PolymorphismDemo2{
	public static void main(String[] args){
	A obj = new B();
	A obj2 = new B2();
	System.out.println(obj.X());
	System.out.println(obj2.X());
	}
}
```

위 예제에서도 마찬가지로 obj2가 A처럼 행동한다 하더라도 B2의 overriding 된 값을 출력한다.

그리고 여전히 B 클래스의 Y 메소드는 여전히 '거짓행동양식'에 없기 때문에 할수없다.

## 실전예제

우리가 저번에 abstract 에서 했었던 Calculator 예제를 사용해 실전처럼 사용해보자.
```
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
   
} 
```

기존에 abstract 에 있던 예제와 다르게 변경된것이있는데 그떈 인스턴스화를 다형성을 사용해서 했다는 점이다. 

```
public class CalculatorDemo {
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
```

여기서 중요한 것은 두개의 클래스는 인스턴스화를 시키는데 다형성을 통해 두 클래스다 Calculator 인것 처럼

행동하고 있다 여기서 조금 더 바꾸어서

```
public class CalculatorDemo {
    public static void execute(Calculator cal){
    	System.out.println("실행결과");
    	cal.run();
    }

    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        

        execute(c1);
        execute(c2);
    }
```
위 예제를 보면 execute 메소드는 "실행결과" 라는것을 출력하고 cal.run(); 을 한다 이것은 cal 이라는 

변수의 run을 호출한다 이때 cal은 자신의 매개변수 그리고 그 매개변수의 데이터 타입은 Calculator 이다

그리고 각각의 Deco 들은 setOprands 인자값으로 각각 주고있다 그리고 그 다음 메소드 execute 를 

실행하는데 그 인자값을 각각 인스턴스화된 c1,c2 를 받고있다 그리고 마지막으로 execute 에서 cal.run 을 실행한다. 

만약 우리가 다형성을 모르고 인스턴스화를 평범하게 한다면 execute의 매개변수 또한 Calculator 또한

CalculatorDecoPlus 혹은 CalculatorDecoMinus 혹은 둘 다 사용하여야 한다.

```
public class CalculatorDemo {
    public static void execute(CalculatorDecoPlus cal){
    	System.oout.println("실행결과")
    	cal.run();
    }
     public static void execute(CalculatorDecoMinus cal){
    	System.oout.println("실행결과")
    	cal.run();
    }

    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        
         
       CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        

        execute(c1);
        execute(c2);
    }
```

이런식으로 거의 같은 코드가 길게되어 overloding을 해야한다. 

그래서 우린 같은 부모클래스를 받는 특성을 이용해 인스턴스화 시킬 두개의 클래스의 데이터타입을 부모클래스로 

부여하고 execute 에 매개변수타입 또한 부모클래스로 받게하여 코드를 효율적이게 바꿀수 있다.


## 인터페이스와 다형성

인터페이슨는 다형성을 구현하는데 있어서 아주 중요한 역할을 한다.

```
interface I{}
class C implements I{}
public class PolymorphismDemo3{
	public static void main(String[] args){
	I obj = new C();
	}
}
```

class C 를 인스턴스화 시키면서 obj에 담고있고 그 변수의 데이터 타입은 다형성을 통해 interface I

로 주고 있다. 조금더 자세히 살펴보자 class C는 I라는 interface를 구현하고 있다 이 말은 즉 

인스턴스화 된 C는 I일수 있다(다형성) 이것이 가능한 이유는 C가 I를 구현(inplements) 하고있기 때문에.

조금 더 심화된 것을 보면 

```
interface I2{
	public String A();
}
interface I3 {
	public String B();
}

class D implements I2, I3 {
	public String A(){
		return "A";
	}
	public String B(){
		return "B";
	}
}
public class PolymorphismDemo4{
	public static void main(String[] args){
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();

		obj.A();
		obj.B();

		objI2.A();
		//objI2.B(); 오류 발생

		//objI3.A(); 오류 발생
		objI3.B();
	}
}

```

인터페이스의 다형성 또한 인스턴스화 시킬때 데이터타입을 그 인터페이스로 지정한 경우 클래스를 다형화 

시킨것과 같은 방법으로 사용이 가능하다. 위의 예제를 보면 D obj = new D(); 는 클래스에서 I2,I3

모두를 구현하고 있기때문에 전혀 A,B를 모두 다 작동시킬수 있다 그러나 objI2, objI3 는 각각 받는

데이터 타입이 I2,I3로 정해져 있기 때문에 아무리 D를 인스턴스화 시키더라고 I2는 A를 I3는 B를

받고 있기 때문에  objI2는 A만 objI3는 B만 출력이 가능하다. 이 기능은 클래스 안에 각각의 

interface 여러 메소드와 필드들이 모여 있는데 것인데 이런 클래스 안의 인터페이스 모두 사용한다면 

말그대로 D obj = new D(); 처럼 해야한다 그러나 하나의 그 클래스에 있는 하나의 인터페이스만을 받고 

싶다면 그때는  I2 objI2 = new D(); 이런식으로 사용할수 있다.


## 비유(정리)

사람은 여러 방면으로 볼수 있다 누구에겐 아버지, 직장동료, 옆집아저씨 일수있다 누구와 관계하는냐의 따라

그에대한 정의가 달라진다 또 다른 누군가는 어머니이고 직장동료, 이모 일수도 있다. 만약 이 둘이 같은 직장에

다니고 있다면 회사 입장에선 이 둘은 같은 일을 하는 사람 일뿐이지 가족관계 및 다른 것은 비교적 덜 중요 

하다고 할수 있다.

```
interface father{}
interface mother{}
interface worker{
		public void job();
}
interface neighborhood{}
interface aunt{}

class men implements father, worker, neighborhood {
	public void job(){
		System.out.println("Products Team");
	}
}
class women implements mother, worker, aunt {
	public void job(){
		System.out.println("Accounts Team");
	}
}

public class Company{
	public static void main(String [] args){
		worker employee1 = new men();
		worker employee2 = new women();

		employee1.job();
		employee2.job();
	}
}
```
회사입장에서 본다고 하면 한사람, 한사람이 여러 관계를 가지고 있지만 이런식으로 보는것이 더 정확하다.

## 키워드

다형성(Polymorphism) : 하나의 것으로 다양한 방법으로 동작시키는것을 말한다. 예를 들어 A클래스를 

상속 받는 B클래스를 인스턴스화 시키는 과정에서 B 클래스가 가진 모든 기능을 가져올수 있지만 A클래스의

부분만 가져오고 싶은 경우 다형성을 할 수 있다.(B클래스에서 Overriding 되었고 A클래스가 여러

자식 클래스를 가진 경우) 


overloding : 다형성의 가장 작은 예로 볼수 있다. 두개의 본체가 같은 이름을 공유할 경우 같은 이름

이지만 서로 다른 동작 방법을 가지고 있다. 


overriding : 자식 클래스가 부모 클래스에 있는 메소드를 재정의 하는 행동.

interface : 큰 그림(매개변수타입, 수)를 자신을 구현하는 클래스에 강제하지만 자신이 구체적인 로직을

가질순 없다.([interface](https://github.com/choi-dongmin/Note/tree/master/Java/%23%20%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%90%E1%85%A5%E1%84%91%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%89%E1%85%B3))

## 참고

[생활코딩](https://opentutorials.org/course/1223/6127)
