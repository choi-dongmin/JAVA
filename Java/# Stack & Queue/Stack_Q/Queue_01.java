package Stack_Q;

import java.util.*;

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
