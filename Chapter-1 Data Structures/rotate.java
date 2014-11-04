import java.util.Scanner;
public class rotate
{
	public void rotate(int [][]matrix, int n)
	{
		for(int layer = 0;layer<n/2;++layer)
		{
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i <last;++i)
			{
				int offset = i-first;
				int top = matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
			}
			for(int i = 0;i < n; i ++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats the length of the matrix?");
		int n = sc.nextInt();
		int Matrix[][] = new int[n][n];
		System.out.println("Enter the Values");
		for(int i = 0;i < n; i ++)
		{
			for(int j=0;j<n;j++)
			{
				Matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix you entered is:");
		for(int i = 0;i < n; i ++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		rotate r = new rotate();
		r.rotate(Matrix,n);
	}
}
