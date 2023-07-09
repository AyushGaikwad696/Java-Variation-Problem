import java.util.Scanner;

public class Abbrivation {

//	To create the Abbrivation of String 
//	eg: ayush gaikwad = AG
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.nextLine();
		String str1=s1.toUpperCase();
		String arr[]=str1.split(" ");	
		for (String z:arr)
		{
			System.out.print(z.charAt(0));
		}
	}

}