# 배열(Array)

배열은 연관된 정보를 그룹화 하는데 사용한다. 수많은 데이터들 중에서 연관된 데이터들을 그룹화하여 관리하기 위하 사용하는 데이터타입을 배열이라고 한다. 변수가 한개의 데이터를 저장하기 위한것이라면 배열은 여러 개의 데이터를 저장하기 위한것 이다.

## 배열의 생성
```
package org.opentutorials.javatutorials.array;

public class DefineDemo {

	public static void main(String[] args) {
		String[] classgroup = {"최진혁","한유빈","한이람","이고잉"} ;
	}

}
```

위 예제에서 String[] classgroup 을 보자 문자열을 데이터 타입 String으로 변수 classgroup은 문자열이라는 걸 알수 있다 그렇다면 처음 보는것이 하나 있는데 바로String뒤에 오는 [] 이다 []는 배열을 준다는 뜻이다 만약[]가 없다면 그것은 배열이 아닌 문자열 데이터이다.
그럼으로 classgroup에 담긴 배열은 문자열의 데이터타입을 가진 데이터의 모임이다.

```
package org.opentutorials.javatutorials.array;

public class GetDemo {

	public static void main(String[] args) {
	String[] classgroup = {"최진혁","최유빈","한아람","이고잉"};
		System.out.println(classgroup[0]);
		System.out.println(classgroup[1]);
		System.out.println(classgroup[2]);
		System.out.println(classgroup[3]);
	}

}
```
위 코드는 데이터를 출력하는 예제이다. 이전 예제에서 보았듯 String[] classgroup = {"최진혁","최유빈","한아람","이고잉"}으로 배열을 지정해 주었고. 출력하는 코드 System.out.println(classgroup[0]);으로 출력하는데 classgroup[?] ?의 숫자에 따라 출력값이 달라진다. 배열을 지정한 곳에서 보면 "최진혁","최유빈","한아람","이고잉" 이라는 각각의 원소가 있는데 처음부터 순서대로 0 1 2 3 의 Index가 자동으로 부여된다. 

그래서 위 예제의 결과는
```
최진혁

최유빈

한아람

이고잉
```

이 출력된다

```
package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		String[] classgroup = new String[4];
			classgroup[0] = "최진혁";
				System.out.println(classgroup.length);
			classgroup[1] = "최유빈";
				System.out.println(classgroup.length);
			classgroup[2] = "한아람";
				System.out.println(classgroup.length);
			classgroup[3] = "이고잉";
				System.out.println(classgroup.length);
		}

}
```
위 예제는 각각의 Index에 각각 원소를 부여하고 있다 하지만 우리가 봐야 할것은 배열을 설정하는 코딩과 .length이다. 우선 배열코딩을 보면 string뒤에 숫자를 보면 [4]이다(new는 차후에 따로 배운다) 저기 있는 []의 값은 배열에 원소가 들어갈 수 있는 총개수를 뜻한다. .length 는  배열에 원소가 들어갈 수 있는 총개수를 뜻한다 다시말해 []의 값과 같은 값을 출력한다.

## 배열의 사용

배열과 반복문을 이용해서 학생들이 상담받았다는 내용을 코딩해보자. 

실생활에서 상담을 받는다고 하면
```
1반 학생들을 번호순으로 정렬해서 줄을 세운다.
상담받은 학생의 숫자를 기록한다.
대기중인 학생과 상담을 한다.
상담받은 학생의 수를 1 증가시킨다.
총원보다 상담받은 학생의 수가 작다면 3번 절차로 돌아간다.
총원과 상담받은 학생의 수가 같다면 상담을 종료하고 업무를 계속한다.
```

이런식으로 진행될것이다 이것을 코드로 그대로 옮기면
```
package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] Members = {"최진혁","최유빈","한아람"};
		for(int a=0; a<Members.length; a++) {
			String Member = Members[a];
			System.out.println(Member+". 이 학생은 상담을 받았습니다.");
		}
	}

}
```
우선 배열Members은 문자열의 형태를 가지고 있다. 그리고 for는 a변수를 0으로 만들고 a가 Members의 원소의 최대값보다 작을때 반복하며 a를 1씩 증가시킨다.

그다음 Member라는 변수는 Members[a]이며 그것을 토대로 Member+". 이 학생은 상담을 받았습니다." 라는 문구를 출력한다.

여기서 중요한건 Member = Mermbers[a]인데 반복문이 실행되면서 1씩 증가함으로 원소의 Index를 활용해 배열과 반복문을 잘 사용한예제이다.

## for-each

 array와 for를 사용할때 좀 더 효율적으로 사용할수 있게 만든것 이다.
```
 package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"최진혁","최유빈","한아람"};
		for(String a : members)
			System.out.println(a + ". 이 학생은 상담을 받았습니다.");
	}

} 
```

우리가 주목해야 할건 for(String a : members) 이것이다. 이것은 : 뒤쪽에 오는 array에 담긴 값을 반복문이 실행 될때마다 a라는 변수에 담아주는 것을 뜻한다.

## 참조

[생활코딩](https://opentutorials.org/course/1223/5373)

