import java.util.Scanner;
class Metertokilo
{
	void converter(double me1)
	{
		double kilo=me1/1000;
		System.out.println("value after conversion "+kilo+"kg");
	}
}
public class MeterToKilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to convert into kilometer");
		double me=sc.nextDouble();
		Metertokilo z=new Metertokilo();
			z.converter(me);
	}

}
