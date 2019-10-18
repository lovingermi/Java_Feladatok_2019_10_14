
public class Feladat_10 {

	public static void main(String[] args) 
	{
		int [][]tomb=new int[10][10];
		for (int i = 0; i < tomb.length; i++) 
		{
			for (int j = 0; j < tomb.length; j++) 
			{
				tomb[i][j]=10*i+j+1;
				System.out.print(tomb[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
