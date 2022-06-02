/**
 * 
 */
package corejava;
import java.io.*;
/**
 * @author Rupesh
 *
 */
//java program to show the usage of IO FileReader Class
public class FileReader_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file=new File("D:\\myfile.txt");
		int i;
		//creating FileReader
		FileReader fr=new FileReader(file);
		while((i=fr.read())!=-1)
		{
			//printing characters
			System.out.print((char)i);
		}
		fr.close();
		

	}

}
