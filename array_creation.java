package java_class;
import java.util.Scanner;

public class array_creation {
	public static void main(String args[])
	{
		int n,m,p;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter no of elements in array");
		n=s.nextInt();
		int a[] = new int[n];//Declaration and Intialisation
		int b[] = new int[n+1];
		System.out.print("Enter values");
		for(int i=0; i<n; i++)
		{
			a[i]= s.nextInt(); //a[0],a[1],
		}
		System.out.print("enter index of a new value to be inserted");
		m=s.nextInt();
		System.out.print("enter  a new value to be inserted");
		p=s.nextInt();
		for(int i=0; i<n+1; i++)
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
			{
				b[i]= p;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.print("Elements are");
		for(int i=0;i<n+1; i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
