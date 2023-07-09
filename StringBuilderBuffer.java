
public class StringBuilderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Hello World");
		System.out.println(str);
		System.out.println("Reverse Order : "+str.reverse()); //reverse the given string
		StringBuilder str1=new StringBuilder("Hello World");

		System.out.println("Insterted Java : "+str1.insert(5, " Java"));//insert the word from the given index
		System.out.println(str1);
		System.out.println("Deleting world : "+str1.delete(11, 16));// delete the given index number 
		str.append(str1); //append concat the to variable
		System.out.println(str+"*****");
	}

}
