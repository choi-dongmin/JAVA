package Collection_Framwork;

import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) {
		int [] answer = {2,1,1,4,3,5};
		int j = 0;
		ArrayList list = new ArrayList(answer.length);
		
		for(int i = 0; i < answer.length; i++) { //ArrayList에 answer 값을 집어넣는데 같은 값은 제외한다. 
			if (j == answer[i]) 
			{
				continue;
			} else {
				
				list.add(answer[i]);
				j = answer[i];
			}
		}
		Collections.sort(list);					// Collections.sort 는 컬렉션을 sort 시킨다 (오름차순)
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list.subList(0, 3)); // sublist 는 컬렉션의 인덱스를 x to y 로 가져오는것 
		System.out.println("sublist = " + list2);
		
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2)); // containsAll 은 x .containsall (y) y 가 x 에 포함되어 있는지 T/F 로 나타낸다.
		
		
		list2.add(3, "a");
		list2.add(0, "a");
		System.out.println(list2);
		
		list.set(3, "aa");
		System.out.println(list);
		
		System.out.print("indexOf 는 지정한 인덱스의 위치. Ex aa 위치 list index의 : ");
		System.out.println(list.indexOf("aa")); 
		
		//list.remove(new Integer(1)); //remove는 int 숫자 1 과
		//list.remove(1);				 // index[1] 을 지우고 있다.
		// System.out.println(list);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("retainAll : " +(list.retainAll(list2))); // retainAll은 겹치는 부분만 남기고 나머지는 삭제한다.
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

