/**
 * 
 */
package corejava;
import java.util.*;
/**
 * @author Rupesh
 *
 */
public class StackCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack=new Stack<Integer>();
		//adding element to the list
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		stack.push(10);
		//removing last element
		stack.pop();
		Iterator<Integer> it=stack.iterator();
		// condition holds true till there is single elementS
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
