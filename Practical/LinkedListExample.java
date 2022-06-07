/**
 * 
 */
package corejava;
import java.util.LinkedList;
import java.util.Iterator;
/**
 * @author Rupesh
 *
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		//adding element to the list
		list.add("Vinu");
		list.add("Ketan");
		list.add("Vinay");
		Iterator<String> it=list.iterator();
		// condition holds true till there is single element
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
