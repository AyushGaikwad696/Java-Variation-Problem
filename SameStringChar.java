import java.util.Scanner;

public class SameStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String str1=sc.next();
		char cha[]=str.toCharArray();
		char cha1[]=str1.toCharArray();
		for(char ch: cha)
		{
			for(char ch1:cha1)
			{
				if(ch==ch1)
				
					System.out.println("duplicate found "+ch);
			}
		}
		String str5="awesome lady";
		char ch3[]=str5.toCharArray();
		for(char temp:ch3)
		{
			for(char temp1:ch3)
			{
				if(temp==temp1) {
					System.out.println(temp);
					break;
				}
				
			}
		}
		System.out.println("enter the string");
		String str3=sc.next();
		char ch6[]=str3.toCharArray();
		char ch4[]=str3.toCharArray();
		for (int i=0;i<str3.length();i++)
		{
			for (int j=i+1;j<str3.length();j++)
			{
				if(ch6[i]==ch4[j])
					System.out.println(ch4[j]);
			}

		}
	}

}
