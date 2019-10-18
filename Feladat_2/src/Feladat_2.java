import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_2 {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Kérem a számot");
			int szam=scanner.nextInt();
			if (szam%2==0) 
			{
				System.out.println("A Szám osztható kettővel");
			} 
			else 
			{
				System.out.println("A Szám nem osztható kettővel");
			}
			if (szam%3==0) 
			{
				System.out.println("A Szám osztható hárommal");
			} 
			else 
			{
				System.out.println("A Szám nem osztható hárommal");
			}
		} 
		catch (InputMismatchException io) 
		{
			System.err.println("Nem számot adtál meg");
		}
		catch (Exception e) 
		{
			System.err.println("Hiba történt");
		}

	}

}
