/**
 * 
 */
package corejava;
import java.util.*;
/**
 * @author Rupesh
 *
 */
public class TreeSetCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		//adding elements
		set.add("Rupesh");
		set.add("Vinay");
		set.add("Suraj");
		set.add("Ajay");
		//creating iterator
		Iterator<String> it=set.iterator();
		// condition holds true till there is single elementS
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
