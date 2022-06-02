import java.util.Scanner;

public class Two_D {
	public static void main(String args[])
	{
		int n,m,p;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no rows");
		n=s.nextInt();
		
		System.out.print("Enter no columns");
		m=s.nextInt();
		int a[][]=new int[n][m];
		System.out.print("Enter values");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}

