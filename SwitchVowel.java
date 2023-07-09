import java.util.Scanner;

public class SwitchVowel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char alp= sc.next().charAt(0);
		switch (alp)
		{
		case 'a': case 'A': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U': case 'e': case 'E':
			System.out.println(alp+" Is Vowel");
			break;
		default:
			System.out.println(alp+" Is Consonent ");
		}
	}
}
	