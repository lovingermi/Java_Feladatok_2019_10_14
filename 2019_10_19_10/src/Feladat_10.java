import java.util.Scanner;

public class Feladat_10 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a szót");
		String szo=scanner.next();
		
		StringBuffer ujszo=new StringBuffer(szo);
		for (int i = 0; i < ujszo.length(); i++) 
		{
			char chr=ujszo.charAt(i);
			if(chr=='a'||chr=='e'||chr=='o'||chr=='u')
			{
				ujszo.setCharAt(i, Character.toUpperCase(chr));
			}
		}
		System.out.println(ujszo);

	}

}
