package Collection_Framwork;

import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) {
		int [] answer = {2,1,1,4,3,5};
		int j = 0;
		ArrayList list = new ArrayList(answer.length);
		
		for(int i = 0; i < answer.length; i++) { //ArrayList�� answer ���� ����ִµ� ���� ���� �����Ѵ�. 
			if (j == answer[i]) 
			{
				continue;
			} else {
				
				list.add(answer[i]);
				j = answer[i];
			}
		}
		Collections.sort(list);					// Collections.sort �� �÷����� sort ��Ų�� (��������)
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list.subList(0, 3)); // sublist �� �÷����� �ε����� x to y �� �������°� 
		System.out.println("sublist = " + list2);
		
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2)); // containsAll �� x .containsall (y) y �� x �� ���ԵǾ� �ִ��� T/F �� ��Ÿ����.
		
		
		list2.add(3, "a");
		list2.add(0, "a");
		System.out.println(list2);
		
		list.set(3, "aa");
		System.out.println(list);
		
		System.out.print("indexOf �� ������ �ε����� ��ġ. Ex aa ��ġ list index�� : ");
		System.out.println(list.indexOf("aa")); 
		
		//list.remove(new Integer(1)); //remove�� int ���� 1 ��
		//list.remove(1);				 // index[1] �� ����� �ִ�.
		// System.out.println(list);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("retainAll : " +(list.retainAll(list2))); // retainAll�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("afterlist : " + list);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		for(int i = list2.size()-1; i>=0; i-- ) {
			if(list.contains(list2.get(i))) {;
				list2.remove(i);
			}
		}
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		/*  import java.util.*;
				
			class Solution {
			   ArrayList list = new ArrayList(numbers.length+1);
			   int sum;
						   
		    
		    public int[] solution(int[] numbers) {
		        Arrays.sort(numbers);
		        sum = 0;
		        
		        for(int i = 0; i < numbers.length; i++){
		            sum = numbers[i] + numbers[i+1]  ;
		            list.add(sum);
		            sum = 0;
		        }
		        
		        
		        
		        int[] answer = {sum};
		        return answer;
		    }
		} */
		    }

}

