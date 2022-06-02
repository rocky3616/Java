/**
 * 
 */
package corejava;
import java.io.*;
/**
 * @author Rupesh
 *
 */
//Write a java Program BufferedWriter to write data to a File.
public class BuffWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//creating FileWriter
		FileWriter fw=new FileWriter("D:\\outputfile.txt");
		//creating BufferedWriter
		BufferedWriter bw=new BufferedWriter(fw); 
		bw.write("Earth spins toward the east,and that's why the Sun,Moon,planets,and stars all rise in the east .");
		bw.flush();
		bw.close();
		System.out.println("success..");

	}

}
