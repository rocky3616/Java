/**
 * 
 */
package corejava;
import java.util.*;
/**
 * @author Rupesh
 *
 */
public class VectorCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating vector
		Vector<String> v=new Vector<String>();
		//adding elements
		v.add("vinay");
		v.add("Suraj");
		v.add("Ketan");
		//creating iterator
		Iterator<String> it=v.iterator();
		// condition holds true till there is single elementS
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}

	}

}
