package corejava;

public class Testq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//System.out.println("*");
		int p=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=p;k++)
			{
				System.out.print("*");
				
			}
			System.out.print("\n");
			p+=2;
		}

	}

}
