package corejava;
import java.util.Scanner;

public class addofarray2 {
	public int abc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of arrays : ");
		int len=sc.nextInt();
		int a[]=new int[len];
System.out.println("enter elements of array a : ");
int sum=0;
		
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<len;i++)
		{
			
				sum+=a[i];
				
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addofarray2 obj =new addofarray2();
		System.out.println("sum of array : "+obj.abc());

	}

}
