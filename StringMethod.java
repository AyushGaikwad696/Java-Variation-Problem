
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mindscripts Java";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.compareTo("Mind")+" COMPARE");
		System.out.println(str.indexOf(2)+" Index off");
		System.out.println(str.endsWith("Java"));
		System.out.println(str.startsWith("Mind"));
		System.out.println(str.charAt(4)+" charAt");
		System.out.println(str.equals("Mindscript Java"));
		System.out.println(str.equalsIgnoreCase("MindScrIpt JAVA"));
		System.out.println(str.substring(5)+" Substrinh");
		System.out.println(str.substring(0,5));
		System.out.println(str.subSequence(2,6));
		System.out.println(str.concat(" Full Stack"));
		System.out.println(str+"Full Sctak Developer");
		System.out.println(str.replace("s", "u")+" replace");
		System.out.println(str.replaceFirst("s","y"));
		System.out.println(str.replaceAll("s", "9"));
		String str1="  Ayush Gaikwad  ";
		System.out.println(str1);
		System.out.println(str1.trim());
		String str2="Ayush vasant Gaikwad";
		String arr[]=str2.split(" ");
//		System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]);
		System.out.println("Splitting String");
		for (int x=arr.length-1;x>=0;x--)
		{
			System.out.println(arr[x]);
		}
		for (String z:arr)
		{
			System.out.println(z);
		}
		String str3="Hello World";
		char ch[]=new char[10];
		str3.getChars(0, 6, ch, 2);
		System.out.println(ch);
		String sb="WELOCME TO JAVA";
		System.out.println("New *********");
		char ch2[]=sb.toCharArray();
		System.out.println(ch2);
		for(int x=0;x<ch2.length;x++) 
		{
			System.out.println(ch2[x]);
		}
		for(char c2:ch2) 
		{
			System.out.print(c2);
		}	
		System.out.println();
		char a1='L';
		System.out.println("Value of a1 "+String.valueOf(a1));
	}

}
