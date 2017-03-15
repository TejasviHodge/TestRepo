import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CompareFilesUsingArray {

	public static void main(String[] args) 
	{
		try 
		{
			FileReader file1 = new FileReader("D:/Test1.csv");
			FileReader file2 = new FileReader("D:/Test2.csv");
			BufferedReader bffr1 = new BufferedReader(file1);
			BufferedReader bffr2 = new BufferedReader(file2);
			String s1,s2;
			boolean file;
			List<String> list1=new ArrayList<>();
			List<String> list2=new ArrayList<>();
			while((s1=bffr1.readLine())!=null && (s2=bffr2.readLine())!=null )
			{
				String splitString1[]=s1.split(",");
				String splitString2[]=s2.split(",");
				list1=Arrays.asList(splitString1);
				list2=Arrays.asList(splitString2);
				file=list1.containsAll(list2);
				
					System.out.println(file);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		
		}
	}

}
