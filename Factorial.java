 import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial");
		int number =sc.nextInt();
		int Reuslt=1;
		for (int i=1;i<=number;i++)
		{
			Reuslt=Reuslt*i;
		}
		System.out.println("Factorial of "+number+" is "+Reuslt);
	}

}
