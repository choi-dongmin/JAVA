# 상속

- 상속이란?

객체지향 내에서 상속은 매우 중요한 의미를 가진다 상속은 객체지향의 재활용성을 극대화시킨 프로그래밍 

기법이다 동시에 객체지향을 복잡하게 하는 주요 원인이라고 할수있다.

상속은 기본적으로 물려준다는 의미다. 1개의 객체가 존재하고 새로운 다른 1개의 객체를 만들 경우

기존에 있던 객체의 메소드와 변수를 받아오면서 경우에 따라선 새로운 메소드와 변수를 사용 혹은 수정을

하는것을 상속이라고 한다.

기존에 object에서 했던 예제를 가지고 하는 예를 보자

```
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
					c1.subtract();
				}
			}
	}
```

만약 예를들어 우리가 새로운 메소드 여기선 subtract 를 추가하고 싶은경우 가장 쉬운 방법은

calculator 라는 class를 열어서 그 안쪽에 메소드를 작성하는 것이다. 그러나 경우에 따라서는 새로

추가하는것이 어려울수 있다.  객체를 자신이 만들지 않아 소스를 변경 할수가 없을 경우, 변경한다 해도 

원 소스를 업데이트하면 변경했던 새로운 코드가 사라지는 등등의 이유로 우리는 기존에 객체를 유지하면서

어떠한 기능을 추가 할 수있는 방법을 찾아야한다 그러한 맥락에서 등장하는 것이 바로 상속이다.
```
기존 객체를 수정하지 않으면서 새로운 객체가 그 기존의 객체를 기반으로 만들어지게 하는것 
```
이때 기존의 개체는 기능을 물려준다는 의미로 부모 객체가 되고 새로운 객체는 물려받는다는 의미에서

자식 객체가 된다. (부모 클래스 = 상위 클래스 = super class, 자식 클래스 = 하위 클래스 = 

sub class = base class = derived class)


```
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
	}
	
	class addsubstract extends calculator {
		public void substract () {
			System.out.println(this.L-this.R);
		}
	}
	
	
	public  class Exam1{

		public static void main(String[] args) {
			addsubstract c1 = new addsubstract();
			c1.setoprands(10,40);
			c1.sum();
			c1.avg();
			c1.substract();
		}
	}
```

위 코드를 보면 calculator class가 끝나는 지점에 addsubstract class 이 생성되었다.

우리가 잘 봐야 할곳이다. class addsubstract 가 extends(연장하다), class calculator 까지.

하위클래스는 상위클래스를 상속,확장 한다  즉 하위클래스는 상위클래스의 메소드를 가저올수 있다.

## 다양한 상속

당연하게도 하나의 부모 클캐스에 여러개의 자식 클래스가 존재할 수 있다. 뿐만아니라 하위의 하위 클래스

또한 생성할수 있다.

```
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
	}
	
	class addsubstract extends calculator {
		public void substract () {
			System.out.println(this.L-this.R);
		}
	}
	
	class addmultplcation extends addsubstract {
		public void multplcation () {
			System.out.println(this.L*this.R);
		}
	}
	
	public  class Exam1{

		public static void main(String[] args) {
			addmultplcation c1 = new addmultplcation();
			c1.setoprands(10,40);
			c1.sum();
			c1.avg();
			c1.substract();
			c.1multplcation();
		}
	}
```

 addmultplcation class 를 addsubstract 까지 확장시키고 메소드 multplcation를 작성해주고

 addmultplcation instance 를 생성해주면 하위의 하위 클래스도 사용할수 있다.

## 참고

[생활코딩](https://opentutorials.org/course/1223/6060)






