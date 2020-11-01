package Stack_Q;

import java.util.*;

public class Queue_01 {
	static final int max = 5;			// �ֱ� �Է��� ���� ����� ���ε� Max ���� 5�̴�
	static Queue q = new LinkedList();	// Queue �� �������̽��̱� ������ LinkedList �� �̿��ߴ�.
	
	
	public void save(String input) {			// ����ڰ� �Է��� ���� �����ϴ� �ڵ�, �Ű����� ���ڿ� input�� �ް��ִ�. 
		if (!input.equals("")&& input != null)	// �Ű������� ""�� null�� �ƴҶ� q.offer(input) ����
			q.offer(input);				
			
		if (q.size() > max)
			q.remove();					// q �� ����� max �� �Ѿ�� ���� ���� �ԷµȰ� ���� 
	}
	
	
	
	public static void main(String[] args) {
		Queue_01 Q = new Queue_01();
		
		System.out.println("help �� �Է��ϼ��� ������ ���ɴϴ�.");
	
		while(true) {							// ����ڰ� ���������� �ݺ�
			System.out.print("\n�Է��� �ּ��� :");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine().trim();	//input �� ���Է� .trim() �յ��� ������ ���� 
			Q.save(input); 							// save �޼ҵ忡 �Ű������� input ���� �ְ��ִ�.
			
			if(input.equalsIgnoreCase("q") ) {		// q �Է½� ����
				System.exit(0);
				
			} else if(input.equalsIgnoreCase("help")) {				// help �Է½� ���� 
				System.out.println("\nhelp - ������ �����ݴϴ�.");
				System.out.println("\nq �Ǵ� Q - �ý����� �����մϴ�.");
				System.out.println("\nhistory - �ֱٿ� �Է��� ��ɾ " + max + "���� �� �� �ֽ��ϴ�.");
				
			}else if (input.equalsIgnoreCase("history")) {	// history �Է½� �ֱ� 5���� �Է°� ���
				LinkedList list = (LinkedList)q;			// ���������� Ÿ���� Queue�� �������� LinkedList�� ��ü�� �����߱⶧���� ����ȯ�� ���¸� LinkedLuist �� ���·� �����ϴ�. 
				
				for(int i = 0; i <list.size(); i++) {				// ����ڵ� list.get(i)�� list ����� ���� ���������� ��Ÿ���� �ִ�.
					System.out.print((i+1)+". "+list.get(i)+"\n");
				}
			}else {
				continue;
			}	
		}
	}
}
