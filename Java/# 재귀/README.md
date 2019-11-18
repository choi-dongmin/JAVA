# 재귀

재귀란 다시 돌아간다는 뜻으로 method에서 return을 사용하여 다시 자신의 method를 불러오는 코드를 뜻한다.


이 함수로 factorial을 구하여 보자

```
public class Jegue{
	
	public static int factorial(int i){
	if (i==1) {
		return 1;
	} else{
		return factoriasl*factorial(i-1);
	  }
	}  
	public static void main (String[] args){
		System.out.println(factorial(5));
	}
}
```
위와 같은 함수를 주게 되면 인자 5를 받아 else return에서 좌변의 현재 factorial 값 
5* 를 남겨둔 채로 다시 factorial 메소드를 인자 -1을 적용한 채에서 시작한다 그런식으로
4,3,2,1 까지 반복하면 if then 을 발동 시켜 1을 곱하여 주게 된다.

그럼 이러한 재귀를 통해 제곱을 구하여 보자.

``` 
public class Seng {
	
	public static int seng(int i){
	if (i == 0) {
		return 1;
	} else {
		return 2*seng(i-1);
	  }
	}
	public static void main(String[] args) {
		system.out.println(seng(8));
	}
}
```

위 코드는 2의 8제곱을 구하는 값이다. 기본적인 구성은 계승을 구하는 코드와 같다. 하지만 else return 에서 2*를 남겨주는 행동을 8 반복해주고 인자가 0이 되면 *1을 해줌으로 2의 8제곱이 된다.   