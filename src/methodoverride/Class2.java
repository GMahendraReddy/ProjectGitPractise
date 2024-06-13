package methodoverride;


class parent12{
	
	void add() {
		
		
		System.out.println("parent");
	}
}

public class Class2 extends parent12{
	
	void add() {
		super.add();
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		Class2 c = new Class2();
		
c.add();
	}

}
