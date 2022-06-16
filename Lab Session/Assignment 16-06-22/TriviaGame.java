/**
 * 
 */
package labSession;

/**
 * @author Rupesh
 *
 */
import java.util.Scanner;

public class TriviaGame {
	
	public static int[] points = {2,3,2,3,5};
	//creating string array to store answers.
	public static String[] answers = {
			"LOTUS",
			"TIGER",
			"HOCKEY",
			"DELHI",
			"PEACOCK"
	};
	//trivialMethod
	public static int triviaMethod(String[] questions, String[] stt) {
		
		int point=0;
		for(int i=0;i<5;i++) {
			System.out.println(questions[i]);
			System.out.println(stt[i]);
			//converting input string to UpperCase and comparing with answer
			if(stt[i].toUpperCase().equals(answers[i])) {
				System.out.println("Correct!");
				point+=points[i];
				System.out.println("");
			}
			else {
				System.out.println("Wrong answer");
				System.out.println("");
			}
		}
		return point;
			
	}
//main method
	public static void main(String[] args) {
		
		int point;
		Scanner sc = new Scanner(System.in);
		String[] stt=new String[5];
		//creating string array to store questions
		String[] questions = {
				"Question 1: What is the National Flower of INDIA?",
				"Question 2: What is the National Animal of INDIA?",
				"Question 3: What is the National Game of INDIA?",
				"Question 4: What is the capital of INDIA ?",
				"Question 5: What is the National Bird of INDIA ?",
				
		};
		
		for(int i=0;i<5;i++) {
			System.out.println(questions[i]);
			stt[i]=sc.nextLine();
		}
		//calling triviaMethod will return total points 
		point=triviaMethod(questions,stt);
		System.out.println("Final score: "+point);
		if(point==15)
		{
			System.out.println("Congrats! You are the winner");
		}
		else if(point>=12 && point<15)
		{
			System.out.println("Congrats! RunnerUp");
		}
		else
		{
			System.out.println("Better Luck Next Time");
		}
		
	}
}
