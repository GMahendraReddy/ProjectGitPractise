package Inheritance;

class Teacher{
	
	static void add(){
		
		int a = 50;
		System.out.println(a);
		
	}
	void sub(){
		int v = 10;
		int d = 11;
		int f = v-d;
		System.out.println(f);
	}
	
}

public class Child extends Parent {

	public static void main(String[] args) {
		
		int b= 20; 
		System.out.println(b);
		mul(1);
		Child c1 = new Child();
		c1.mul();
		
		

	}

}
