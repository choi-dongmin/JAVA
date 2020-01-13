package org.opentutorials.javatutorials.exception2;

import java.io.*;


class B{
	void run() throws FileNotFoundException, IOException{
		BufferedReader bReader=null;
		String input=null;
		System.out.println(input);
	}
}
class C{
	void run () throws FileNotFoundException, IOException{
		B b =new B();
	}
}
public class ThrowException {
	public void main(String[] args){
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일을 찾을수 없습니다." );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

