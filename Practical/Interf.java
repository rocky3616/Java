/**
 * 
 */
package corejava;

/**
 * @author Rupesh
 *
 */
//interface interf
interface Interf {
	final int num=100;
	void display();
	
	

}
//implementing the capabilities of interface
class TestClass implements Interf
{
	public void display()
	{
		System.out.println("Rupesh");
		
		
	}
	public static void main(String[] args)
	{
		//creating object of TestClass
		TestClass obj=new TestClass();
		//calling display method using object
		obj.display();
		//printing value of num
		System.out.println(num);
	}
}
