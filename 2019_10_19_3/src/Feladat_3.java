import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_3 {

	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Kérem az 1. számot");
			Integer i1=new Integer(scanner.nextInt());
			System.out.println("Kérem az 2. számot");
			Integer i2=new Integer(scanner.nextInt());
			System.out.println("Kérem az 3. számot");
			Integer i3=new Integer(scanner.nextInt());
			int max=i1.intValue();//int max=i1;
			if (max<i2) 
			{
				max=i2;
			}
			if (max<i3) 
			{
				max=i3;
			}
			System.out.println("A legnagyobb szám: "+max);
		} 
		catch (InputMismatchException ime) 
		{
			System.err.println("Nem szám lett megadva!");
		}
	

	}

}
