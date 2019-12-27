package org.opentutorials.javatutorials.polymorphism;

interface father{}
interface mother{}
interface worker{
		public void job();
}
interface neighborhood{}
interface aunt{}

class men implements father, worker, neighborhood {
	public void job(){
		System.out.println("Products Team");
	}
}
class women implements mother, worker, aunt {
	public void job(){
		System.out.println("Accounts Team");
	}
}

public class Company{
	public static void main(String [] args){
		worker employee1 = new men();
		worker employee2 = new women();

		employee1.job();
		employee2.job();
	}
}