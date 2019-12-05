# 상속과 생성자

생성자는 객체를 생성한다. 그 과정에서 해야 할 일들을 생서자 메소드에 지정해서 초기화 작업을 할수 있다.

우선 선행으로 이해해야 할 기능을 먼저 배우자.  

``` 
public class ConstructorDemo{
	
	public static void main(String[] args){

		ConstructorDemo c = new ConstructorDemo();
	}
}
```

위를 보면 ConstructorDemo class 가 있고 그의 main method가 자기자신으 인스턴스화 시키고 있다.

위와 같은 코드는 문제가 없다. 그러나 

``` 
public class ConstructorDemo{

	public ConstructorDemo (int para){}
	
	public static void main(String[] args){

		ConstructorDemo c = new ConstructorDemo();
	}
}
```
public ConstructorDemo (int inza1){} 위와 같이 생성자를 만들어 주었는데 그 생성자에 매개변수가

있다라는 것은 그 생성자는 기본 생성자가 아니라는 뜻이된다 그럼으로 저 상태에서 클래스를 인스턴스화 시키면 

오류가 발생한다. 

1,2번째 코드를 비교하면 1번째 코드는 생성자가 존재하지 않는다 그래서 인스턴스화 시킬때 자바에서 새롭게 

기본 생성자(클래스와 이름이 같고 매개변수가 없다)를 만들어 준다. 

2번째 코드는 기본 생성자가 아닌 생성자(매개변수가 있는 생성자)가 있는 경우이다. 어떤한 생성자간에 생성자가 

존재할 경우자바는 기본 생성자를 만들지 않는다 그런데 인스턴스에서 받는 생성자는 매개변수가 없는 

기본 생성자인데 2번째 코드는 매개변수가 있는 생성자만 있음으로 오류가 발생한다.

해결방안을 보면

``` 
public class ConstructorDemo{
	public ConstructorDemo(){}

	public ConstructorDemo (int para){}
	
	public static void main(String[] args){

		ConstructorDemo c = new ConstructorDemo();
	}
}
```

위처럼 새로운 기본 생성자를 만들어 주면 문제없이 작동한다.

그럼 이제 부터 본론으로 들어가보자

```
	class calculator {
		int L, R;

		// 삭제 method setoprands		


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
		public addmultplcation(int L, int R) {  // 추가
			this.L=L; this.R=R;					// 추가
		}										// 추가 
		
		public void multplcation () {
			System.out.println(this.L*this.R);
		}
	}
	
	
	public  class Exam1{

		public static void main(String[] args) {
			addmultplcation c1 = new addmultplcation(20,20);  // 변경 
			c1.sum();										  // 삭제 setoperands
			c1.avg();
			c1.substract();
			c1.multplcation();
		}
	}

```
위에는 전시간에 했던 예제에서 조금 변경되었다(변경된 부분을 주석으로 표시했다). 예제를 보면 

addmultplcation라는 하위 클래스를 인스턴스화 할때 생성자 매개변수에 인자값을 넣어주고 그 매개변수를

전역변수에 담아주어 다른 상위 클래스에 메소드에 영향을 미치고 결과값을 변경시킨다. 

좀 더 심화시켜서

```
	class calculator {
		int L, R;

		public calculator2() {} // 추가

		public calculator2(int L, int R) { 	// 추가  1번 
		this.L=L; this.R=R;					// 추가
		}									// 추가

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
	class addmultplcation extends addsubstract {   // 2번
		public addmultplcation(int L, int R) { 
			this.L=L; this.R=R;					
		}										
		
		public void multplcation () {
			System.out.println(this.L*this.R);
		}
	}
	
	
	public  class Exam1{

		public static void main(String[] args) {
			addmultplcation c1 = new addmultplcation(20,20);   
			c1.sum();										  
			c1.avg();
			c1.substract();
			c1.multplcation();
		}
	}

```

만약 추가한것 처럼 기본 생성자가 아닌 다른 생성자를 주었을 경우 인스턴스화 시킬때 자바는 하위클래스에서 

그 부모 클래스로 생성자를 찾게되는데 기본 생성자가 아닌 다른 생성자일 경우 오류가 발생한다.

그래서 우리는 public calculator2() {} 기본 생성자를 억지로 넣어줌으로써 그 오류를 해결할수 있고

public calculator2() {} 를 넣지 않고 문제를 해결할 수 있는데 보면 1번(부모 클래스)과 2번(자식 

클래스)는 같은 생성자 코드를 가진다 이말은 중복된 일을 하고 있다는 것이다 그러면 알다싶이 유지보수 등

비효율적이다. 그럼 어떻게 해야할까?

```
	class calculator3 {
		int L, R;
		
		public calculator3 (int L, int R) {  // 1번
			this.L = L; this.R = R;
		}
		
		public void sum() {
			System.out.println(this.L + this.R);
		}
		public void avg () {
			System.out.println((this.L + this.R)/2);	
		}
	}
		class plussubstract extends calculator3 { // 2번
			public plussubstract (int L, int R) {
				super (L,R);
			}
			
			public void substract () {
				System.out.println(this.L-this.R);
			}
		}
		class plusX extends plussubstract { // 3번 
			public plusX (int L, int R) {
				super (L,R);
			}	
			public void x() {
				System.out.println(this.L*this.R);
			}
		}
	
 



public class Exam3 {
	
	public static void main(String [] args) {
	
	plusX c1 = new plusX(10,10);
	c1.sum();
	c1.avg();
	c1.substract();
	c1.x();
	}
}
```

우리가 봐야 할것은 생성자들이다 우선 인스턴스화 되며 인자값이 3번 생성자로 들어가게 된다 그럼 10,10을 

넣어주게 되고 super가 나오게 되는데 super란 자기의 부모 클래스를 뜻한다. 그럼 3번의 부모 클래스인 

2번으로 가게 되는데 2번도 같은 방법으로 자신의 부모인 1번과 L,R이 같다고 명시한다 그래서 결국엔

10,10이 1번 생성자 안으로 들어가게 되고 실행된다 super를 통해 인자를 주는 생성자를 호출했기 때문에

기본 생성자는 필요가 없게 된다. 이렇게 짧은 코드로는 실감이 안나지만 생성자의 코드가 천줄, 만줄이라면

효율성은 늘어날것이다. 


## 참고 
[생활코딩](https://opentutorials.org/course/1223/6126)  

