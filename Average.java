import java.util.Scanner;
class ABC1
{
	void Avg(int a1, int a2, int a3)
	{
		int total = a1+a2+a3;
		float avg = total/3;
		System.out.println("Total of 3 subject is = "+total);
		System.out.println("Avgerage of 3 subject = "+avg);
		if (avg<35)
		{
			System.out.println("You are fail kalank hai tu s");
		}
		else if(avg<=35&&avg<=45)
		{
			System.out.println("You are Pass");
		}
		else if(avg>45&&avg<60)
		{
			System.out.println("Pass By Second Class");
		}
		else if(avg>=60&&avg<75)
		{
			System.out.println("Pass By First Class ");
		}
		else
		{
			System.out.println("Distintion");
		}
		
	}
}
public class Average 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter math mark");
		int mark1=(int) sc.nextFloat();
		System.out.println("enter Science mark");
		int mark2=(int) sc.nextFloat();
		System.out.println("enter Physics mark");
		int mark3=(int) sc.nextFloat();
		ABC1 z=new ABC1();
			 z.Avg(mark1, mark2, mark3);
	}

}
