
public class StringAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Wellcome Java";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		String arr[]=str.split(" ");   //one word = one array
		for (int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
		for (int x=arr.length-1;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		
		System.out.println(str.substring(15));
		System.out.println();
		String p ="Pune";
		for (int i=p.length()-1;i>=0;i--)
		{
			System.out.print(p.charAt(i));
		}
	}

}
