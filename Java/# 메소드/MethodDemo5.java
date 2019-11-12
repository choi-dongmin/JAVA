package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

	public static String numbering(int limit, int init) {
		int i = init;
		String output = ""; //숫자를 화면에 출력하는 대신 output 에 넣기위해 써주었다. 
		while (i < limit) {
			output += i; 	//output = output + i
			i++;
		}
		return output; 		// 뒤에 어떤 메소드가 오든 정지시키고 그 뒤에 오는 값을 메소드 값으로한다 = return
	}
	
	public static void main(String[] args) {
		String result = numbering(5,1); //return이 되었기 때문에 변수 result = numbering(5,1);[1234]
		System.out.println(result);
	}// void가 method 앞에 붙게 되면 이 메소드의 리턴값은 없는거다라고 해준다. 그렇기 때문에 result에 넣어준것이다.

}
