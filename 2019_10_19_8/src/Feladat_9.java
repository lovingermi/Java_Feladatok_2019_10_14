import java.util.Arrays;
import java.util.Scanner;

public class Feladat_9 {

	private static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a szöveget");
		String str=scanner.nextLine();
		str=str.toLowerCase();//A szöveg kisbetűvel
		String[] kivesz= {";" , "." , "?" , "!" , ":",","};
		//System.out.println(szoveg1);
		//karakterekre bontás
		char[]ch1=str.toCharArray();//string to char array
		String szoveg1="";
		String szoveg2="";
		for (int i = 0; i < ch1.length; i++) //írásjelek ás szőköz kiszedése
		{
			if ((ch1[i])!='.'&&(ch1[i])!=';'&&(ch1[i])!='!'&&(ch1[i])!='?'&&(ch1[i])!=','&&(ch1[i])!=':'&&(ch1[i]!=' ')) 
			{
				
				szoveg1=szoveg1+ch1[i];//eredeti sorrend
				
				szoveg2=ch1[i]+szoveg2;//fordított sorrend
				
			}
			
		}
		System.out.println("szöveg eredeti sorrend:");
		System.out.println(szoveg1);
		System.out.println("szöveg fordított sorrend:");
		System.out.println(szoveg2);
		if (szoveg2.equals(szoveg1)) 
		{
			System.out.println("A szöveg palindroma");
		}
		else
		{
			System.out.println("A szöveg nem palindroma");
		}
	}

}
