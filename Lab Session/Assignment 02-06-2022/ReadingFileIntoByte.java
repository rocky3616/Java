package corejava;
import java.io.*;
//Write a java program to read contents from a file into byte array
public class ReadingFileIntoByte {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file=new File("D:\\myfile.txt");
		//creating FileReader
		FileReader fr=new FileReader(file);
		//creating BufferedReader
		BufferedReader brr=new BufferedReader(fr);
		//initializing array of byte
		byte[] b=new byte[(int)file.length()];
		//b[0]=(byte) brr.read();
		int i=0;
		int j=0;
		//storing bytes into byte array
		while((i=brr.read())!=-1)
		{
			b[j]=(byte)i;
			j++;
			
		}
		//printing Characters
		for(byte bk:b)
		{
			System.out.print((char)bk);
		}
	}

}
