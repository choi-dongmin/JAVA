# 초기화와 생성자

## 초기화

어떠한 일을 시작할때 준비단계를 다른말로 초기화라고 부른다.

객체지향 프로그래밍도 초기화에 해당하는 기능이 제공되는데 이것을 생성자(constructor)라고 한다.

## 생성자

```
calculator c1 = new calculator
c1.setoprands(10,20);
c1.sum();
c1.avg():
```
위의 예는 setoprands의 인자값을 10,20으로 주었다. 그러나 절차지향에 따라 만약 sum,avg 가

더 앞쪽에 오게 되면 오류가 발생하여 실행되지 않는다.

그렇다면 초기에 new calculator 를 생성할때 인자값을 셋팅 해줄수 있다면?

```
calculator c1 = new calculator(10,20);
c1.sum();
c1.avg():
```
이런식으로도 해줄수 있다. 그렇다면 위와 같이 쓸수 있는 방법을 알아보자. 

```
class calculator{
	int L,R;

	public calculator (int L,int R){
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
public class CalculatorDemo1{
	public static void main(String [] args){
		calculator c1 = new calculator(10,20);
			c1.sum();
 			c1.avg();
	}
}
```

위 예제는 클래스와 인스턴스 calculator 예제에서 볼수 있던 것을 바꾼것인데 우리가 중요하게 봐야할 것은

class calculator 와 public calculator 의 이름이 같다는 것이다.

여기서 method 를 '생성자(constructor)' 라고 하는것이다.

이 기능을 설명하면 class가 생성될 때 같은 이름을 가진 method를 가장 먼저 실행한다는 것이다.

사실 우리가 지금까지 객체를 생성할때 쓰고있던

```
calculator c1 = new calculator(10,20);
c1.sum();
c1.avg():
```
에서 new 뒤에 오는 calculator 는 사실 생성자이다 우리가 calculator(10,20); 이러한 식으로

인자값을 주어서 호출하는것은 명확한 메소드 호출하는 형태였습니다.

## 참고

[생황코딩](https://opentutorials.org/course/1223/5519)


