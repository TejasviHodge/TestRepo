
public class StringReverseUsingStringBuffer {

	public static void main(String[] args) {
		String test= "My name is tejasvi";
		String splitTest[] = test.split(" ");
		for (int i = 0; i < splitTest.length; i++) 
		{
			StringBuffer strBuffer =  new StringBuffer(splitTest[i]);
			System.out.print(strBuffer.reverse());
			System.out.print(" ");
		}
	}

}
