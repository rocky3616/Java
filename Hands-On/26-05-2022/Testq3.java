package corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Testq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int osum=0;
		int esum=0;
		HashSet<Integer> nset=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of set : ");
		int len=sc.nextInt();
		System.out.println("enter numbers: ");
		for(int i=0;i<len;i++)
		{
			nset.add(sc.nextInt());
		}
		
		Iterator<Integer> it=nset.iterator();
		//System.out.print("even numbers are : ");
		while(it.hasNext())
		{
		int p=it.next();
			if(p%2 == 0)
			{
				esum+=p;	
			}
			else
			{
				osum+=p;
			}
			
		}
		System.out.print("sum of even numbers are : "+esum);
		System.out.print("\nsum of odd numbers are : "+osum);
		
		
	}

}
