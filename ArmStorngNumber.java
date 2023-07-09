 import java.util.Scanner;

public class ArmStorngNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Armstrong Number");
		int arm=sc.nextInt();
		int num,temp,reu=0;
		num=arm;
		while(num!=0)
		{	 temp=num%10;
			 reu=reu+(temp*temp*temp);
			 num=num/10;
		}
		if(arm==reu)
		{
			System.out.println("The given number "+reu+" is ArmStrong number");
		}
		else
		{
			System.out.println("The gievn number "+arm+" is not ArmStrong Number");
		}
	} 
}
