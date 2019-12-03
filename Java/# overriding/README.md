# overriding

## 창의적인 상속

상속이란 상위클래스의 기능을 하위 클래스에게 물려주는 기능이다. 그러나 우리는 'overriding' 이라는 것으로

상위클래스가 물려준 메소드를 수정,재정의를 통해 기능을 변경하는 것을 할수 있다.

```
class calculator2 {
	int L, R;
	
	public calculator2() {}
	
	public calculator2(int L, int R) {
		this.L=L; this.R=R;
	}

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

class addsubstract extends calculator2 {     //1번
	public void substract () {
		System.out.println(this.L-this.R);
	}

	public void sum(){
		System.out.println("결과 값은" + (this.L + this.R) + "입니다");
	}
}


public  class Exam2{

	public static void main(String[] args) {
		addsubstract c1 = new addsubstract(); 
		c1.setoprands(10,20);  
		c1.sum();										  
		c1.avg();
		c1.substract();
	}
}

```

1번 class addsubstract 를 보면 method sum이 있다 그런데 상위 클래스인 class calculator2 또한

같은 이름의 method가 존재한다. 그러면 c1.sum(); 의 결과값은 상위 클래스에서의 결과일까, 하위 클래스에서의

결과일까? 답은 하위클래스이다. 다시말해 부모클래스와 자식클래스에 같은 이름의 메소드가 있다면 부모클래스의 

메소드는 무시되고 자식클래스에서 재정의한 것이 실행이 된다는 말이다 이것을 'method overriding' 이라고 

한다. 당연하게 생각해서 부모클래스는 여러 자식클래스가 있을수 있기 때문에 우선순위에서 밀린다.


## overriding의 조건


```
class calculator2 {
	int L, R;
	
	public calculator2() {}
	
	public calculator2(int L, int R) {
		this.L=L; this.R=R;
	}

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

class addsubstract extends calculator2 {     //1번
	public void substract () {
		System.out.println(this.L-this.R);
	}

	public void sum(){
		System.out.println("결과 값은" + (this.L + this.R) + "입니다");
	}

	public int avg (){
		return (this.L+this.R) / 2;
	}
}


public  class Exam2{

	public static void main(String[] args) {
		addsubstract c1 = new addsubstract(); 
		c1.setoprands(10,20);  
		c1.sum();										  
		c1.avg();
		c1.substract();
	}
}

```

그러면 overriding 을 하기 위해선 조건이 있다. 위 예제를 보면 하위 클래스의 avg method를 

overriding 을 하여도 오류가 난다 이유는 상/하 클래스 간 호환이 되지 않는다는 뜻이다.

첫번째로 두 메소드간의 형식이 불일치 한다 (void vs int) 일치 시켜야 가능

두번째로 두 메소드간 이름이 같아야 한다

세번째로 두 메소드간 매개변수의 데이터 타입 및 개수 및 순서가 같아야 한다.

이것을 메소드의 시그니처라고 하는데 두 메소다간 시그니처가 동일해야 overriding 할수 있다.

```
class calculator2 {
	int L, R;
	
	public calculator2() {}
	
	public calculator2(int L, int R) {
		this.L=L; this.R=R;
	}

	public void setoprands(int L, int R){
		this.L = L;
		this.R = R;
	}
	public void sum(){
		System.out.println(this.L+this.R);
	}
	public int avg (){
		return (this.L+this.R) / 2;
	}
}

class addsubstract extends calculator2 {     //1번
	public void substract () {
		System.out.println(this.L-this.R);
	}

	public void sum(){
		System.out.println("결과 값은" + (this.L + this.R) + "입니다");
	}

	public int avg (){
		return (this.L+this.R) / 2;
	}
}


public  class Exam2{

	public static void main(String[] args) {
		addsubstract c1 = new addsubstract(); 
		c1.setoprands(10,20);  
		c1.sum();										  
		c1.avg();
		c1.substract();
	}
}
```
이런 방식으로 고쳐질수 있겠다(사실 좋은 부모 클래스를 바꿔서 수정하는 것은 좋은 방법이 아니다.) 그러나 또 

문제가 발생하는데 바로 부모 클래스와 자식 클래스의 avg method가 중복된다는 것이다. 그럴땐 'return' 과

'super'를 이용하면 가능하다.

```
class addsubstract extends calculator2 {     
	public void substract () {
		System.out.println(this.L-this.R);
	}

	public void sum(){
		System.out.println("결과 값은" + (this.L + this.R) + "입니다");
	}

	public int avg (){
		return super.avg();
	}
}
```

위와 같이 상위 클래스는 그대로 두고 return super.avg(); (상위 클래스에 있는 method avg를 호출)

가능하게 한다. 


## 참고

[생활코딩](https://opentutorials.org/course/1223/6090)
