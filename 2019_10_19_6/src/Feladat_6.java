import java.util.Scanner;

public class Feladat_6 {

	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String cc1="a";
		String cc2="ab";
		int index=cc1.compareTo(cc2);//ha a második nagyobb negatív lesz
		System.out.println(index);
		System.out.println("Kérem a tömb méretét:");
		int szam=scanner.nextInt();
		String[] tomb=new String[szam];
		for (int i = 0; i < tomb.length; i++) 
		{
			System.out.println((i+1)+". szöveg:");
			tomb[i]=scanner.next();
		}
		int min=0;
		for (int i = 1; i < tomb.length; i++) 
		{
			if (tomb[i].compareTo(tomb[min])<0) 
			{
				min=i;
			}
		}
		System.out.println("A legrövidebb szöveg: "+tomb[min]);

	}

}
