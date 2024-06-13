package blocks;

public class Blocks {
	static {//SIB
		System.out.println("SIB");
		
	}
	{//IIB
		System.out.println("IIB");	
	}
	Blocks(){//CONSTRUCTOR
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		

		System.out.println("MM");
		
		new Blocks();
		
	}

}
