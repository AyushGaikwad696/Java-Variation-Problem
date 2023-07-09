class Hollow
{
	Hollow()
	{
		int n=5,m=5,count=3;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=m;j++)
			{
				if(i == 1||j == 1||i == n||j == m) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
	Hollow(int a)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void HalfParamid()
	{
		int n=4;
		for (int i=0;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void For()
	{
		for (int x=0;x<=6;x++)//rows
		{
			for (int y=0;y<=x;y++) //columns
			{
				System.out.print(x+" ");	
			}
		 System.out.println();
		}
	}
	void For1()
	{
		for (int x=1;x<=6;x++)//rows
		{
			for (int y=1;y<=x;y++) //columns
			{
				System.out.print(y+" ");	
			}
		 System.out.println();
		}
	}
	void For2()
	{
		int num=1;
		for (int x=1;x<=5;x++)//rows
		{
			for (int y=1;y<=x;y++) //columns
			{
				System.out.print(num+" ");
				num++;
			}
		 System.out.println();
		}
	}
	void For3()
	{
		for (int i=5;i>=1;i--)//rows
		{
			for (int j=1;j<=i;j++) //columns
			{
				System.out.print(j+" ");
			}
		 System.out.println();
		}
	}
	void Tirangle01()
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				int sum=i+j;
				if(sum % 2 ==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
	void Butterfly()
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{ 
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			int space=2*(n-i);
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{ 
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			int space=2*(n-i);
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
public class HollowRectangle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hollow z=new Hollow();
		System.out.println();
		Hollow z1=new Hollow(1);
		
			z.HalfParamid();
//			Thread.sleep(1000);
			System.out.println();
			z.For();
			System.out.println();
			z.For1();
			System.out.println();
			z.For2();
			System.out.println();
			z.For3();
			System.out.println();
			z.Tirangle01();
			System.out.println();
			z.Butterfly();
	}

}
