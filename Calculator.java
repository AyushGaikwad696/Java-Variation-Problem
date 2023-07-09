import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number ");
		  	double num1=sc.nextDouble();
		System.out.println("Enter the one of the given oprator +, -, *, /, %  ");
		char symbol=sc.next().charAt(0);

		System.out.println("Enter the Second number ");
	  		double num2=sc.nextDouble();
	  	double Result;
	  	switch  (symbol) 
	  	{
	  	case '+':
	  		{
	  		Result=num1+num2;
	  		System.out.println("Addition of "+num1+" and "+num2+" = "+Result);
	  		}
	  		break;
	  	case '-':
  			{
  				Result=num1-num2;
  				System.out.println("Substraction of "+num1+" and "+num2+" = "+Result);
  			}
	  		break;

	  	case '*':
  			{
  				Result=num1*num2;
  				System.out.println("Multipication of "+num1+" and "+num2+" = "+Result);
  			}
	  		break;

	  	case '/':
  			{
  				Result=num1/num2;
  				System.out.println("Division of "+num1+" and "+num2+" = "+Result);
  			}
	  		break;

	  	case '%':
  			{
  				Result=num1%num2;
  				System.out.println("Reimder of "+num1+" and "+num2+" = "+Result);
  			}
	  		break;

  		default :
  			{
  				System.out.println("Invalid oprator");
  			}
	  	}
	  		

	}

}
