import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_8 {

	private static  Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) 
	{

		try 
		{
			System.out.println("Kérem adja meg a tömb méretét:");
			int meret=scanner.nextInt();
			int[]tomb=new int[meret];
			int osszeg=0;
			int paros=0;
			int paratlan=0;
			for (int i = 0; i < tomb.length; i++) 
			{
				System.out.println((i+1)+". szám:");
				tomb[i]=scanner.nextInt();
				osszeg+=tomb[i];
				if (tomb[i]%2==0) 
				{
					paros++;
				}
				else 
				{
					paratlan++;
				}
			}
			float atlag=(float)osszeg/tomb.length;
			System.out.println("A tömb elemeinek átlaga: "+atlag);
			System.out.println(paros+" páros szám volt");
			System.out.println(paratlan+" páratlan szám volt");
		} 
		catch (InputMismatchException ime) 
		{
			System.err.println("Hibás érték");
		}

	}

}
