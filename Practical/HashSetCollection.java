/**
 * 
 */
package corejava;
import java.util.HashSet;
import java.util.*;
/**
 * @author Rupesh
 *
 */
public class HashSetCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of hashset
		HashSet<String> set=new HashSet<String>();
		//adding elements
		set.add("Vinu");
		set.add("Tejas");
		set.add("Rupesh");
		set.add("Vinu");
		Iterator<String> it=set.iterator();
		// condition holds true till there is single element
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
