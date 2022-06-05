package corejava;
import java.io.*;
public class FilterInStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File data=new File("D:\\myfile.txt");
		//create input streams
		FileInputStream file=new FileInputStream(data);
		FilterInputStream filter=new BufferedInputStream(file);
		int k=0;
		while((k=filter.read())!=-1)
		{
			// Since read() method returns Integer value
            // So, we convert each integer value to char
			System.out.print((char)k);
		}
		file.close();
		filter.close();

	}

}
