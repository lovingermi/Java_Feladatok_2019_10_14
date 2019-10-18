import java.util.Scanner;

public class Feladat_1 {

	private static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) 
	{
		int db=0;
		int szam=0;
		while (szam!=11) 
		{
			System.out.println("Kérem a számot");
			 szam=scanner.nextInt();
			db++;
		}
		System.out.println("A 11 a " +db+". volt");
	}

}
