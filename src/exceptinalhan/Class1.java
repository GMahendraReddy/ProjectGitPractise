package exceptinalhan;

public class Class1 {

	public static void main(String[] args) {
		
		int a =10; int b = 0;
//		System.out.println(a/b);
		try{
			int c = a/b;
		}
		catch(ArithmeticException a1) {
			System.err.println("I am in catch");
		}
		

	}

}
