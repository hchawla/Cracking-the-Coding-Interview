import java.util.Scanner;
public class zero
{
	public void zero(int Matrix[][], int m, int n)
	{
		int[] row = new int[m];
		int[] column = new int[n];
		for(int i=0;i<m;i++)
			row[i]=1;
		for(int j=0;j<n;j++)
			column[j]=1;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(Matrix[i][j]==0)
				{
					column[j]=0;
					row[i]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Columns with Zero in it are");
			if(column[i]==0)
				System.out.println(i);
		}
		for(int i=0;i<m;i++)
		{
			System.out.println("Rows with Zero in it are");
			if(row[i]==0)
				System.out.println(i);
		}
		for(int i=0;i<m;i++)
		{
			{	
				for(int j=0;j<n;j++)
					{
						if(row[i]==0||column[j]==0)
							Matrix[i][j]=0;	
					}
			}
		}
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int M,N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Columns and Rows in the Matrix");
		M = sc.nextInt();
		N = sc.nextInt();
		int [][] Matrix = new int[M][N];
		System.out.println("Enter the matrix values:");
		for(int i =0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				Matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Matrix is:");
		for(int i =0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}	
		zero hero = new zero();
		hero.zero(Matrix,M,N);
	}
}
