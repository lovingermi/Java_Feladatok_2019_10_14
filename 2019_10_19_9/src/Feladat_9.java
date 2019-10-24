import java.util.Scanner;

public class Feladat_9 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a mondatot!");
		String szoveg=scanner.nextLine();
		String szoveg2="";
		szoveg2=szoveg.replaceAll("egy", "kettő");
		szoveg2=szoveg2.replaceAll("Egy", "Kettő");
		System.out.println(szoveg2);
		
	}

}
