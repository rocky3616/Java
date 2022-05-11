package corejava;

import java.util.Scanner;

public class WhileLoopM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}

	}

}
