package corejava;

import java.util.Scanner;

public class InputArtOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//input two number from user
		System.out.println("enter first number : ");
		int num1=sc.nextInt();
		System.out.println("enter second number : ");
		int num2=sc.nextInt();
		//perform arithmetic operations
		int add,sub,mul,div,mod;
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		mod=num1%num2;
		div=num1/num2;
		//print result
		System.out.println("Addition is : "+add);
		System.out.println("Substraction is : "+sub);
		System.out.println("Multiplication is : "+mul);
		System.out.println("Division is : "+div);
		System.out.println("Modulo division is : "+mod);
		

	}

}
