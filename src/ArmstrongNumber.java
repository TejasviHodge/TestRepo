import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int rem,quo,n=500;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int s1= sc.nextInt();
		for (int i = 0; i < s1; i++) 
		{
			int add=0;
			num=i;
			String s=""+num;
			for (int j = 0; j < s.length(); j++)
			{
				rem=num%10;
				quo=num/10;
				add=add+(rem*rem*rem);
				num=quo;
			}
			if(i==add)
			{
				System.out.println("Number is armstrong"+i);
			}
			/*else
			{
				System.out.println("Number is not armstrong "+i);
			}*/
		}

	}

}
