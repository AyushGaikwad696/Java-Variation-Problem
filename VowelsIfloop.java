import java.util.Scanner;

class VowelsForIf {
	void ForIf(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char cha = str.charAt(i);
			if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u')
				count++;
		}
		System.out.println("Vowel in the gievn string is " + count);
	}
}

public class VowelsIfloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find the Vowel in it");
		String str = sc.nextLine();
		VowelsForIf z = new VowelsForIf();
		z.ForIf(str);
	}

}
