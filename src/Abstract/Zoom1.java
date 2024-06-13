package Abstract;


abstract class Fb1{
	
	abstract void pwd();
}

 class Google2 {
	
	void usr() {
		
		System.out.println("G usr");
	}

	
}

public class Zoom1 extends Fb1{
	
	@Override
	void pwd() {
		System.out.println("usr");
		
	}

	public static void main(String[] args) {
		Zoom1 z1 = new Zoom1();
		z1.pwd();

	}

}
