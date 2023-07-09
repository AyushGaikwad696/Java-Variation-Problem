import java.util.Scanner;

class StudentDetails
{
	Scanner sc=new Scanner(System.in);
	void Student()
	{
		System.out.println("eEnter your name");
		String name=sc.nextLine();
		System.out.println(" Enter you roll number ");
		int roll=sc.nextInt();
		System.out.println("Enter the Division");
		char div=sc.next().charAt(0);
		
		System.out.println("Student Name is :"+name);
		System.out.println("Student roll number is :"+roll);
		System.out.println("Student Division is :"+div);
	}
	
}
interface  SportMark  
{
	Scanner sc1=new Scanner (System.in);

	void marks();
	default void spname()
	{
		System.out.println("enter you sport name");
		String sportname=sc1.nextLine();		
		System.out.println("Enter you "+sportname+" marks ");
		int mark1=sc1.nextInt();
	}
}
interface ExamMarks extends SportMark
{
	 default void exam()
	 {
		 
	 }
	
}
class PrintReuslt extends StudentDetails implements SportMark,ExamMarks 
{

	@Override
	public void marks() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void exam() {
		// TODO Auto-generated method stub
		System.out.println("Enter you math subject");
		int math=sc.nextInt();
		System.out.println("enter englis");
		int english=sc.nextInt();
		System.out.println("enter scinece");
		int sci=sc.nextInt();
		
	}
	void AverageMarks()
	{	
		
	}
	
}
public class StudentInterFaceHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintReuslt z=new PrintReuslt();
				    z.Student();
				    System.out.println("*****");
				   z. spname();
				    z.marks();
				    z.exam();
	}
}
