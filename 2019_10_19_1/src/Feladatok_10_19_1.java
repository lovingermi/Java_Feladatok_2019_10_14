import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Feladatok_10_19_1 {

	public static void main(String[] args) 
	{
		int a=110;
		int b=120;
		int c=130;
		double d1=12.51;
		double d2=12.5;
		double d3=12.5;
		int ma=Math.max(  a, b);
		System.out.println(ma);
		
		d1=Math.rint( d1);//számot kerekíti a legközelebbi egészhez.
		System.out.println(d1);
		d2=Math.floor(d2);//számot kerekíti lefelé.
		System.out.println(d2);
		d3=Math.ceil(d3);//számot kerekíti felfelé.
		System.out.println(d3);
		double rand=Math.random()*100;//0 és 100 közé eső random szám
		rand=Math.rint(rand);
		System.out.println(rand);
		Character cc1 = new Character('a');
		Character cc2 = new Character ('c');
		boolean bool=cc1.equals(cc2);
		System.out.println(bool);
		int i=cc1.compareTo(cc2);
		System.out.println(i);
		String str=cc1.toString();//char to string
		String alma = new String("alma");
		char[] tch = {'a', 'l', 'm', 'a'};
		
		String alma2 = new String(tch);
		String lma = new String(tch, 2, 2);
		
		System.out.println(alma2);
		System.out.println(lma);
		String str2=String.valueOf(tch);//char tomb to string
		System.out.println(str2);
		alma = new String("alma");
		char[ ]tch2=alma.toCharArray();//string to char array
		for (int j = 0; j < tch2.length; j++) 
		{
			System.out.println(tch2[j]+" ");
		}
		//A lexikografikus összehasonlítás alapján két karakterlánc egyenlő, ha azonos hosszúak,
		//és minden pozíciójukon azonos karakter áll. 
		//Pl.: "abc"="abc"; "abd">"abc"; "abcde">"abc", "aza"<"zdt", "Z"<"a".
		char tch3 =alma.charAt(0);//Megadja a sztring paraméterként adott pozíciójában álló karakterét.
		System.out.println(tch3);
		int l=alma.length();//sztring hosszát adja meg.
		System.out.println(l);
		int index=alma.indexOf('a');//Megadja a paraméterként adott karakter első előfordulásának indexét ha az adott karakter nem szerepel benne, -1 a visszatérési érték.
		System.out.println(index);
		int index2=alma.lastIndexOf('a');//Megadja a paraméterként adott karakter utolsó előfordulásának indexét 
		System.out.println(index2);
		boolean bool2=alma.startsWith(alma);
		alma=alma.replace('a', 'e');//regiChar karakter minden előfordulását ujChar karakterre cseréli.
		System.out.println(alma);
		alma=alma.replaceAll("el","El");//paraméterként adott mit részsztring minden előfordulását mire karakterláncra cseréli.
		System.out.println(alma);
		alma=alma.toUpperCase();
		System.out.println(alma);
		//StringBuffer delete(int indextol, int indexig)
		//StringBuffer replace(int indextol, int indexig, String str)
		String s1 = "mama";
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.insert(0, "baba");
		System.out.println(sb1);
		sb1.replace(3, 8, "zsak");
		System.out.println(sb1);
		
	}
	

	

}
