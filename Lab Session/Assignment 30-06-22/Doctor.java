package labSession;

import java.util.*;
import java.io.*;

class Doctor
{
	//attributes
    private int doctorId;
    private String doctorName, location;
    //creating constructor

    Doctor(int i,String n,String l)
    {
        doctorId = i;
        doctorName = n;
        location = l;
    }
    
    //to display attributes

    public void getDetails()
    {
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Location: "+location);
    }
}