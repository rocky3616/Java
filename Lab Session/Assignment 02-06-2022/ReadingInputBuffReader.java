package corejava;
import java.io.*;
//Write java program to read input(Use BufferedReader).
public class ReadingInputBuffReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader input=new InputStreamReader(System.in);
		//creating BufferedReader
		BufferedReader br=new BufferedReader(input);
		System.out.print("Enter your age : ");
		//reading input
		int i=Integer.parseInt(br.readLine());
		
		System.out.println("Your age is : "+ i);
		
		

	}

}
