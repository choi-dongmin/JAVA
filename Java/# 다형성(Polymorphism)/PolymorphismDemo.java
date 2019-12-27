package org.opentutorials.javatutorials.polymorphism;

class O { //overloding

 	public void a(int param){
 		System.out.println("숫자출력");
 		System.out.println(param);
 	}
 	public void a (String param){
 		System.out.println("문자출력");
 		System.out.println("param");
 	}
 }

 public class PolymorphismDemo {

 	public static void main(String[] args){
 	O o = new O();
 	o.a(1);
 	o.a("one");
 	}
 }