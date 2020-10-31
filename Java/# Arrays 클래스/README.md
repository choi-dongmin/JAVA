# Arrays 클래스

Arrays 는 배열에 관련된 메소드들을 모아놓은 클래스이고 import 를 통해 사용해야한다.

## 주요 메소드

1. Arrays.toString(), Arrays.deeptoString()

() 안에 배열의 이름을 넣으면 배열이 String 으로 변환한다.

```
int [] arr = {0,1,2,3,4};
int [][] arr2D = {
					{11,11,11},
					{22,22,22},
					{33,33,33}
				 };
System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4]
System.out.println(Arrays.deeptoString(arr2D)); // [[11,11,11], ...]
```

2. Arrays.equals(), Arrays.deepEquals()

()안쪽에 배열의 비교하고 싶은 이름들 (arr. arr1) 을 넣어주면 두 배열이 일치하는지 ture false 로 나탄낸다.
```
String [][] arr2D = {
						{"AAA"}
						{"BBB"}
						{"CCC"}
			  		};

String [][] arr2dee = {
						{"AAA"}
						{"BBB"}
						{"CCC"}
				 	};
System.out.println(Arrays.equals(arr2D, arr2dee)); //false(2차원 배열이라서)
System.out.println(Arrays.deepEquals(arr2D, arr2dee)); 
// ture
```

3. Arrays.copyOf(), Arrays.copyOfRange()

배열을 복사할 수 있는 메소드. () 안에 배열의 이름과 정수값을 넣음으로 지정된 복사를 할 수 있다.

```
int [] arr = {0,1,2,3,4};
int [] arr2 = Arrays.copyOf(arr, 2) // {0,1};
int [] arr3 = Arrays.copyOf(arr, arr.length); // {0,1,2,3,4}
int [] arr4 = Arrays.copyOf(arr, 6); // {0,1,2,3,4,0} 범위를 벗어난 값은 기본값 처리
int [] arr5 = Arrays.copyOfRange(arr, 0,5); // {0,1,2,3} [5]값은 불포함
int [] arr6 = Ararrys.copyOfRange(arr, 0,6); // {0,1,2,3,4,0} 범위를 벗어난 값은 기본값 처리 

``` 

4. sort();

배열을 오름차순으로 정렬하는 기능

```
int [] arr = {5,4,2,1,3};
System.out.println(Arrays.sort(arr));
```

##
1. .toString(), .deeptoString() : () 안의 배열읠 String 값으로 조정

2. .equals(), .deepEquals() : 두개의 배열을 비교해 ture,false로 나타냄

3. .copyOf(), .copyOfRagne() : 배열을 복사해 새로운 배열을 만듦

4. .sort() : 배열의 오름차순 정렬

## 참고 
[남궁성](https://www.youtube.com/watch?v=N0zXNFPA8G8&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=49)
