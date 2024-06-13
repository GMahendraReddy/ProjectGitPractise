package encapsuatioon;

class class2{
	
	private String username = "mahi";
	public void set_username(String username) {
		
		this.username= username;
		
		
	}
	public String get_username() {
		
		return username;
		
	}
}
public class Class1 {
	
	public static void main(String[] args) {
		
		class2 c = new class2();
		c.set_username("mahendra");
		System.out.println(c.get_username());
		
	}

}
