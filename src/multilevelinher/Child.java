package multilevelinher;

class GP{
	
	static void GP1() {
		System.out.println("st GP");
	}
	void GP2() {
		System.out.println("non static GP");
	}
}

 class Parent extends GP{
	static void add1(int v) {
		int b = 10;
		System.out.println(v+b);
	
	}

	void sub1(String a){
		System.out.println(a);
		
	}
}

public class Child extends Parent {
	
	static void add(int a) {
		System.out.println("child static");
		
	}
	void sub() {
		System.out.println("child non static");
		
	}

	public static void main(String[] args) {
		add1(1);
		add(1);
		GP1();
		Child c1 = new Child();
		c1.GP2();
		c1.sub1("Mahi");
		c1.sub();
		
		
	}

}
