# 컬렉션 프레임웍

- 우리는 배열을 사용하면서 우리가 사용하려 하는 데이터가 몇개의 데이터인지 



1. 컬렉션 (collection)
- 여러 객체(데이터)를 모아 놓은것을 의미


2. 프레임웍 (framwork)
- 표준화, 정형화 된 체계적인 프로그래밍 방식 그로인해 생산성이 증대하고 유지보수가 용이해졌다.

## 컬렉션 프레임웍 (collection framwork)
- 컬렉션 (다수의 객체)를 다루기 위한 프레임웍
- 즉, 컬렉션을 쉽고 편리하게 다룰수 있는 클래스를 제공한다.

## 컬렉션 프레임웍의 핵심 인터페이스
- List, Set, Map

## List
- 배열의 단점을 보완하기 위해 사용되는 컬렉션 프레임웍.
- 순서가 있는 데이터의 집합 (데이터의 중복을 허용한다.)

Ex 대기자 목록 (순서도 있고 이름이 겹칠수 있다.)

- List 의 인터페이스 
1. ArrayList
2. LinkedList

### ArrayList

- List를 구현함으로 저장순서가 유지되고 중복이 허용된다.
- 데이터의 저장 공간으로 Array(배열)을 사용한다.

1. .add();

- 미리 선언한 배열안에 데이터를 집어넣는다.

```
int [] answer = {2,1,1,4,3,5};
		int j = 0;
		ArrayList list = new ArrayList(answer.length);
		
		for(int i = 0; i < answer.length; i++) { 
			if (j == answer[i]) 
			{
				continue;
			} else {
				
				list.add(answer[i]);
				j = answer[i];
			}
		}

* Array list에 answer 값을 집어넣으면서 같은 값은 제외한다.
```
- .add() 의 활용

만약 list.add(x,y); 와 같은 형식이라면 x 는 index, y는 데이터가 된다.

그럼으로 list 의 x 인덱스에 y 라는 값을 저장하고 후위에 있는 데이터는 한칸씩 밀려나게 된다.

```
int A [] = {1,2,3}; 
A.list(0, "aa");
System.out.println(A);

결과값 : [aa , 1, 2, 3]
```
2. .set();

A.set(0, "a"); 이와 같은 형태일시 A 배열에 0번째 인덱스에 a로 치환한다 라는 뜻이다.

```
int A [] = {aa,1,2,3}; 
A.set(0, "b");
System.out.println(A);

결과값 : [b , 1, 2, 3]

```
3. .Collections.sort()

- Arrays.sort() 와 마찬가지로 Collections 으로 선언된 데이터를 오름차순 정렬시킨다.

```
Collections.sort(list);					 
System.out.println(list);
```

4. .sublist()

- B 의 배열을 만들고 그 값은 A의 X부터 Y까지 (Y 불포함)

```
int A [] = {1,2,3,4,5};
ArrayList B = new ArrayList(A.subList(0, 3));
System.out.println(B);

결과값 :[ 1,2,3 ]
``` 

5. .containsAll()

- B 의 값이 A에 포함되어 있는지 참/거짓으로 나타낸다.

```
int A [] ={1,2,3,4,5};
int B [] ={2,3,4};
System.out.println(A.containsAll(B));

결과값 : True 
```

6. .indexOf()

- .indexOf() 는 ()안에 포함된 데이터의 인덱스 번호가 몇번인지 출력하는 프로그램이다.

```
int A [] ={1,2,3,4,5};
System.out.println(A.indexOF(3));

결과값 : 2
```

7. .retainAll()

.retainAll() 은 두 배열의 교집합이 되는 부분만 남기고 나며지는 삭제한다는 뜻이다.

정상 실행되었다면 true 를 출력한다.

```
int A [] ={1,2,3,4,5};
int B [] ={2,3,4,5,6};
System.out.println(A.retainAll(B));
System.out.println(A);

결과값 : true 
		 [ 2,3,4,5 ]
```

8. .contains()

()안에 있는 list와 대상의 list를 비교해 T/F 로 나타낸다.

```
		int A [] = {1,2,3,4,5}
		int B [] = {a,1,2,3,a}

		for(int i = B.size()-1; i>=0; i-- ) {
			if(A.contains(B.get(i))) {;
				B.remove(i);
			}
		}
		System.out.print(B);
```  
위 코드는 contains 로 만약 A에 list에 포함된 B list index 값이 있을경우 그것을 삭제시키는 즉, A와 B에 교집합이 있다면 B의 교집합 부분을 삭제하는 코드이다. 

### LinkedList


-배열의 장/단점

장 :배열의 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근시간, Access time)이 짧다. 

단 1: 크기를 변경 할 수 없다.(크기를 변경해야하면 새로운 배열 생성후 데이터 복사해야함 : 참조변경)

단 2 : 비 순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.

위와같은 배열의 단점을 보완하기 위해서 나온것이 LinkedList 이다.

- LinkedList 는 불연속적인 데이터를 연결 시킨다.
	: 데이터 들은 하나의 데이터가 하나의 객체적인 주소를 같는다(기차처럼 연결). 

	그렇기에 단 한번의 참조 변경만으로 데이터의 삭제가 가능하다.

	데이터 추가를 하고 싶다면 두번의 참조변경으로 가능 

- 그러나 불연속적 데이터이기 때문에 접근성이 나쁘다. (그렇기 때문에 더블리 링크드 리스트(앞뒤연결) 을 통해 해열하였다.)
```
 _____	     _____	  _____	       _____
|__0__| ->  |__1__|  ->  |__2__|  ->  |__3__|
	
*LinkedList 의 형태

 _____ _____ _____ _____
|__0__|__1__|__2__|__3__|

* 배열의 형태
```

## 키워드
컬렉션 : 다수의 객체(데이터)를 모아놓은것을 의미.

프레임웍 : 표준화 된 체계적인 프로그래밍 방식.

컬렉션 프레임웍 : 다수의 객체를 다루기 위한 프로그래밍 방식.

list : 배열의 단점을 보완하기 위해 사용되는 컬렉션 프레임웍.

Linked : 각각의 객체가 주소를 가진 불연속적인 데이터를 하나의 기차처럼 연결시킨다.

## 참고
[남궁성 유튜브](https://www.youtube.com/watch?v=_2e-cgwMOyc&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=120) 

