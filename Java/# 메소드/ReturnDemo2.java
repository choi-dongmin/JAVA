package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
	
	public static String [] strangerthing () {
		String [] members = {"엘", "더스틴", "윌리엄"};
		return members;
		
	}
	
	public static void main(String[] args) {
		String [] members = strangerthing();
		System.out.println(members[0]+" "+ members[1]+ " " + members[2]);
	}

}
	

