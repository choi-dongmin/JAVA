package org.opentutorials.javatutorials.object;

public class claculatorDemo2 {

		public static void sum (int L, int R){
			System.out.println(L + R);
		}
		
		public static void avg (int L, int R) {
			System.out.println((L+R)/2);
		}
		public static void main (String[] args){
		int L, R;
			L = 10; R = 40; 
				sum (L,R);
				avg (L,R);

			 L = 50; R =50;
				sum(L,R);
				avg(L,R);
		}
}