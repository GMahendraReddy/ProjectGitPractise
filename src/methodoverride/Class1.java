package methodoverride;


class parent{
	
	 void add() {
		 System.out.println("parent");
		 
		
	}
}

public class Class1 extends parent{
	
	
	 void add() {
		 super.add();
		
		 System.out.println("child");
	 }

	public static void main(String[] args) {
		
		Class1 c = new Class1();
		c.add();
	

	}

}
