import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_3 {

	private static  Scanner scanner =new Scanner(System.in);
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
			int max=szam1;
			if ( szam2>max) 
			{
				max=szam2;
			}
			
			if (szam3>max) 
			{
				max=szam3;
			}
			System.out.println("A legnagyobb szám : "+max);
			if (szam1%3==0&&szam2%3==0&&szam2%3==0) 
			{
				System.out.println("A három szám osztható hárommal");
			}
			else
			{
				System.out.println("A nem mind a három szám osztható hárommal");
			}
		} 
		catch (InputMismatchException ime) 
		{
			System.err.println("Nem számot adtál meg");
		}
		
		catch (Exception e) 
		{
			System.err.println("Beviteli hiba");
		}
	}

}
