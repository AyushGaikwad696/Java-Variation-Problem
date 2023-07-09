import java.util.Scanner;

public class StringArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ether the Array Size");
		int Size=sc.nextInt();
		String arr[]=new String[Size]	;	
		System.out.println(" Enter the student name");
		for (int x=0;x<Size;x++)
		{
			arr[x]=sc.next();
		}
		System.out.println("User input Array");
		for (int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array");
		for (int x=arr.length-1;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
		
	}

}
