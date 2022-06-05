package corejava;
import java.io.*;
public class FilterOutStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File data=new File("D:\\myfile.txt");
		//create input streams
		FileOutputStream file=new FileOutputStream(data);
		FilterOutputStream filter=new FilterOutputStream(file);
		String s="welcome to the mumbai";
		byte b[]=s.getBytes();
		
		filter.write(b);
		// Flushes the Output Stream
		filter.flush();
		filter.close();
		System.out.println("success..");

	}

}
