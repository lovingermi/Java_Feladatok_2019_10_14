import java.util.Scanner;

public class Feladat_11 {

	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a szöveget!");
		String szoveg=scanner.nextLine();
		StringBuffer szoveg2=new StringBuffer(szoveg);
		int db=0;
		for (int i = 0; i < szoveg.length(); i++) 
		{
			if (Character.isDigit(szoveg.charAt(i))) 
			{
				szoveg2.deleteCharAt(i-db);
				db++;
			}
		}
		System.out.println(szoveg2);

	}

}
