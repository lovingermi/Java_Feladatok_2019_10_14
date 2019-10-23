import java.util.Scanner;

public class Feladat_7 
{
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a mondatot");
		String str=scanner.nextLine();//nextLine() nem csak egy szó
		//első megodás:
		int db= 0;
		int index=0;
		while (str.indexOf("kutya",index)>-1) //mit honnan
		{
			index=str.indexOf("kutya",index)+1;
			db++;
			
		}
		System.out.println(db+". kutya van a mondatban.");
		//Második megoldás
		db=0;
		String[] tomb= str.split(" ");
		for (int i = 0; i < tomb.length; i++) 
		{
			if (tomb[i].equals("kutya")) //(tomb[i]==("kutya") nem ok
			{
				db++;
			}
		}
		System.out.println(db+". alkalommal szerepel a  kutya ");
	}
}
