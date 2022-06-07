/**
 * 
 */
package corejava;

/**
 * @author Rupesh
 *
 */
public class Swpping {

	/**
	 * @param args
	 */
	static int swap(int a,int b)
	{
		int temp=a;//storing value of a in temp
		a=b;//assigning value of b  in a 
		b=temp;//storing value of temp in b
		System.out.println("after swapping  values a="+a+" b="+b);
		return 0;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		
		System.out.println("before swapping  values a="+a+" b="+b);
		//calling swap method
		swap(a,b);
		
		

	}

}
