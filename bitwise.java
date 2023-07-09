
public class bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9, b=8;
		System.out.println(a&b);
		/*
		 * A  &  B
		 * 0  *  0  =0
		 * 0  *  1  =0
		 * 1  *  0  =0
		 * 1  *  1  =1
		 * */
		System.out.println(a|b);
		/*
		 * A  |  B
		 * 0  +  0  =0
		 * 0  +  1  =1
		 * 1  +  0  =1
		 * 1  +  1  =1
		 * */
		int x=10;
		System.out.println("Value of x after left shift = "+(x<<2));// left shift <<  formula x*2n=40
		System.out.println("Value of x after right shift = "+(x>>2));// right shift >>  formula x/2n=2
		System.out.println("Value of x after Zero fill shift = "+(x>>>2));// Zero fill >>>  

	}

}
