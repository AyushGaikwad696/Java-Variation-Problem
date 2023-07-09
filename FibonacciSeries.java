import java.util.Scanner;

class Fibonacci
{
	Fibonacci(int n)
	{
		int a=0, b=1;
			for (int i=1;i<=n;i++)
			{
				System.out.print(b+" ");
				int temp=b;
				b=a+b;
				a=temp;
			}
	}
}
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Fibonacci z=new Fibonacci(n);
	}

}
