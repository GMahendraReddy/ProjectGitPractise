package array;

public class ArrayAll {

		public static void main(String[] args) {
			int age[] = new int[3];
			age[0] = 12;
			age[1]= 13;
			age[2] = 14;
			
			int roll[] = new int[3];
			roll[0]=121;
			roll[1]=122;
			roll[2]=123;
			
			String name[]= new String[3];
			name[0]= "Mahi";
			name[1]= "Sachin";
			name[2]= "Rohit";
			
                for(int i=0; i<3;i++) {
				
				System.out.println(name[i] + ' ' + roll[i]+ ' '+age[i]);
                }
                
                
			
//			for(int i=0; i<3;i++) {
//				
//				System.out.print(name[i]);
//				System.out.print("    ");
//				
//			}
//			System.out.println();
//			for(int i=0; i<3;i++) {
//				System.out.print(age[i]);
//				System.out.print("    ");
//				
//			}
//			System.out.println();
//			for(int i=0; i<3;i++) {
//				
//				System.out.print(roll[i]);
//				System.out.print("    ");
//				
//			}
			

		}

	}



