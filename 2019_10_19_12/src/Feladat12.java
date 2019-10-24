import java.util.InputMismatchException;
import java.util.Scanner;

public class Feladat12 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a számot");
		String[] tomb= {"","egy", "kettő","három","négy","öt","hat","hét","nyolc","kilenc"};
		String[] tomb2= {"","tíz","húsz","harminc","negyven","ötven","hatvan","hetven","nyolcvan","kilencven"};
		String[] tomb3= {"","tizen","huszon","harminc","negyven","ötven","hatvan","hetven","nyolcvan","kilencven"};
		String szoveg;
		String eredmeny="";
		try 
		{
			szoveg=scanner.next();
			int szam=Integer.parseInt(szoveg);
			
			if (szam>=1 && szam<=999)
			{
				    if (szoveg.length()==3 && '0'!=(szoveg.charAt(0)))
					{
					    eredmeny=eredmeny+tomb[Character.getNumericValue(szoveg.charAt(0))]+"száz";
					    if(szoveg.substring(szoveg.length() - 1).equals("0"))
						{
						 	eredmeny=eredmeny+tomb2[Character.getNumericValue(szoveg.charAt(1))];
						}
						else
						{
							eredmeny=eredmeny+tomb3[Character.getNumericValue(szoveg.charAt(1))];
						}
					 eredmeny=eredmeny+tomb[Character.getNumericValue(szoveg.charAt(2))];
						
					}
					else
					if (szoveg.length()==2 && '0'!=(szoveg.charAt(0)))
					{
						
					 if(szoveg.substring(szoveg.length() - 1).equals("0"))
						{
						 	eredmeny=eredmeny+tomb2[Character.getNumericValue(szoveg.charAt(0))];
						}
						else
						{
							eredmeny=eredmeny+tomb3[Character.getNumericValue(szoveg.charAt(0))];
						}
					     eredmeny=eredmeny+tomb[Character.getNumericValue(szoveg.charAt(1))];
				    }
					else
					if(szoveg.length()==1)	
					{
						eredmeny=eredmeny+tomb[Character.getNumericValue(szoveg.charAt(0))];
					}
					else
					{
						System.err.println("Nullával nem kezdődhet a szám!");
					}
				
				System.out.println(eredmeny);	
			}
			
			
			else
			{
				System.out.println("1 és 999 közötti értéket várok");
			}
		} 
		catch (InputMismatchException ime) 
		{
			System.err.println("Nem számot adtál meg");
		}
		catch (Exception e)
		{
			System.err.println("Nem számot adtál meg");
		}

	}

}
