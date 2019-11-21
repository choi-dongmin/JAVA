package org.opentutorials.javatutorials.classinstance;



class c1{
	static int sv = 1;
	int iv = 2;

	static void static_static(){
		System.out.println(sv);
	}	
	static void static_instance(){
		// System.out.println(iv); 불가능
	} 
	void instance_static(){
		System.out.println(sv);
	}		
	void instance_instance(){
		System.out.println(iv);
	}
}
	
public class classmemberdemo {
	
	public static void main(String[] args) {
		c1 c = new c1();
//		c.static_static(); // sm - sv 가능
//		c.static_instance(); // sm - iv 불가능 
//		c.instance_static(); //  im - sv 가능
//		c.instance_instance(); // im - iv 가능
//		c1.static_static();		// 클래스를 이용해 직접 sm - sm 가능
//		c1.static_instance();	// 
//		c1.instance_static();	// 클래스를 이용해 직접 sm - iv 불가능 : 아직 인스턴스가 없기때문
//		c1.instance_instance()  // 클래스를 이용해 직접 im- iv 불가능 : 아직 인스턴스가 없기때문
	}
}	