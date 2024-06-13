package Abstract;

abstract class Fb{
	abstract void us();
	abstract void pwd();
}
abstract class Google extends Fb{
	abstract void us1();
	abstract void pwd1();
}



public class Zoom extends Google{

	public static void main(String[] args) {
		Zoom z = new Zoom();
		z.us();
		z.us1();
		z.pwd();
		z.pwd1();

	}

	
	void us1() {
		System.out.println("G usr");
		
	}

	
	void pwd1() {
		
		System.out.println("G pwd");
	}

	
	void us() {
		
		System.out.println("F usr");
	}

	
	void pwd() {
		System.out.println("F pwd");
		
	}

}
