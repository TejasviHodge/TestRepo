
public class NumberReverse {

	public static void main(String[] args) 
	{ 
		int num=153,number=0;
		String str= ""+num;
		int rem,quo;
		for (int i=str.length();i>0; i--) 
		{
			rem=num%10;
			quo=num/10;
			number=(int) (number+(rem*Math.pow(10, i-1)));
			num=quo;
		}

		System.out.println("reverse number is "+number);
	}

}
