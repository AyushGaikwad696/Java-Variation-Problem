
public class BeforeMain {
	static {
		System.out.println("static");
	}
	private BeforeMain()
	{
		System.out.println("con");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		BeforeMain c=new BeforeMain();
		
	}

}
