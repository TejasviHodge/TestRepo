import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFromCSV 
{

	public static void main(String[] args) 
	{
		try 
		{
			FileReader file = new FileReader("D:/Test1.csv");
			BufferedReader bffr = new BufferedReader(file);
			String s;
			while((s=bffr.readLine())!=null)
			{
				String splitString[]=s.split(",");
				for (int i = 0; i < splitString.length; i++) {
					System.out.print(splitString[i]);
				}
				System.out.print(" ");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		
		}
	}

}
