# 2차원 배열

2차원 배열이란 테이블 형태(시트형태)의 배열을 입력하기 위한 배열이다.

	국어		수학		영어
1	100		100		100		
2	20		20		20
3	30		30		30
4	40		40		40

위의  데이터는 4행 3열의 데이터이다. 100,100,100 이것은 1차원의 배열이고 이 1차원의 배열이 여러개 있으면 2차원 배열이다.

## 2차원 배열의 선언
```
int [][] score = new int [4][3]; 

```

위의 코드는 [][] 2차원 배열 score 을 생성하는데 이 배열은 4행 3열 라는 의미와 같다.

그렇다면 인덱스는 어떠한 방식으로 입력해야 할까?

## 2차원 배열의 인덱스

만약 score 의 인덱스를 설명하자면 이러한 방식일 것이다.
```
score[0][0] score[0][1] score[0][2]
score[1][0] score[1][1] score[1][2]
score[2][0] score[2][1] score[2][2]
score[3][0] score[3][1] score[3][2]
```

위와 같은 인덱스의 값을 지정하고 싶다면 아래와 같이 할 수있다.

```
score [0][0] = 100;
```

## 2차원 배열의 초기화

일차원 배열과 마찬가지로 2차원 배열또한 초기화를 할수있다.

```
int score [][] = {{100,100,100}, {20,20,20}};
```

위와 같이 초기화 할 수 있다 그러나 조금 더 가시성이 좋도록 아래의 형태로 바꿀수 있다.

```
int score [][] = {
					{100,100,100}, 
					{20,20,20},
					{30,30,30},
					{40,40,40}
				};
``` 

위와 같이 2차원 배열(테이블)의 형처럼 만들어주면 가시성이 좋아진다.

그렇다면 만약 우리가 100,100,100 의 배열만 출력하고 싶다면 어떠한 코드를 써야할까?

```
System.out.println(Arrays.toString score[0]);
```

위 와 같이 입력을 한다면 [100, 100, 100] 이라는 결과값을 얻을 수 있다.

이말은 즉, 2차원 배열을 1채원 배열의 배열이라고 할 수 있다.

## 예제 
2차원 배열의 안의 수를 전부 더하는 코드를 작성해보자.

```
	public static void main(String[] args) {
		int sum = 0;
		int score [][] = {
				{100,100,100}, 
				{20,20,20},
				{30,30,30},
				{40,40,40}
			};
		

		
		for(int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
			}
		}
		System.out.println(sum);		
	}

```

2차원 배열을 출력할때는 공식과도 같이 중첩for문을 이용한다.

## 활용


Ex 01 국어,영어, 수학의 각과목별 총점과 배열별 총점을 구하는 방식.
```
	public static void main(String[] args) {
		int sum = 0, kortotal = 0, engtotal=0, mathtotal = 0, avg = 0;
		
		int score [][] = {
				{100,100,100}, 
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};

		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==========================");
		for(int o = 0; o < score.length; o++) {
			kortotal += score[o][0];
			engtotal += score[o][1];
			mathtotal += score[o][2];
		}
		
		
		for(int i=0; i < score.length; i++) {
			sum = 0;
			System.out.print(i+1);
			for(int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
				avg = sum / score[i].length;
			}
			
			for(int k = 0; k < score[i].length; k++) {
				System.out.printf("%5d", score[i][k]);
			}
			System.out.printf("%5d", sum);
			System.out.printf("%5d", avg);
			System.out.println();
		}
		System.out.println("==========================");
		System.out.printf("총점: %d %d %d", kortotal, engtotal, mathtotal );
			
	}

```
Ex02 문자를 입력받고 입력값이 배열의 값이랑 일치하는지 출력.
```
	public static void main(String[] args) {
		String input;
		String [][] stuff = {
								{"chair","의자"},
								{"computer","컴퓨터"},
								{"integer","정수"},
							};
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i < stuff.length; i++ ) {
			System.out.printf("Q%d. %s 의 뜻은?\n", i+1, stuff[i][0]);
			input = scan.nextLine();
			if(input .equals(stuff[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렷습니다. 정답은 %s 입니다.\n",stuff[i][1]);
			}
		}
	}
```
## 키워드 

1. 2차원 배열 = 1차원 배열의 배열 형태 즉, 테이블 형태의 배열을 2차원 배열이라고 한다.