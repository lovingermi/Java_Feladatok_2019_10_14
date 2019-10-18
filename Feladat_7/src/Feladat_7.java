import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_7 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Kérem a tömb méretét:");
			int meret=scanner.nextInt();
			float osszeg=0;
			float[] tomb=new float[meret];
			for (int i = 0; i < tomb.length; i++) 
			{
				System.out.println((i+1)+". szám:");
				tomb[i]=scanner.nextFloat();
				osszeg+=tomb[i];
			}
			System.out.println("A tömb elemeinek öszege: "+osszeg);
		} 
		catch (InputMismatchException ime) 
		{
			System.err.println("Hibás érték");
		}
		

	}

}
