package labSession;

import java.io.*;

class Employee {
	 private long emp_id,emp_phone; 
	    private String emp_name,emp_address; 
	    private double basic_salary,special_allowance,house_rent_allowence;

	    Employee() 
	    {
	        emp_id = 0; 
	        emp_phone = 0; 
	        emp_name = ""; 
	emp_address=""; 
	    basic_salary=0.0; 
	    special_allowance=250.00; 
	    house_rent_allowence = 1000.50; 
	} 
	//Create an overloaded constructor in the employee class, which takes the below constructor parameters and initializes them to their respective instance variables
	Employee(long id,String n,String a,long p,double s) 
	{
	    emp_id = id; 
	    emp_phone = p; 
	    emp_name = n; 
	    emp_address=a; 
	    basic_salary=s; 
	    special_allowance=250.00; 
	    house_rent_allowence = 1000.50; 
	}

	public double getBasicSalary()
	{
	    return basic_salary;
	}
	//Create a method calculateSalary in which the basic salary needs to be calculated as below
	    public double calculateSalary()
	    {
	        double salary = basic_salary+(basic_salary*special_allowance*0.01)+(basic_salary* house_rent_allowence/100);
	        return salary;
	    }

	    public double calculateTransportAllowance()
	    {
	        return 0.01*basic_salary;
	    }
}
