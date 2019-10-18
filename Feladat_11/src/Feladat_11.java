
public class Feladat_11 {

	public static void main(String[] args) 
	{
		int [][]tomb1=new int[10][10];
		int [][]tomb2=new int[10][10];
		int [][]tomb3=new int[10][10];
		for (int i = 0; i < tomb1.length; i++) 
		{
			for (int j = 0; j < tomb1.length; j++) 
			{
				tomb1[i][j]=10*i+j+1;
				tomb2[i][j]=1;
				tomb3[i][j]=tomb1[i][j]+tomb2[i][j];
				System.out.print(tomb3[i][j]+"\t");
			}
			System.out.println();
			
		}

	}

}
