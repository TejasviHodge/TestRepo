
public class AlphabateSort {

	
	public static void main(String[] args) {
		String test="Tejasvi";
		test=test.toLowerCase();
		char ch[] = test.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
