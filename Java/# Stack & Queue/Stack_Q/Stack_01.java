package Stack_Q;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_01 {

	public static void main(String[] args) {
		//��ȣ���� Ȯ��
		Stack st = new Stack();
		String str = "((3+5)*8-2)";
		
		System.out.println("Expression : "+ str);
		try {
			for(int i = 0; i <str.length(); i++) { // str �� ���ڿ��� �ϳ��� ch �� �־� ( �� ������ st�� push�ϰ� )�� ������ st���� pop �Ѵ�.
				char ch = str.charAt(i);
				if(ch == '('){
					st.push(ch);
				}else if(ch == ')') {
					st.pop();
				}
			} 
			
			
			if(st.size() == 0) { // stack�� ��ü�� ������ Ȯ�� �� ���.
				System.out.println("��ȣ�� ������ ��ġ�մϴ�.");
			}else
				System.out.println("��ȣ�� ������ ����ġ �մϴ�.");
		} catch(EmptyStackException e) {
			System.out.println("��ȣ�� ������ ����ġ �մϴ�."); // ) ��ȣ�� �� ������.
		}
	}

}
