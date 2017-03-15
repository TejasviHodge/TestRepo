
public class PerfectNumber {

	public static void main(String[] args) 
	{
		int n=100,add,num;
		for (int i = 1; i < n; i++) 
		{
			add=0;
			num=i;
			for (int j = 1; j <= num/2; j++)
			{
				if(num%j==0)
				{
					add=add+j;
				}
			}
			if(num==add)
			{
				System.out.println(num+" is Perfect Number");
			}
		}
	}

}
