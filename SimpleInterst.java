import java.util.Scanner;
class SImp2
{
	void Simple(double princilpe, double rate, double time)
	{
		double SI=princilpe*rate*time;
		SI=SI/100;
		System.out.println("Simple interst of "+SI);
	}
//	void Compound(double princilpe, double rate, double time)
//	{
//		 double rate1 = rate/100;
//		 double CI=
//	}
}
public class SimpleInterst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount");
		double princilpe=sc.nextDouble();
		System.out.println("Enter rate of interest ");
		double rate=sc.nextDouble();
		System.out.println("Enter the Time period");
		double time=sc.nextDouble();
		SImp2 z=new SImp2();
			z.Simple(princilpe,rate,time);
			System.out.println(z.getClass());
			System.out.println(z.toString());
	}

}
