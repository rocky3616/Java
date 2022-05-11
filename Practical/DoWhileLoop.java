package corejava;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		int num=0,sum=0;
		do
		{
			sum+=num;
			System.out.println("Enter a number : ");
			num=sc.nextInt();
		}
		while(num>=0);
		System.out.println("The sum of numbers are : "+sum);
		sc.close();
	}
}
