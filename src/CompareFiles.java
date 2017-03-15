import java.io.BufferedReader;
import java.io.FileReader;


public class CompareFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			try 
			{
				FileReader file1 = new FileReader("D:/Test1.csv");
				FileReader file2 = new FileReader("D:/Test2.csv");
				BufferedReader bffr1 = new BufferedReader(file1);
				BufferedReader bffr2 = new BufferedReader(file2);
				String s1,s2;
				boolean file;
				while((s1=bffr1.readLine())!=null && (s2=bffr2.readLine())!=null )
				{
					String splitString1[]=s1.split(",");
					String splitString2[]=s2.split(",");
					
					for (int i = 0; i < splitString1.length; i++)
					{
						file=splitString1[i].equals(splitString2[i]);
						System.out.println(file);
					}
					//System.out.print(" ");
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			
			}
		}

	}

