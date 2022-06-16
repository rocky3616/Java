
package labSession;


import java.util.Scanner;
/**
 * @author Rupesh
 *
 */
public class ToyExample {
	//creating multiDimentional string array
	String[][] toys=new String[5][5];
	//creating constructor
	
	ToyExample()
	{
		 toys [0][0]="1";
		    toys[0][1]="Fire Truck";

		    toys [1][0]="2";
		    toys [1][1] ="CNG Auto Rickshaw";

		    toys [2][0]="3";
		    toys [2][1]="Eicher Tractor";

		    toys [3][0]="4";
		    toys [3][1]="Wooden Boogie Woogie Train";

		    toys [4][0]="5";
		    toys[4][1]="Dhruv Helicopter";

		
	}
	public static String getToy(int price)
    {
        String toyName;
        switch(price)
        {
            case 629: 
            	toyName = "Fire Truc";
                return toyName;
            
            case 169:
            	toyName = "CNG Auto Rickshaw";
                return toyName;
                
            case 409:
            	toyName = "Eicher Tractor";
                return toyName;
                
            case 975:
            	toyName = "Wooden Boogie Woogie Train";
                return toyName;
                
            case 1000:
            	toyName = "Dhruv Helicopter";
                return toyName;
             // When none of the cases is true, a default statement is used
            default:
            	toyName = "No Toys Available in this Range";
                return toyName;
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		//taking input from user
		System.out.print("Enter price of toy: ");
        int priceOfToy = sc.nextInt ();

        System.out.println(getToy(priceOfToy));
        //closing scanner object

        sc.close();
		

	}

}
