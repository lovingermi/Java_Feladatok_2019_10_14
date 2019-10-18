import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_4 {

	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("1. szám:");
			int szam1=scanner.nextInt();
			System.out.println("2. szám:");
			int szam2=scanner.nextInt();
			System.out.println("3. szám:");
			int szam3=scanner.nextInt();
			System.out.println("4. szám:");
			int szam4=scanner.nextInt();
			System.out.println("5. szám:");
			int szam5=scanner.nextInt();
			if (szam3==szam2+szam1 && szam4==szam3+szam2&&szam5==szam4+szam3) 
			{
				System.out.println("A szám Fibonancci sorozat");
			}
			else
			{
				System.out.println("A szám nem Fibonancci sorozat");
			}
		}
		catch (InputMismatchException ime) 
		{
			System.err.println("Nem szám lett megadva");
		}
		catch (Exception e) 
		{
			System.err.println("Hibás bevitel");
		}
	}

}
