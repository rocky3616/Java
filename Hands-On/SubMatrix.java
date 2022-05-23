package corejava;

import java.util.Scanner;

public class SubMatrix {
	public int subarry()
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("enter 9 elements for first matrix : ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("enter 9 elements for second matrix : ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				
			}
		}
		System.out.println("result :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(c[i][j]+"\t");
				
			}
			System.out.println("\n");
		}
		
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubMatrix obj=new SubMatrix();
		obj.subarry();

	}

}
