import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_9 {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		String[]hetNapjai ={"Hétfo","Kedd","Szerda","csütörtök","Péntek","Szombat","Vasárnap"};
		boolean betu=false;
		try 
		{
			
			while(!betu)
			{
			System.out.println("Kérem a napot:");
			int nap=scanner.nextInt();
			System.out.println(hetNapjai[nap-1]);
			}
			
		} 
		catch 
		(InputMismatchException ime) 
		{
			System.err.println("nem számot adtál meg, kilépés");
			betu = true;
		}
		catch 
		(IndexOutOfBoundsException iob) 
		{
			System.err.println("1 és 7 közötti számot kérek;");
		}
		
	}

}
