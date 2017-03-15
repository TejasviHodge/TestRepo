
public class SortNumber {
	public static void main(String[] args) {
		int arry[]= {20,50,20,30,60,10};
		int temp;
		for (int i = 0; i < arry.length; i++) 
		{
			for (int j = 0; j < arry.length; j++) 
			{
				if(arry[i]<arry[j])
				{
					temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
			}

		}
		for (int i = 0; i < arry.length; i++)
		{
			System.out.println(arry[i]);
		}

	}

}
