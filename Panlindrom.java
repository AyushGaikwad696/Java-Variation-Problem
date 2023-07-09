import java.util.Scanner;

public class Panlindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
//	      str = sc.nextLine();
//	      str=str.toLowerCase();
//	 
////	      int length = str.length();
//	 
//	      for ( int i = str.length() - 1; i >= 0; i-- )
//	         rev = rev + str.charAt(i);
//	 
//	      if (str.equals(rev))
//	         System.out.println(str+" is a palindrome");
//	      else
//	         System.out.println(str+" is not a palindrome");
	      
	      System.out.println();
	      int r, sum=0, temp ;    
	      int n=45454;//It is the number variable to be checked for palindrome  
	      temp = n;    
	      while(n>0)
	      {    
	      r=n%10;  //getting remainder  
	      sum=(sum*10)+r;    
	      n=n/10;    
	      }    
	      if(temp==sum)    
	      System.out.println("palindrome number ");    
	      else    
	      System.out.println("not palindrome");    

	}
	
}

