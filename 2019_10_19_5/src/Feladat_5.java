import java.text.DecimalFormat;
import java.util.Scanner;

public class Feladat_5 {

	private static Scanner  scanner = new Scanner(System.in);
	public static final DecimalFormat df1=new DecimalFormat("#.##");
	public static void main(String[] args) 
	{
		
		/*
		    Átmérő 	d = 	2 × r 	[m]
			A kör kerülete 	C = 	π × d = 2 × π × r 	[m]
			A kör területe 	A = 	π × d²/4 = π × r² 	[m²]
		 */
		System.out.println("Kérem a kör sugarát:");
		int r=scanner.nextInt();
		double kerulet=2*r*Math.PI;
		double terulet=r*r*Math.PI;
		double terulet2 =Math.pow(r, 2)*Math.PI;//hatvány
		System.out.println("A kör kerülete: "+kerulet);
		System.out.println("A kör területe: "+terulet);
		System.out.println("A kör  terület II: "+terulet2);
		//két tizedes decimal format használatával
		System.out.println(df1.format(kerulet));
		System.out.println(df1.format(terulet));
	}

}
