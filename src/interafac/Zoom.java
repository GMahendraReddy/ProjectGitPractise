package interafac;

interface Fb{
	
	void usr();
}
interface Google{
	void pwd();
	
}
public class Zoom implements Google , Fb{

	@Override
	public void usr() {
		
		System.out.println("usr");
	}

	@Override
	public void pwd() {
		// TODO Auto-generated method stub
		
		System.out.println("pwd");
		
	}
	
public static void main(String[] args)  {
	
	Zoom z = new Zoom();
	z.usr();
	z.pwd();
		
	}

}
