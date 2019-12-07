# 패키지

## 패키지(package)

패키지는 여러 클래스가 존재할때 그 클래스 이름들이 만약 같은 이름을 가지고 있을때 발생하는 오류를 해결할 수 

있는 장치이다. 

예를 들어보면 만약 하나의 폴더안에는 같은 이름의 파일 2개가 공존할수 없기 때문에 우리는 새로운 폴더를 만들어 

준다.

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

위 예제의 위쪽에 보면 package org.opentutorials.javatutorials.object; 로 되어있는데

calculator 클래스는 org.opentutorials.javatutorials.object 라는 패키지 속에 들어있다.

더욱 자세하게 보자면(이클립스를 사용한다는 전제하에) 패키지를 오른쪽 마우스로 눌러 Properties 를

클릭한다면 Location 경로가 나오는데 
```
/Users/choi/Documents/Java_tutorials/src/org/opentutorials/javatutorials/object

/ClaculatorDemo3.java
```

/Users/choi/Documents/Java_tutorials 까지는 프로젝트 디렉토리이다.

/src 는 프로젝트 디렉토리 하위에 존재하는 소스코드를 저장하는 디렉토리이다.

/org/opentutorials/javatutorials/object 이것이 패키지 디렉토리이다.

/ClaculatorDemo3.java 이것은 클래스이다.

즉, 패키지는 일종의 클래스를 담아주는 디렉토리라고 보아도 된다.

만약 같은 1번 패키지 안에 A,B 클래스가 있다고 할때 B클래스에서 A클래스를 인스턴스화를 시켜 호출 한다고 하면

문제가 일어나지 않지만 2번 패키지 C클래스에서 1번 패키지 A클래스를 호출한다고 하면 오류가 발생한다.

그러나 다른패키지의 클래스를 '수입' 을 하여 사용할 수 있게 해주는 기능이 있는데 그것이 'import'이다.
```
package org.opentutorials.javatutorials.2번패키지.C클래스; 
```
이런식으로 패키지의 형태가 있을것이다 그곳에 import를 사용해 1번 패키지도 사용할수 있는 코드를 써보면
```
package org.opentutorials.javatutorials.2번패키지.C클래스; 
import org.opentutorials.javatutorials.1번패키지.*;
```
이런식으로 만들어 준다면 1번패키지 속에있는 모든 클래스를 C클래스에서 수입해 사용할수 있게 된다.

(* 표시 대신 클래스이름을 사용한다면 원하는 클래스만을 가져올수 있다.)

## 중복의 회피

우리느 이 패키지가 클래스간 이름의 중복을 회피시키는데 사용할 수 있다고 했다 그럼에도 불가능 할수 있는데

만약 1,2 패키지가 있고 둘다 A라는 클래스가 있는데 3 패키지에서 1,2에서 *을 사용해 import 하고 있고

3패키지에 있는 클래스에서 A를 인스턴스화 하려하지만 시스템은 어떠한 A클래스를 사용해야 할지 몰라 오류가 

발생한다. 

해결방안은 하나 , import org.opentutorials.javatutorials.1번패키지.*; 의 뒤쪽에 별을 

구체적으로 어떠한 클래스를 사용할 것인지 명시해준다

둘, 혹은 인스턴스화 시키는 코드에 명시해준다.
```
public static void main(String[] args) {
		
		org.opentutorials.javatutorials.1번패키지.A a = new org.opentutorials. javatutorials.1번패키지.A();
	}
```

## 참고

[생활코딩](https://opentutorials.org/course/1223/5531)


