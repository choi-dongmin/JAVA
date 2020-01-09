package org.opentutorials.javatutorials.exception;

class A1{
	private int[] arr = new int[3];
	A1(){
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}

	public void z(int first, int second){
	        try {
	            System.out.println(arr[first] / arr[second]);
	        } catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("ArrayIndexOutOfBoundsException");
	        } catch(ArithmeticException e){
	            System.out.println("ArithmeticException");
	        } catch(Exception e){
	            System.out.println("Exception");
	        } finally{
	        	System.out.println("finally");
	        }
	}
}

public class ExceptionDemoFinally {
	public static void main(String[] args){
	A a =new A();
	a.z(10,1);
	a.z(1.0);
	a.z(2.1);
	}
}