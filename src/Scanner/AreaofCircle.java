package Scanner;

import java.util.Scanner;

public class AreaofCircle {
	 final double pi= 3.14;

	public static void main(String[] args) {
		

		Scanner s1= new Scanner(System.in);
		System.out.println("Enter r value");
		int r = s1.nextInt();
		AreaofCircle d = new AreaofCircle();
		System.out.println(d.pi*r*r);
		
	}

}
