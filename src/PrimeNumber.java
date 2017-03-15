
public class PrimeNumber {


	public static void main(String[] args) {
		boolean isPrime=true;
		for (int i = 1; i < 100; i++) 
		{
			for (int j = 1; j < i/2; j++) 
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
				else
					continue;
			}
			if(isPrime)
				System.out.println("Number is prime"+i);
			/*else
				System.out.println("Number is not prime"+i);*/	
		}
	}

}
