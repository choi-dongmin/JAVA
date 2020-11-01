package Stack_Q;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_01 {

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
