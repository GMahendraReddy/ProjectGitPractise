package LogicalOperators;

public class LogicalOpe {

	public static void main(String[] args) {
		int a = 10;
		int b= 20;
		if(a>5 && b > 15) {
			int c = a+b;
			System.out.println(c);
		}
		if(!(a>15 || b<50) ){
			System.out.println("true");
		}
		new LogicalOpe();
		

	}
	LogicalOpe()
	{
		System.out.println("constructor");
	}

}
