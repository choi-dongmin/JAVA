# Stack & Queue

## Stack

- 스택은 하나의 데이터의 저장소이다. 마치 컵에 우유를 따르면 우리가 마시게 되는 부분은 가장 윗 부분 부터 마시듯, 가장 마지막에 저장된 데이터를 제일 먼저 꺼내게 된다.

```
|	4	 |	-> 가장 먼저 저장된 값은 1 이지만, 값을 불러올때 
|	3	 |		가장 먼저 불러오는 값은 가장 마지막에 저장된
|	2	 | 			4 이다.
|	1	 |		(Last in First out : LIFO)
|________|

```
* 배열을 Stack 으로 구현하는것이 Queue 보다 더 바람직 하다 왜냐하면 배열은 순차적으로 데이터가 입력되고 삭제를 할시에 앞에서 부터 삭제를 하면 데이터의 이동이 생기기 때문에 뒤에서 부터 데이터를 받는 Stack 으로 하는것이 바람직 하다.

이러한 stack 에 데이터를 저장하는 행위를 1. Push 라고 하고 저장한것을 빼는 행위를 2.Pop 이라고 한다.

- Stack 의 메소드


Boolean empty() : Stack이 비어있는지 알려준다.(T Empty / F Not Empty)

Object peek() : Stack 의 맨 위 저장객체를 반환(단, pop 과 달리 Stack 에 저장객체가 그대로 있는다.)

Object pop() : Stack 의 맨 위 저장객체를 꺼냄(Stack이 비어 있을시 EmptyStackException 발생)

Object push(Object item) : Stack 의 맨 위 객체를 저장 

int search(Object o) : Stack에서 주어진 객체(o)를 찾아 그 위치를 반환. 못찾으면 -1을 반환 (배열과 달리 1부터 시작)

```
public static void main(String[] args) {
	Stack st = new Stack();

	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	

	while(!st.empty()) {
		System.out.println(st.pop());
			
	}			
}

결과값 : 4,3,2,1
```

### 활용
```
	public static void main(String[] args) {
		//괄호개수 확인
		Stack st = new Stack();
		String str = "((3+5)*8-2)";
		
		System.out.println("Expression : "+ str);
		try {
			for(int i = 0; i <str.length(); i++) { // str 의 문자열을 하나씩 ch 에 넣어 ( 를 만나면 st에 push하고 )를 만나면 st에서 pop 한다.
				char ch = str.charAt(i);
				if(ch == '('){
					st.push(ch);
				}else if(ch == ')') {
					st.pop();
				}
			} 
			
			
			if(st.size() == 0) { // stack에 객체가 없는지 확인 후 출력.
				System.out.println("괄호의 개수가 일치합니다.");
			}else
				System.out.println("괄호의 개수가 불일치 합니다.");
		} catch(EmptyStackException e) {
			System.out.println("괄호의 개수가 불일치 합니다."); // ) 괄호가 더 많을시.
		}
	}

}
```


## Queue

- Stack 과는 다르게 가장 먼저 들어간 값이 가장 먼저 나오는 데이터 저장소 이다.

```

|	4	 |	-> 가장 먼저 저장된 값은 0 이고, 값을 불러올때 
|	3	 |		가장 먼저 불러오는 값은 먼저 저장된
|	2	 | 			0 이다.
|	1	 |		(Fast in First out : FIFO)
|	0	 |

```

이러한 queue 에 데이터를 저장하는 행위를 1. offer 라고 하고 저장한것을 빼는 행위를 2.poll 이라고 한다.

- Quque 의 메소드



Boolean add(Object o) : 지정된 객체를 Queue 에 추가 한다. 성공하면 True 를 반환하지만 실패 하면 iliegalstateException 발생

Object remove() : queue 의 저장객체를 반환. 비어있으면 NoSuchElementException 발생

Object Element() : 삭제가 없이 Queue의 요소를 읽어낸다. 비어있으면 NoSuchElementException 발생

boolean offer(Object o) : queue에 객체를 저장 성공시 T/ 실패시 F

Object poll() : queue 에서 객체를 꺼내 반환. 비어있으면 null 반환 

Object peek() : 삭제가 없이 Queue의 요소를 읽어낸다. 비어있으면 null 반환


* Stack 과 다르게 Queue는 Interface 임으로 queue 가 포함된 다른 클래스를 객체생성을해 사용한다.


```
public static void main(String[] args) {
	Queue q = new LinkedList();

	q.offer(1);
	q.offer(2);
	q.offer(3);
	q.offer(4);
	

	while(!q.isEmpty()) {
		System.out.println(q.poll()));
			
	}			
}

결과값 :1,2,3,4
```
### 활용
```
public class Queue_01 {
	static final int max = 5;			// 최근 입력한 값을 출력할 것인데 Max 값은 5이다
	static Queue q = new LinkedList();	// Queue 는 인터페이스이기 때문에 LinkedList 를 이용했다.
	
	
	public void save(String input) {			// 사용자가 입력한 값을 저장하는 코드, 매개변수 문자열 input을 받고있다. 
		if (!input.equals("")&& input != null)	// 매개변수가 ""와 null이 아닐때 q.offer(input) 실행
			q.offer(input);				
			
		if (q.size() > max)
			q.remove();					// q 의 사이즈가 max 를 넘어가면 가장 먼저 입력된값 삭제 
	}
	
	
	
	public static void main(String[] args) {
		Queue_01 Q = new Queue_01();
		
		System.out.println("help 를 입력하세면 도움말이 나옵니다.");
	
		while(true) {							// 사용자가 끝낼때까지 반복
			System.out.print("\n입력해 주세요 :");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine().trim();	//input 에 값입력 .trim() 앞뒤의 공백을 제거 
			Q.save(input); 							// save 메소드에 매개변수에 input 값을 주고있다.
			
			if(input.equalsIgnoreCase("q") ) {		// q 입력시 종료
				System.exit(0);
				
			} else if(input.equalsIgnoreCase("help")) {				// help 입력시 도움말 
				System.out.println("\nhelp - 도움말을 보여줍니다.");
				System.out.println("\nq 또는 Q - 시스템을 종료합니다.");
				System.out.println("\nhistory - 최근에 입력한 명령어를 " + max + "개를 볼 수 있습니다.");
				
			}else if (input.equalsIgnoreCase("history")) {	// history 입력시 최근 5개의 입력값 출력
				LinkedList list = (LinkedList)q;			// 참조변수의 타입은 Queue를 가지지만 LinkedList가 객체로 선언했기때문에 형변환의 형태를 LinkedLuist 의 형태로 가능하다. 
				
				for(int i = 0; i <list.size(); i++) {				// 출력코드 list.get(i)로 list 저장된 값을 순차적으로 나타내고 있다.
					System.out.print((i+1)+". "+list.get(i)+"\n");
				}
			}else {
				continue;
			}	
		}
	}
}
```
## 키워드

1. Stack : 데이터의 저장소로 가장 늦게 넣은 값이 가장 먼저 나오는 형태이다. (LIFO)

2. Queue : 데이터의 저장소로 가장 처음에 들어간 값이 가장 처음으로 나오는 형태이다.(FIFO)

## 참고
[남궁성 유튜브](https://www.youtube.com/watch?v=ktvhRSRohR4&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=122)
