package corejava;
import java.util.*;

public class Testq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of LinkedList : ");
		int len=sc.nextInt();
		System.out.println("enter names: ");
		for(int i=0;i<=len;i++)
		{
			ll.add(sc.nextLine());
			
		}
		
		Iterator<String> it=ll.iterator();
		System.out.println("Names: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
