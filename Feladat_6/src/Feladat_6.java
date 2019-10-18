import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat_6 {

	private static Scanner scanner=new Scanner( System.in);
	public static void main(String[] args) 
	{
		int[]tomb = new int [10];
		try 
		{
			for (int i = 0; i < tomb.length; i++) 
			{
				System.out.println((i+1)+". szám:");
				tomb[i]=scanner.nextInt();
				
			}
			System.out.println("A számok:");
			for (int j = 0; j < tomb.length; j++) 
			{
				
				
				System.out.print(tomb[j]+" ,");
			}
			
		}	
		catch(InputMismatchException ime)
		{
			System.err.println("A megadott érték nem megelelő");
		}
			
		
		

	}

}
