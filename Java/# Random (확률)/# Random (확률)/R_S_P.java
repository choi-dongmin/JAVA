package org.opentutorials.javatutorials.note;

import java.util.*;


class RSP {
	static String [] obj = {"가위","바위","보"};
	static String obj2 = ("가위, 바위, 보");
	static String input;
	static String random_output;
	static int end_count = 5;
	static int w_count = 0;
	static int l_count = 0;
	static int d_count = 0;
	
	private void win_count() {
		this.w_count++;
		this.end_count--;
	}
	
	private void loss_count() {
		this.l_count++;
		this.end_count--;
	}
	
	
	private void welcom () {
		System.out.println("안녕하세요! 저는 꾀돌이에요. \n");
		System.out.println("우리 " +obj2+" 게임할까요? \n");
	}

	private void start () {
		System.out.println(obj2+" 이 중에서 한가지를 입력해주세요.");
		
		
		
	}
	private void scan () {
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		Runing();
	}
	

	
	private void Runing () {
		if(input .equals("가위") || input .equals("바위") || input .equals("보")) {
			System.out.println("사용자 : " + input +"\n");
			System.out.print("꾀돌이 : ");
			RPS_System();
			output();
			
		} else {
			System.out.println("잘못된 입력입니다 : " + this.input+"\n");
			System.out.println("다시 " + obj2 + "중 하나를 입력하세요.");
			scan();
			Runing();
			
		}
	}
	
	private void rebye() {
		System.out.print("다시 한번 더! \n");
	}
	

	
	private void RPS_System() {
		Random RPS = new Random();
		int i = RPS.nextInt(obj.length);
		this.random_output = obj[i];
		System.out.println(obj[i]+"\n");
		
		
	}
	
	private void re_or_end () {
		if (this.end_count == 0) {
			System.out.println("모두 끝났어요 결과는 승 | "+ w_count +" 패 "+ l_count +" 무 "+d_count+" |");
			System.exit(0);} else {
				System.out.println("가위, 바위, 보 중에서 다시 입력하세요.");
				scan();
			}
		}	
	

	private void output() {
		
		if(input .equals(random_output)) {
			System.out.println("비겼네요.. ");
		
			this.d_count++;
			this.end_count--;
			System.out.println("\n 남은 게임 : "+ end_count+"\n");
			re_or_end ();
			
		} else if (input .equals(obj[0]) &&  obj[1] .equals(random_output)){
			System.out.println("이런.. 졌어요  결과 <가위 : 바위> ");
			loss_count();
			System.out.println("\n남은 게임 : "+ end_count+"\n");
			re_or_end ();
			
			// 가위 : 바위
		} else if (input .equals(obj[0]) && obj[2] .equals(random_output)){
			System.out.println("와우! 이겼어요! 결과 <가위 : 보> ");
			win_count();
			System.out.println("\n남은 게임 : "+ end_count+"\n");
			re_or_end ();
			
			// 가위 : 보
		} else if (input .equals(obj[1]) && obj[2] .equals(random_output)) {
			System.out.println("이런.. 졌어요 결과 <바위 : 보 > " );
			loss_count();
			System.out.println("\n남은 게임 : "+ end_count+"\n");
			re_or_end ();
			
			// 바위 : 보 
		} else if (input .equals(obj[1]) && obj[0] .equals(random_output)) {
			System.out.println("와우! 이겼어요! 결과 <바위 : 가위> ");
			win_count();
			System.out.println("\n남은 게임 : "+ end_count+"\n");
			re_or_end ();
			
			// 바위 : 가위
		} else if (input .equals(obj[2]) && obj[0] .equals(random_output)) {
			System.out.println("이런.. 졌어요 결과 <보 : 가위> ");
			loss_count();
			System.out.println("\n남은 게임 : "+ end_count+"\n");
			re_or_end ();
			
			// 보 : 가위
		} else if (input .equals(obj[2])  && obj[2] .equals(random_output)) {
			System.out.println("와우! 이겼어요! 결과 <보 : 바위> ");
			win_count();
			System.out.println("\n남은 게임 : "+ end_count +"\n");;
			re_or_end ();
			
			// 보 : 바위
		}
	}
	
	
	

	public void RUN()	{
		welcom ();
		start();
		scan();
		
		}
	}





public class R_S_P {

	public static void main(String[] args) {
		
		RSP run = new RSP();

		run.RUN();
	}

}
/*

사용자로부터 입력 받은 문자열이 "가위", "바위", "보" 중 하나가 아니라면 "잘못 입력하셨습니다" 라는 문구를 출력 후, 재입력 받는다.

컴퓨터는 반드시 "가위", "바위", "보" 3 가지 중 하나를 출력한다.

총 5판을 진행하며, 매 판의 결과는 승리, 무승부, 패배 중 1 가지 이다.

5판이 끝나면, 최종 결과를 출력하고 프로그램을 종료한다. 

*/
