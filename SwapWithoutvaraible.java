import java.util.Scanner;
class abc
{
	void con(int a, int b)
	{
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swap "+a);
		System.out.println("value of b after swap "+b);
	}
}
public class SwapWithoutvaraible
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value to to swap the number without 3rd varaible ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		abc z=new abc();
			z.con(a,b);	
	}

}
