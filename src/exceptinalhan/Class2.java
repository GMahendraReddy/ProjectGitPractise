package exceptinalhan;

public class Class2 {
	
	public static void main(String[] args) {
		

		int a =10; int b = 0;
		int c = b/a;
		try {
			System.out.println(c);
			
		}
		catch(ArithmeticException b1) {
			System.out.println("I am in catch1");
		}
catch(NullPointerException b1) {
	System.out.println("I am in catch2");
		}
		finally {
			System.out.println("I am in finally");
		}
	}

}
