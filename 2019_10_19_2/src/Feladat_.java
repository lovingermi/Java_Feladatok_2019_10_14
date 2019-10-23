
public class Feladat_ {

	public static void main(String[] args) 
	{
		Double plusszvegt=new Double(Double.POSITIVE_INFINITY);
		Double minuszvegt=new Double(Double.NEGATIVE_INFINITY);
		int szam=10;
		System.out.println("Végtelen + szám= "+(plusszvegt+szam)); 
		System.out.println("Végtelen * szám= "+(plusszvegt*szam)); 
		System.out.println("Végtelen / szám= "+(plusszvegt/szam));
		System.out.println("-Végtelen / -szám= "+(minuszvegt/-szam));
		System.out.println("-Végtelen - -végtelen= "+(minuszvegt-minuszvegt));
		System.out.println("-Végtelen + -végtelen= "+(minuszvegt+minuszvegt));
		System.out.println("Végtelen / Végtelen = " + (plusszvegt / plusszvegt));
	}

}
