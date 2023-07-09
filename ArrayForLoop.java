import java.util.Scanner;
class AscendingDescending
{
	void Ascending(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp1 = a[i];
						  a[i]=a[j];
						  a[j]=temp1;
				}
			}
		}
	
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");	
		}
		System.out.println();		
	}
	void Descending(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp1 = a[i];
						  a[i]=a[j];
						  a[j]=temp1;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");		
		}
	}
}
public class ArrayForLoop 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int a[] = new int[size];
		System.out.println("Size of array "+size);
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");		
		}
		System.out.println();		

		System.out.println("Reverse of an array");
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");	
		}
		System.out.println();		

		AscendingDescending z=new AscendingDescending();
			System.out.println("Ascending order is");
							z.Ascending(a);
				System.out.println("Descending order is");
							z.Descending(a);
	}

}
