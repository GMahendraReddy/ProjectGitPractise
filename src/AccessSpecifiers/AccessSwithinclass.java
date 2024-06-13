package AccessSpecifiers;

public class AccessSwithinclass {
	
	public void as1() {
		System.out.println("1");
	}
	private void as2() {
		System.out.println("2");
	}
	protected void as3() {
		System.out.println("3");
	}
	 void as4() {
		System.out.println("4");
	}

	public static void main(String[] args) {
		
		
		AccessSwithinclass a = new AccessSwithinclass();
		a.as1();
		a.as2();
		a.as3();
		a.as4();

	}

}
