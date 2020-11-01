package Stack_Q;

import java.util.*;

public class Stack_Q_01 {
	
	
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);

		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		
		System.out.println("= Stack =");
		while(!st.empty()) {  // stack �� ����ִ��� Ȯ���ϰ� �ƴҽ� �ݺ�
			System.out.println(st.pop());
			
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) { // queue �� ����ִ��� Ȯ���ϰ� �ƴҽ� �ݺ�
			System.out.println(q.poll());
			
		}
			
	}
}


