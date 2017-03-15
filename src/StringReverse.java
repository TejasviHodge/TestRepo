
public class StringReverse {

	public static void main(String[] args) {
		String test = "my name is Tejasvi";
		String splitString[]= test.split(" ");
		for (int i = 0; i < splitString.length; i++)
		{
			for (int j = (splitString[i].length())-1; j>=0; j--) 
			{
				System.out.print(splitString[i].charAt(j));
			}
			System.out.print(" ");

		}

	}
}
