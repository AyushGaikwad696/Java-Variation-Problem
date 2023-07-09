import java.util.Scanner;
class IfElse
{
	void con(int a1)
	{
		if(a1%2==0)
		{
			System.out.println("Given number is Even ");
		}
		else
		{
			System.out.println("Given number is Odd ");
		}
	}
}
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value to find Even Odd number ");
		int a=sc.nextInt();
//		System.out.println("Enter the Second value");
//		int b=sc.nextInt();
		IfElse z=new IfElse();
			z.con(a);
		
	}

}
