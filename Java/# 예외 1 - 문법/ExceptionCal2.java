package org.opentutorials.javatutorials.exception;
class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
      try{
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
      } catch(Exception e){
      	System.out.print("\n\ne.getMessage"+ e.getMessage());
      	System.out.print("\n\ne.toString()\n"+e.toString());
        System.out.print("\n\ne.printStackTrace()");
        e.printStackTrace();
      
       }
	} 
}
public class ExceptionCal2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}   