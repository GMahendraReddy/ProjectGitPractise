package StringFramework;

public class Class2 {
	public static void main(String[] args) {
		
		String a = "Gangasani Mahendra  Reddy";
		
//		1 GMR
		/*System.out.print(a.charAt(0));
		System.out.print(a.substring(10, 11));
		System.out.print(a.substring(19, 20));*/
		
/*      2.G
		  M
		  R
		  System.out.println(a.charAt(0));
		System.out.println(a.substring(10, 11));
		System.out.println(a.substring(19, 20));*/
		
/*		3.GANGASANI
		  MAHENDRA
		  REDDY
		  System.out.println(a.substring(0, 9));
		System.out.println(a.substring(10, 18));
		System.out.println(a.substring(19, 24));*/
		
/*		4.R
		  E
		  D
		  D
		  Y
		  for(int i =19; i<a.length(); i++) {
			  
			  System.out.println(a.charAt(i));
			  
		  }*/
		
//		5. Mahedra Rohit
		
//        System.out.println(a.substring(0, 9)+" ".concat("Rohit"));
//		int a = 1;
		
//		1 and 2 using for loop
		for(int i =0; i< a.length() ; i=i+ 10) {
			System.out.println(a.charAt(i));
			
		}
	}

}
