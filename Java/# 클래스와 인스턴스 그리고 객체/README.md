# 클래스와 인스턴스 그리고 객체

## 클래스(class)와 (instance) 이전의 프로그래밍

```
public static void main(String[] args){
	System.out.println(20+30);
	System.out.println(10+40);
}
```

위의 로직이 많이 복잡하고 만약 몇천개가 있다고 가정하면 우리는 조금 더 단순화 시켜야 할 것이다. 

그럼 어떻게 단순화 시킬수 있을까? 바로 중복되는 로직을 메소드화 시켜주는 것이다

위에 예제에선 좌변과 우변을 더한다는 것이 중복이 된다 그럼 이 중복된것을 메소드화 시켜보자  

### 메소드화

```
public static void sum (int L, int R){
	System.out.println(L + R);
}

public static void main (String[] args){
	sum(10,40);
	sum(50,50);
}
```

이 코드는 이전 코드의 중복되는 더하기 를 메소드화 시켰다. 로직을 메소드로 만들면 코드 양을 줄일수 있고

문제가 생겼을시 더 원인을 쉽게 찾을수 있게 된다.

뿐만아니라 빼기, 나누기, 곱하기 등등 수정을 할 때에도 메소드에만 변화를 주면되어 효율적이다. 


만약 더하기뿐 아니라 평균까지 구하라고 한다면 어떻게 하는게 좋을까? 다음의 코드를 보자
```
public class claculatorDemo2 {

		public static void sum (int L, int R){
			System.out.println(L + R);
		}
		
		public static void avg (int L, int R) {
			System.out.println((L + R) / 2);
		}
		public static void main (String[] args){
		int L,R;
			L = 10; R = 40;  // 1번
				sum (L,R);
				avg (L,R);

			L = 50; R = 50; // 2번
				sum (L,R);
				avg (L,R);
		}
}
```


avg라는 새로운 메소드를 만들어 그 안에 평균을 구하는 연산을 넣어주고 main 함수에 L,R을 int로 설정하주고 

변수 L,R에 각각의 값을 주고 다음 L,R 값을 주는 사이에 메소드와 변수를 입력하여 주었다.

sum과 avg를 구할수 있다. 

그리고 각주 1번과 2번이다 1번 밑에있는 sum과 avg는 1번 변수값의 영향을 받고 2번 밑에있는 sum과 avg는 2번 변수값의 영향을 받는다.

즉 1번 변수값 밑의 로직은 1번과 연관되어 있고 2번 변수값 밑의 로직은 2번과 연과 되어있다.


## 클래스(class)와 인스턴스(instance)
```
package org.opentutorials.javatutorials.object;

	class calculator {
			int L, R;

			public void setoprands(int L, int R){
				this.L = L;
				this.R = R;
			}
			public void sum(){
				System.out.println(this.L+this.R);
			}
			public void avg(){
				System.out.println((this.L+this.R)/2);	
			}
		
		public static class ClaculatorDemo3{
	
				public static void main(String[] args) {
					calculator c1 = new calculator();
					c1.setoprands(10,40);
					c1.sum();
					c1.avg();
				
				
					calculator c2 = new calculator();
					c2.setoprands(50,50);
					c2.sum();
					c2.avg();
			}
		}
	}

```
- 클래스

이 예를 보면 변수 L,R 메소드 sum,avg 는 서로 계산을 하는 것이라는 연관성이 있다. 

그렇기 때문에 연관성이 있는 메소드와 변수를 calculator라는 이름의 클래스로 묶어준다.

더하기와 평균값을 구하는 클래스가 만들어졌다. 

결국 '클래스(class)'는 연관성이 있는 변수와 메소드의 집합이다.


- 인스턴스

이제 클래스를 사용하는 방법을 알아볼텐데, 클래스는 일종의 설계도면이다 단순히 설계도면만 가졌다고 

제품이 완성되지 않는다 실제로 그 생산활동을 해야 하는데 그러한 생산활동을 '인스턴스'라고 할 수 있다

그리고 그때 사용하는 키워드가 'new'이다.

calculator c1 = new calculator(); 이 부분 부터 구체적인 생산활동을 한다는 명령어라 할 수 있다.  
```
new calculator(); : calculator class에 기록된 설계도면으로 '새로운 생산활동'을 시작한다.

calculator c1 =  : 그리고 그 생산활동의 이름은 c1이다.
```
현재 단계에선 생샌활동을 시작하려면 인스턴스를 '변수로 지정'해주어야 한다는 것과 그 변수앞에 데이터타입은 

'그 클래스 이름'과 같아야 한다는 것을 기억하자. 


```

	public static void main (String[] args){
			calculator c1 = new calculator();
			c1.setoprands(10,40);
			c1.sum();
			c1.avg();

			calculator c2 = new calculator();
			c2.setoprands(50,50);
			c2.sum();
			c2.avg();
```

호출 코드를 보면 각각 인스턴스를 c1, c2로 지정하고 . 각각의 지정된 인스턴스에 메소드를 호출하고 있다.

c1.setoprands(10,40); , c2.setoprands(50,50);  으로 각각 인자값을 메소드에 부여하고


public void setoprands(int L, int R){
		this.L = L;
		this.R = R;
}

이 메소드가 그 인자값을 매개변수에 담고 있다. 그리고 이 메소드 안에 this.라는 것이 있다. 아무것도 없는 

L,R은 매개변수이기 때문에 자신의 메소드 다른 메소드로의 유입을 할 수 없다. 

반면 this.L,R은 class calculator에서 지정한 변수 int L,R 로써 다른 메소드로의 유입이 가능하다. 

참고
[생활코딩](https://opentutorials.org/course/1223/5400)

