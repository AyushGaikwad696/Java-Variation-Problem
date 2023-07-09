import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the to fime Prime number ");
		int pr=sc.nextInt();
		int temp=0;
		for (int i=2;i<pr-1;i++)
		{
			if(pr%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Composite number");
		}
		else
		{
			System.out.println("Prime number ");
		}
	}

}
