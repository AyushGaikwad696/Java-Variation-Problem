
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int arr[]= {12,53,35,68};
		try
		{
			try
			{
			float total=a/b;
			System.out.println(" divsion "+total);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			arr[2]=40;
			System.out.println(" array "+arr[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exit");
		try 
		{
		int div1=30,div2=0;
		float to=div1/div2;
		System.out.println(to);
		}
		finally
		{
			System.out.println("Finally ");
		}
		System.out.println("end ");
	}

}
