/**
 * 
 */
package corejava;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Rupesh
 *
 */
public class ArrayListCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
		ArrayList<String> list=new ArrayList<String>();
		//appending new elements 
		list.add("Rupesh");
		list.add("Vinu");
		list.add("Tejas");
		//creating iterator
		Iterator<String> it=list.iterator();
		// condition holds true till there is single element
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
