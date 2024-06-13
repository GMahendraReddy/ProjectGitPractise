package AccessSpecifiers;

import Abstract.OutsidePack;

public class Case3 {
	void meth(){
		System.out.println("non meth");
	}
	
	static void meth(int a){
		System.out.println("non meth");
	}

	public static void main(String[] args) {    // outside the package
		meth(1);
		Case3 c = new Case3();
		OutsidePack o = new OutsidePack();
		o.add1();
		c.meth();
		

	}

}
